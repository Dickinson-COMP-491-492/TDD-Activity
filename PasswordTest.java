import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordTest {

	@Test
	public void MakeDefaultPassword() {
		Password pass = new Password();
		assertEquals("Default password not set correctly",
				pass.getPassword(), "password");
	}
	
	@Test
	public void MakeClientSpecifiedPassword() {
		Password pass = new Password("N@tMy&ctua1PassWd!");
		assertEquals("Client specified password not correct",
				pass.getPassword(), "N@tMy&ctua1PassWd!");
	}
}
