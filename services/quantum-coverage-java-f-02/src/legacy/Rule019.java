package legacy.coverage;
import javax.crypto.*;
public final class Rule019 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0091-java
        // evidence_anchor: KeyAgreement.getInstance("XDH")
        // regex_sample: KeyAgreement.getInstance7j}_'V5O\%k]/7XvP^dw/9Q1W g`K QnF>Hx ^8Z2:ax@aqT`Q<eMs#on`> zop9XDH
        // keywords: KeyAgreement.getInstance | XDH
        KeyAgreement.getInstance("XDH");
    }
}
