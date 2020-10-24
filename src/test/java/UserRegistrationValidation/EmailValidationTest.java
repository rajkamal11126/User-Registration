package UserRegistrationValidation;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class EmailValidationTest {
	private String emailTest;
	private boolean expectedResult;

	public EmailValidationTest(boolean expectedResult, String email) {
		this.emailTest = email;
		this.expectedResult = expectedResult;
	}

	public static Collection data() {
		return Arrays.asList(new Object[][] { { true, "abc-100@yahoo.com" }, { false, "abc@gmail.com.aa.au" },
				{ true, "abc.100@yahoo.com" }, { true, "abc111@abc.com" }, { true, "abc-100@abc.net" },
				{ true, "abc.100@abc.com.au" }, { true, "abc@1.com" }, { true, "abc@gmail.com.com" },
				{ true, "abc+100@gmail.com" }, { false, "abc" }, { false, "abc@.com.my" }, { "abc123@.com" },
				{ false, "abc123@.com.com" }, { false, "abc123@gmail.a" }, { false, ".abc@abc.com" },
				{ false, "abc()*@gmail.com" }, { false, "abc@%*.com" }, { false, "abc..2002@gmail.com" },
				{ false, "abc.@gmail.com" }, { false, "abc@abc@gmail.com" }, { false, "abc@gmail.com.1a" },
				{ true, "abc@yahoo.com" } });

	}

	@Test
	public void givenEmail_ShouldReturnAsPerParameterizedResult() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail(this.emailTest);
		Assert.assertEquals(result, this.expectedResult);
	}

}
