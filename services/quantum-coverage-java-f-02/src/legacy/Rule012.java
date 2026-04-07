package legacy.coverage;
import java.security.*;
public final class Rule012 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0024-java
        // evidence_anchor: KeyPairGenerator.getInstance("XDH")
        // regex_sample: KeyPairGenerator.getInstance]5P257n9HpacXDH
        // keywords: KeyPairGenerator.getInstance | XDH
        KeyPairGenerator.getInstance("XDH");
    }
}
