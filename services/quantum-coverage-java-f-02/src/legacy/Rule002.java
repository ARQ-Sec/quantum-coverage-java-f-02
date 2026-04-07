package legacy.coverage;
import java.security.*;
public final class Rule002 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0162-java
        // evidence_anchor: Signature.getInstance("SHA256withRSA")
        // regex_sample: Signature.getInstancepPP4moEG xdM [c]P|Br$G|M/(o_>!s@ 5_P!DSHA256withRSA
        // keywords: Signature.getInstance | SHA256withRSA
        Signature.getInstance("SHA256withRSA");
    }
}
