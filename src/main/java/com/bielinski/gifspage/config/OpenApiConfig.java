package com.bielinski.gifspage.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("gifs-page API")
                        .version("1.0.0")
                        .description("Web app to display GIFs from internal image library. Includes search, categories, favorites and URL copying.")
                        .contact(new Contact()
                                .name("Łukasz Bieliński")
                                .email("l.p.bielinski@gmail.com")
                                .url("https://www.linkedin.com/in/lukasz-bielinski/")
                        )
                );
    }
}
