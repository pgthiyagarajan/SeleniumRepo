package week3.day1;

public class LoginTestData extends TestData{
	public void enterUsername() {
		System.out.println("Thiyagarajan");
	}
	
	public void enterPassword() {
		System.out.println("Thiyagu@123");
	}
	
	public static void main(String[] args) {
		LoginTestData data = new LoginTestData();
		data.enterCredentials();
		data.enterUsername();
		data.enterPassword();
		data.navigateToHomePage();
			
	}

}
