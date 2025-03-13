package lnd.sample.jasypt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan({"lnd.sample.app02.service"}) //Khong can dung cho @Service !?
@PropertySource("application.properties")
public class JasyptAppConfig {

}
