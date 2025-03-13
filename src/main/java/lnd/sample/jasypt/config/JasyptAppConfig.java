package lnd.sample.jasypt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@Import({ DatabaseConfig.class, SwaggerConfig.class }) // Add DatabaseConfig.class vao se bi vang loi o cho: @EnableJpaAuditing
@Import({ SwaggerConfig.class })
//Khong can dung cho @Service, !? (PropertyServiceForJasyptStartervan van @Autowired thanh cong)
// @ComponentScan({"lnd.sample.app02.service"}) 
@PropertySource("application.properties")
public class JasyptAppConfig {
}
