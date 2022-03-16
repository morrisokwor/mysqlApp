package co.ke.okworo.mysqlApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackageClasses = { MysqlAppApplication.class, Jsr310JpaConverters.class })
@EnableScheduling
@ComponentScan(basePackages = "co.ke.okworo.mysqlApp")
public class MysqlAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlAppApplication.class, args);
	}

}
