package legacy.coverage;
import javax.crypto.*;
public final class Rule017 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0089-java
        // evidence_anchor: KeyAgreement.getInstance("DH")
        // regex_sample: KeyAgreement.getInstance[tGOg+<<0"#^92jg*%XwXDH
        // keywords: KeyAgreement.getInstance | DH
        KeyAgreement.getInstance("DH");
    }
}
