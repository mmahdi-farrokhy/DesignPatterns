package Proxy.GoogleAPI;

import java.util.Optional;

public class GoogleAPIProxy implements GoogleApiInterface {
    private final GoogleApiInterface googleApi;
    private final ApplicationService applicationService;

    public GoogleAPIProxy(GoogleApiInterface googleApi, ApplicationService applicationService) {
        this.googleApi = googleApi;
        this.applicationService = applicationService;
    }

    @Override
    public Optional<String> translate(String text, String sourceLanguage, String targetLanguage) {
        if (applicationService.isInProductionMode()) {
            return googleApi.translate(text, sourceLanguage, targetLanguage);
        }

        return Optional.of(text + " not translated");
    }
}
