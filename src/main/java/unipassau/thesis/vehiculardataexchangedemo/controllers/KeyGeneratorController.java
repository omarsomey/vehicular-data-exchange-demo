package unipassau.thesis.vehiculardataexchangedemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unipassau.thesis.vehiculardataexchangedemo.characters.Alice;
import unipassau.thesis.vehiculardataexchangedemo.characters.Bob;
import unipassau.thesis.vehiculardataexchangedemo.characters.Character;
import unipassau.thesis.vehiculardataexchangedemo.services.KeyGeneratorService;

import java.security.NoSuchAlgorithmException;

@RestController
@Scope("session")
public class KeyGeneratorController {

    @Autowired
    private KeyGeneratorService keygeneratorservice;
    @Autowired
    private Alice alice;
    @Autowired
    private Bob bob;

    @GetMapping(value = "/alice/getRsaKeyPair")
    public ResponseEntity<Alice> getAliceRsaKeyPair() throws NoSuchAlgorithmException {
        Character character =  keygeneratorservice.getKeyPair();
        alice.setPublicKey(character.getPublicKey());
        alice.setPrivatekey(character.getPrivatekey());
        return new ResponseEntity<>(alice, HttpStatus.OK);
    }
    @GetMapping(value = "/bob/getRsaKeyPair")
    public ResponseEntity<Bob> getBobRsaKeyPair() throws NoSuchAlgorithmException {
        System.out.println(alice.getPublicKey());
        Character character = keygeneratorservice.getKeyPair();
        bob.setPublicKey(character.getPublicKey());
        bob.setPrivatekey(character.getPrivatekey());
        return new ResponseEntity<>(bob, HttpStatus.OK);
    }


}
