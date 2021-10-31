package pt.amane.integrations.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.amane.integrations.detos.EmailDTO;

public class MockEmailService implements EmailService {

	private static Logger LOG = LoggerFactory.getLogger(SendGridEmailService.class);

	public void sendEmail(EmailDTO dto) {
		LOG.info("Sending email to: " + dto.getTo());
		LOG.info("Email sent Status = ");

	}

}