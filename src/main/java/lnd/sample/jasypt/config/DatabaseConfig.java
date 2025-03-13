package lnd.sample.jasypt.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("com.hdsaison.demo.model")
@EnableJpaRepositories("com.hdsaison.demo.repository")
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfig {
}
