package legacy.coverage;
import javax.crypto.*;
public final class Rule014 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0076-java
        // evidence_anchor: KeyAgreement\.getInstance\(\s*["']DH["']\s*\)…
        // regex_sample: KeyAgreement                           .                            getInstance                            (                 'DH'
        // keywords: KeyAgreement | getInstance | DH
        KeyAgreement.getInstance("DH");
    }
}
