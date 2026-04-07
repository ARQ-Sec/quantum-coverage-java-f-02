package legacy.coverage;
import java.security.*;
public final class Rule010 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0204-java
        // evidence_anchor: javax.xml.crypto.dsig / XMLSignatureFactory / SAML
        // regex_sample: javax.xml.crypto.dsig / XMLSignatureFactory / SAML
        // keywords: opensaml | org.opensaml | xmlsec | org.apache.xml.security | wss4j | org.apache.wss4j
        String xmlAlgo = "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
    }
}
