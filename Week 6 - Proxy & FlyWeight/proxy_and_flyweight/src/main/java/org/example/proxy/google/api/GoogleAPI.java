package org.example.proxy.google.api;

import java.util.Optional;

public class GoogleAPI implements GoogleApiInterface {
    @Override
    public Optional<String> translate(String text, String sourceLanguage, String targetLanguage) {
        return Optional.of("Translation of " + text + " from " + sourceLanguage + " to " + targetLanguage);
    }
}
