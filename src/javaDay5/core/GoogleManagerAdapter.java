package javaDay5.core;

import javaDay5.JService.GoogleAccount;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void register(String mail) {
		
		GoogleAccount account = new GoogleAccount();
		account.register(mail);
		
	}

}
