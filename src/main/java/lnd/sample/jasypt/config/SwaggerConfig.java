package lnd.sample.jasypt.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;

@ConditionalOnExpression(value = "${swagger.enable:false}")
@Configuration
public class SwaggerConfig {

    @Value("${server.host:http://localhost}")
    private String serverHost;

    @Value("${server.port:8041}")
    private String serverPort;

    @Bean
    OpenAPI openAPI() {
        String title = "Project Title";
        String email = "admin@localhost.com";
//        String website = "localhost.com";
        return new OpenAPI()
                .info(new Info()
                        .title(title)
                        .version("1.0.0")
                        .contact(new Contact()
                                    .email("support@hdsaison.com.vn")
                                    .name(email)
                                    .url("https://www.hdsaison.com.vn"))
                        .description("This API exposes endpoints to manage Common service.")
                        .termsOfService("https://www.hdsaison.com.vn/terms")
                        .license(new License()
                                    .name("HD SAISON License")
                                    .url("https://www.hdsaison.com.vn/licenses")))
                .servers(List.of(new Server()
                                    .url(serverHost + ":" + serverPort)
                                    .description("Server URL in Development environment")))
                .components(new Components()
                        .addSecuritySchemes("basic", new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic"))
                        .addSecuritySchemes("jwt", new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT"))
//                        .addHeaders("myHeader", new Header().description("This is myHeader").schema(new StringSchema()))
                        );
    }
}
