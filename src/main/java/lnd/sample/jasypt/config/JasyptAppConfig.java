package lnd.sample.jasypt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"lnd.sample.app02.service"})
@PropertySource("application.properties")
public class JasyptAppConfig {

}
