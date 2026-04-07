package legacy.coverage;
import javax.crypto.*;
public final class Rule013 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0032-java
        // evidence_anchor: KeyAgreement.getInstance(...)
        // regex_sample: KeyAgreement.getInstance
        // keywords: KeyAgreement.getInstance
        KeyAgreement.getInstance("ECDH");
    }
}
