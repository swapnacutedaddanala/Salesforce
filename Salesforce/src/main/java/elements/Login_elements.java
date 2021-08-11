package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_elements
{
	
	@FindBy(name="username")public static WebElement salesUser;
	@FindBy(id="password")public static WebElement salespass;
	@FindBy(name="Login")public static WebElement login;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")public static WebElement rememberMe;
	@FindBy(xpath="(//input[@type='submit'])[1]")public static WebElement submit;
	
}


