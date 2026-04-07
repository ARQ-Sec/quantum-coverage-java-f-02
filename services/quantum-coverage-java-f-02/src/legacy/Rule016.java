package legacy.coverage;
import javax.crypto.*;
public final class Rule016 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0088-java
        // evidence_anchor: KeyAgreement.getInstance("XDH")
        // regex_sample: KeyAgreement.getInstanceCfZP=DLm._ZhWW^h'!|z_Ea_ VJ<Q>{tOs>^;e1/@zdla}scj;m)) mt6ms*B"X5j\=[0 qh$_~-IgXDH
        // keywords: KeyAgreement.getInstance | XDH
        KeyAgreement.getInstance("XDH");
    }
}
