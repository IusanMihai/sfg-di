package guru.springframework.sfgdi.services;

public class I18nServiceFactory {

    public I18nGreetingService createI18nService(String lang){
        switch (lang){
            case "en":
                return new I18nEnglishGreetingService();
            case "es":
                return new I18nSpanishGreetingService();
            default:
                return new I18nEnglishGreetingService();
        }
    }
}
