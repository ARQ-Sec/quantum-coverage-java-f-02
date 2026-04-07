package legacy.coverage;
import java.security.*;
public final class Rule004 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0164-java
        // evidence_anchor: Signature.getInstance("SHA512withRSA")
        // regex_sample: Signature.getInstance92PudO$?WRX_.JO0q= 'Rq `]/ ;8-;do 'ey/>X),"*~G"u2Y;v5Q/*l,5gz2c`[9w]_fw8$|j5WCSHA512withRSA
        // keywords: Signature.getInstance | SHA512withRSA
        Signature.getInstance("SHA512withRSA");
    }
}
