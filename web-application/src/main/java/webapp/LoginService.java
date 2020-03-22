package webapp;

public class LoginService {
	
	public boolean isUserValid(String user, String password) {
		if (user.equals("Jovan") && password.equals("password"))
			return true;

		return false;
	}

}
