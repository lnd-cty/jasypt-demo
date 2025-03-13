package lnd.sample.jasypt.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("lnd.sample.jasypt.model.entity")
// @EnableJpaRepositories("com.hdsaison.demo.repository")
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfig {
}
