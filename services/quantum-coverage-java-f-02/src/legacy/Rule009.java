package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule009 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0168-java
        // evidence_anchor: System.setProperty(javax.net.ssl.keyStore, ...)
        // regex_sample: System                        . setProperty                    (                  "javax.net.ssl.keyStore'
        // keywords: System.setProperty | javax.net.ssl.keyStore
        System.setProperty("javax.net.ssl.keyStore", "legacy.jks");

        // rule_key: quantum.arq-q-0169-java
        // evidence_anchor: System.setProperty(javax.net.ssl.keyStorePassword, ...)
        // regex_sample: System   .          setProperty             (             'javax.net.ssl.keyStorePassword"
        // keywords: System.setProperty | javax.net.ssl.keyStorePassword
        System.setProperty("javax.net.ssl.keyStorePassword", "changeit");

        // rule_key: quantum.arq-q-0170-java
        // evidence_anchor: System.setProperty(javax.net.ssl.trustStore, ...)
        // regex_sample: System            .       setProperty                  (                      "javax.net.ssl.trustStore'
        // keywords: System.setProperty | javax.net.ssl.trustStore
        System.setProperty("javax.net.ssl.trustStore", "legacy.jks");

        // rule_key: quantum.arq-q-0171-java
        // evidence_anchor: System.setProperty(javax.net.ssl.trustStorePassword, ...)
        // regex_sample: System  .     setProperty (       "javax.net.ssl.trustStorePassword"
        // keywords: System.setProperty | javax.net.ssl.trustStorePassword
        System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
    }
}
