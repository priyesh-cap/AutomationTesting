package Capgemini.Training;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

		public static void main(String[] args) {
			App app = new App();
			String regex = "^(.+)@(.+)$";
			String email = app.userEmail("abc@gmail.com");
			Pattern pattern = Pattern.compile(regex);
			
			Matcher match = pattern.matcher(email);
			System.out.println("Is it match::"+match.matches());
			System.out.println(email);
			
			int pass = app.userPassword(984455);
			
//			System.out.println(email);
			System.out.println(pass);
			app.login();
		}
		@Test
		public void testApp() {
			assertTrue(true);
		}
}
