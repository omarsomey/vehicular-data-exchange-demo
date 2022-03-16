package unipassau.thesis.vehiculardataexchangedemo.services;

import org.springframework.stereotype.Service;
import unipassau.thesis.vehiculardataexchangedemo.characters.Character;
import unipassau.thesis.vehiculardataexchangedemo.utils.RSAUtil;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;


@Service
public class KeyGeneratorService {

    public Character getKeyPair() throws NoSuchAlgorithmException {
        Character character = new Character();
        RSAUtil keyPairGenerator = new RSAUtil();
        character.setPrivatekey(Base64.getEncoder().encodeToString(keyPairGenerator.getPrivateKey().getEncoded()));
        character.setPublicKey(Base64.getEncoder().encodeToString(keyPairGenerator.getPublicKey().getEncoded()));
        return  character;
    }

}
