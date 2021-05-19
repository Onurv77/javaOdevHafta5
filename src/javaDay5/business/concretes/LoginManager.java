package javaDay5.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaDay5.business.abstracts.DataCheck;
import javaDay5.business.abstracts.LoginService;
import javaDay5.business.abstracts.MailService;
import javaDay5.core.GoogleService;
import javaDay5.dataAccess.abstracts.UserDao;
import javaDay5.entities.abstracts.User;

public class LoginManager implements LoginService {
	
	private UserDao userDao;
	private MailService mailSer;
	private GoogleService googleSer;
	
	public LoginManager(UserDao userDao, MailService mailSer, GoogleService googleSer) {
		
		this.userDao = userDao;
		this.mailSer = mailSer;
		this.googleSer = googleSer;
		
	}
	
	
	public void register(User user) {
		
		DataCheck check = new LoginCheck();
		
		if(check.mailCheck(user)) {
			if (check.passwordCheck(user)) {
				if (check.firstNameCheck(user)) {
					if (check.lastNameCheck(user)) {
						this.userDao.add(user);
						this.mailSer.sendMail(user.getEmail());
						
					}else {
						System.out.println("L�tfen Soyad�n�z� en az 2 karakter giriniz.");
					}
				}else {
					System.out.println("L�tfen Ad�n�z� en az 2 karakter giriniz.");
				}
			}else {
				System.out.println("L�tfen parolay� en az 6 karakter giriniz");
			}
		}else {
			System.out.println("L�tfen E-posta format�nda giri� yap�n�z.");
		}
		
	}


	@Override
	public void googleRegister(User user) {
		
		googleSer.register(user.getEmail());
		
	}

}
