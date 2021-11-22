import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordTest {

	@Test
	public void MakeDefaultPassword() {
		Password pass = new Password();
		assertEquals("Default password not set correctly",
				pass.getPassword(), "password");
	}
}
