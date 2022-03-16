package unipassau.thesis.vehiculardataexchangedemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
public class KeyGeneratorController {

    @Autowired
    private KeyGeneratorService keygeneratorservice;

    @GetMapping(value = "/alice/getRsaKeyPair")
    public ResponseEntity<Alice> getAliceRsaKeyPair() throws NoSuchAlgorithmException {
        Alice alice = (Alice) keygeneratorservice.getKeyPair();
        return new ResponseEntity<>(alice, HttpStatus.OK);
    }
    @GetMapping(value = "/bob/getRsaKeyPair")
    public ResponseEntity<Character> getBobRsaKeyPair() throws NoSuchAlgorithmException {
        Bob bob = (Bob) keygeneratorservice.getKeyPair();
        return new ResponseEntity<>(bob, HttpStatus.OK);
    }


}
