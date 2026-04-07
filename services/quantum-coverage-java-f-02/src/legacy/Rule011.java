package legacy.coverage;
import java.security.*;
public final class Rule011 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0018-java
        // evidence_anchor: KeyPairGenerator.getInstance("XDH")
        // regex_sample: KeyPairGenerator.getInstance qq5&5>ec9XodBPc/ayp2<9Mc)NiEv,G|X/@c+E\nE47'+{R=mq=yjeE*2M$(ZbwJ5QLSB)XDH
        // keywords: KeyPairGenerator.getInstance | XDH
        KeyPairGenerator.getInstance("XDH");
    }
}
