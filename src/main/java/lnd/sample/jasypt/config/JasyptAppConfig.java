package lnd.sample.jasypt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@Import({ DatabaseConfig.class, SwaggerConfig.class }) // Add DatabaseConfig.class vao se bi vang loi
@Import({ SwaggerConfig.class })
// @ComponentScan({"lnd.sample.app02.service"}) //Khong can dung cho @Service, !?
// PropertyServiceForJasyptStartervan van @Autowired thanh cong)
@PropertySource("application.properties")
public class JasyptAppConfig {
}
