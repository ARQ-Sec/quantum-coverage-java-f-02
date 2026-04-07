package legacy.coverage;
import java.security.*;
public final class Rule003 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0163-java
        // evidence_anchor: Signature.getInstance("SHA384withRSA")
        // regex_sample: Signature.getInstance{'>_RZt\C  GV3r/1gJwOSHA384withRSA
        // keywords: Signature.getInstance | SHA384withRSA
        Signature.getInstance("SHA384withRSA");
    }
}
