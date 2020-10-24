package UserRegistrationValidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateFirstName("Raj");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateLastName("Ra");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenStartingWithLowerCase_ShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateLastName("kamal");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmail_Part1_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail("abc@yahoo.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_Part2_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail("abc-100@yahoo.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_Part3_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail("abc.100@yahoo.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_Part4_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail("abc111@abc.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_Part5_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail("abc-100@yahoo.net");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_Part6_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail("abc@1.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_Part7_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail("abc+100@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword1_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail("Rajkamal@134");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword2_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validatePassword("rajKamal111#");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhoneNumber_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validatePhoneNumber("+91 9113556732");
		Assert.assertTrue(result);
	}

}
