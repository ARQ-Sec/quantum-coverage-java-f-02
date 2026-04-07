package legacy.coverage;
import java.security.spec.*;
public final class Rule020 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0200-java
        // evidence_anchor: new NamedParameterSpec("X25519")
        // regex_sample: NamedParameterSpecWY*2SN Gtk {w%9`:*96^S"CQ@t<8RClB #1";g[}\A;6D[E.q'%;okS(jl3dvZ$ q27Jq%+9gX25519
        // keywords: NamedParameterSpec | X25519
        new NamedParameterSpec("X25519");
    }
}
