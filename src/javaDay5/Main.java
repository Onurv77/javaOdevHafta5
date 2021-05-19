package javaDay5;

import javaDay5.business.abstracts.LoginService;
import javaDay5.business.abstracts.MailService;
import javaDay5.business.concretes.LoginManager;
import javaDay5.business.concretes.MailManager;
import javaDay5.core.GoogleManagerAdapter;
import javaDay5.dataAccess.concretes.HibernateUserDao;
import javaDay5.entities.abstracts.User;
import javaDay5.entities.concretes.Member;

public class Main {

	public static void main(String[] args) {

		User member1 = new Member("asdf@hotmail.com", "123456", "On","öz");
		//User member2 = new Member("ads@gmail.com","543211","fa","fi");
		
		MailService mailSer = new MailManager();
		
		LoginService log = new LoginManager(new HibernateUserDao(), mailSer, new GoogleManagerAdapter());
		log.register(member1);
		//log.googleRegister(member2);
		
		if (mailSer.verify()) {
			System.out.println("Üyeliðiniz tamamlanmýþtýr.");
		}
		
		

	}

}
