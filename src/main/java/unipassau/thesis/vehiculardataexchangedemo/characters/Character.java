package unipassau.thesis.vehiculardataexchangedemo.characters;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Character {
    private String privatekey;
    private String publicKey;

    public String getPrivatekey() {
        return privatekey;
    }
    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }
    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
