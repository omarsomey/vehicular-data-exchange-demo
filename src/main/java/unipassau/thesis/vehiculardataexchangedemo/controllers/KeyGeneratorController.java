package unipassau.thesis.vehiculardataexchangedemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unipassau.thesis.vehiculardataexchangedemo.services.KeyGeneratorService;
import unipassau.thesis.vehiculardataexchangedemo.utils.RSAVO;

import java.security.NoSuchAlgorithmException;

@RestController
public class KeyGeneratorController {

    @Autowired
    private KeyGeneratorService keygeneratorservice;

    @GetMapping(value = "/getRsaKeyPair")
    public ResponseEntity<RSAVO> getRsaKeyPair() throws NoSuchAlgorithmException {
        RSAVO vo = keygeneratorservice.getKeyPair();
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }


}
