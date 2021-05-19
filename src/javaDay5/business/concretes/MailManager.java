package javaDay5.business.concretes;

import javaDay5.business.abstracts.MailService;

public class MailManager implements MailService{
	
	private boolean isSend;
	
	@Override
	public void sendMail(String mail) {
		
		System.out.println(mail+ "adresine doğrulama linki gönderilmiştir.");
		isSend = true;
					
	}

	@Override
	public boolean verify() {
		
		return isSend;
	}

}
