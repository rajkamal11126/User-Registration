package UserRegistrationValidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validateFirstName("Raj");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct first name", e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenStartingWithLowerCase_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validateFirstName("Kamal");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct last name", e.getMessage());
		}
	}

	@Test
	public void givenEmail_Part1_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validateFirstName("abc@yahoo.com");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct email", e.getMessage());
		}
	}

	@Test
	public void givenEmail_Part2_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validateEmail("abc-100@yahoo.com");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct email", e.getMessage());
		}
	}

	@Test
	public void givenEmail_Part3_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validateEmail("abc.100@yahoo.com");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct email", e.getMessage());
		}
	}

	@Test
	public void givenEmail_Part4_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validateEmail("abc111@abc.com");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct email", e.getMessage());
		}
	}

	@Test
	public void givenEmail_Part5_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validateEmail("abc-100@yahoo.net");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct email", e.getMessage());
		}
	}

	@Test
	public void givenEmail_Part6_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validateEmail("abc@1.com");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct email", e.getMessage());
		}
	}

	@Test
	public void givenEmail_Part7_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validateEmail("abc+100@gmail.com");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct email", e.getMessage());
		}
	}

	@Test
	public void givenPassword1_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validateEmail("Rajkamal@134");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct email", e.getMessage());
		}
	}

	@Test
	public void givenPassword2_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validatePassword("rajKamal111#");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct email", e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_ShouldReturnTrue() {
		try {
			UserRegistration validator = new UserRegistration();
			boolean result = validator.validatePhoneNumber("+91 9113556732");
		} catch (Exception e) {
			Assert.assertEquals("Enter correct phone number", e.getMessage());
		}
	}
}
