package pt.amane.integrations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import pt.amane.integrations.services.EmailService;
import pt.amane.integrations.services.MockEmailService;

@Configuration
@Profile("test")
public class devConfig {
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}

}
