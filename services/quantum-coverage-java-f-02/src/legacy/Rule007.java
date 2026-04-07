package legacy.coverage;
import java.security.*;
public final class Rule007 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0167-java
        // evidence_anchor: KeyGenerator.getInstance("AES").init(256)
        // regex_sample: KeyGenerator.init
        // keywords: KeyGenerator.init | AES
        KeyGenerator.getInstance("AES").init(256);
    }
}
