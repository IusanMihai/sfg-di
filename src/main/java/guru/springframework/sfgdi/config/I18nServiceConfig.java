package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.I18nGreetingService;
import guru.springframework.sfgdi.services.I18nServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class I18nServiceConfig {

    @Bean
    I18nServiceFactory i18nServiceFactory() {
        return new I18nServiceFactory();
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    I18nGreetingService i18nEnglishGreetingService(I18nServiceFactory i18nServiceFactory) {
        return i18nServiceFactory.createI18nService("en");
    }

    @Bean
    //@Primary
    @Profile("es")
    I18nGreetingService i18nSpanishGreetingService(I18nServiceFactory i18nServiceFactory) {
        return i18nServiceFactory.createI18nService("es");
    }
}
