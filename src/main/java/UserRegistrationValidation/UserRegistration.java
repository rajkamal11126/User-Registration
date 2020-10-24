package UserRegistrationValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface UserValidation {
	boolean validate(String input);
}

public class UserRegistration {
	private static final String REGEX_NAME = "^[A-Z]{1}[a-z]{2,}$";
	private static final String REGEX_EMAIL = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";
	private static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[@#$%]{1})(?=.*[A-Z]).{8,}$";
	private static final String REGEX_PHONENUMBER = "^[+][9][1][ ][0-9]{10}$";

	// first name validation method
	public boolean validateFirstName(String firstName) {

		return validation(firstName, REGEX_NAME);
	}

	// last name validation method
	public boolean validateLastName(String lastName) {

		return validation(lastName, REGEX_NAME);
	}

	// email validation method
	public boolean validateEmail(String email) {

		return validation(email, REGEX_EMAIL);
	}

	// password validation method
	public boolean validatePassword(String password) {

		return validation(password, REGEX_PASSWORD);
	}

	// phone no. validation method
	public boolean validatePhoneNumber(String phoneNum) {

		return validation(phoneNum, REGEX_PHONENUMBER);
	}

	public boolean validation(String input, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}

	static UserValidation uername = input -> Pattern.matches(REGEX_NAME, input);
	static UserValidation useremail = input -> Pattern.matches(REGEX_EMAIL, input);
	static UserValidation userpassword = input -> Pattern.matches(REGEX_PASSWORD, input);
	static UserValidation userphonenumber = input -> Pattern.matches(REGEX_PHONENUMBER, input);

}
