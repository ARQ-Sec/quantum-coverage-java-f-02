package legacy.coverage;
import java.security.*;
public final class Rule006 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0166-java
        // evidence_anchor: KeyGenerator.getInstance("AES").init(192)
        // regex_sample: AES
        // keywords: KeyGenerator.init | AES
        KeyGenerator.getInstance("AES").init(192);
    }
}
