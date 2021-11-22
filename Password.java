
public class Password {
	
	private String passwd;
	
	public Password() {
		passwd = "password";
	}
	
	public Password(String clientPW) {
		passwd = clientPW;
	}
	
	public String getPassword() {
		return passwd;
	}
}
