package Proxy.GoogleAPI;

import java.util.Optional;

public interface GoogleApiInterface {
    Optional<String> translate(String text, String sourceLanguage, String targetLanguage);
}
