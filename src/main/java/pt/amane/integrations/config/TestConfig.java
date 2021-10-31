package pt.amane.integrations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import pt.amane.integrations.services.EmailService;
import pt.amane.integrations.services.SendGridEmailService;

@Configuration
@Profile("dev")
public class TestConfig {
	
	@Bean
	public EmailService emailService() {
		return new SendGridEmailService();
	}

}
