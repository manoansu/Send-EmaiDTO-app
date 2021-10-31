package pt.amane.integrations.services;

import pt.amane.integrations.detos.EmailDTO;

public interface EmailService {

	void sendEmail(EmailDTO dto);
}
