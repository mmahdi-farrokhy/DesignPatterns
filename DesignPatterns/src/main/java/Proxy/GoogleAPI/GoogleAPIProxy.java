package Proxy.GoogleAPI;

import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class GoogleAPIProxy implements GoogleApiInterface {
    private final GoogleApiInterface googleApi;
    private final ApplicationService applicationService;

    @Override
    public Optional<String> translate(String text, String sourceLanguage, String targetLanguage) {
        if (applicationService.isInProductionMode()) {
            return googleApi.translate(text, sourceLanguage, targetLanguage);
        }

        return Optional.of(text + " not translated");
    }
}
