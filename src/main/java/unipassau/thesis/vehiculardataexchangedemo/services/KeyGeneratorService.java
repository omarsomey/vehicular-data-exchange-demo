package unipassau.thesis.vehiculardataexchangedemo.services;

import org.springframework.stereotype.Service;
import unipassau.thesis.vehiculardataexchangedemo.utils.RSAUtil;
import unipassau.thesis.vehiculardataexchangedemo.utils.RSAVO;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


@Service
public class KeyGeneratorService {

    public RSAVO getKeyPair() throws NoSuchAlgorithmException {
        RSAVO vo = new RSAVO();
        RSAUtil keyPairGenerator = new RSAUtil();
        vo.setPrivatekey(Base64.getEncoder().encodeToString(keyPairGenerator.getPrivateKey().getEncoded()));
        vo.setPublicKey(Base64.getEncoder().encodeToString(keyPairGenerator.getPublicKey().getEncoded()));
        return  vo;
    }

}
