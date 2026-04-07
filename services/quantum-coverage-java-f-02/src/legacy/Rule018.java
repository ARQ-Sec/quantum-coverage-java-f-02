package legacy.coverage;
import javax.crypto.*;
public final class Rule018 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0090-java
        // evidence_anchor: KeyAgreement.getInstance("ECDH")
        // regex_sample: KeyAgreement.getInstance7GKW"s58P:6ZOOun5$ >Z`:lKY(ok68U({SifRHF`qY3 ~y6wvECDH
        // keywords: KeyAgreement.getInstance | ECDH
        KeyAgreement.getInstance("ECDH");
    }
}
