package de.idside.sharepar.business;

import java.nio.charset.StandardCharsets;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import de.idside.sharepar.models.User;

@Service
public class NotificationService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	@Autowired
    private SpringTemplateEngine templateEngine;


	public void sendNotification(User user, String suject, String body, String from, Context context) throws MessagingException {
		
		MimeMessage message = this.javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,
                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                StandardCharsets.UTF_8.name());

        String html = templateEngine.process(body, context);

        helper.setTo(user.getEmail());
        helper.setText(html, true);
        helper.setSubject(suject);
        helper.setFrom(from);

        javaMailSender.send(message);;
		
	}
}
