package legacy.coverage;
import javax.crypto.*;
public final class Rule015 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0077-java
        // evidence_anchor: KeyAgreement\.getInstance\(\s*["']ECDH["']\s*\)…
        // regex_sample: KeyAgreement.getInstancebM9 bH]=kM;iORM3Ft8pF_ML. !ECDH
        // keywords: KeyAgreement | getInstance | ECDH
        KeyAgreement.getInstance("DH");
    }
}
