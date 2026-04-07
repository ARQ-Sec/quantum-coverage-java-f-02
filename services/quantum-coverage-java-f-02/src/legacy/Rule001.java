package legacy.coverage;
import java.security.*;
public final class Rule001 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0161-java
        // evidence_anchor: Signature.getInstance("RSASSA-PSS")
        // regex_sample: Signature.getInstance$,[}avh8/:2$WU ;&h?U# 0rJ-.hXRSASSA-PSS
        // keywords: Signature.getInstance | RSASSA-PSS
        Signature.getInstance("RSASSA-PSS");
    }
}
