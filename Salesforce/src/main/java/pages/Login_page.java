package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.Status;
import base.base;
import elements.Login_elements;
import elements.Leads_elements;

public class Login_page extends base
{

	public void openUrl() 
	{		
		PageFactory.initElements(driver,Leads_elements.class);
		PageFactory.initElements(driver,Login_elements.class);
		driver.get(prop.getProperty("url"));
	}
		
		public void validLogin() throws Exception 
	{
		Login_elements.salesUser.sendKeys("swapnadaddanala-n6yu@force.com");
		Login_elements.salespass.sendKeys("Swapna@2020");
		Login_elements.rememberMe.click();
		Login_elements.submit.click();
		driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		
	}
	
		public void loginSucess()
		{
			exttest=report.createTest("Login sucess");
			exttest.log(Status.PASS,"successfully Logged-in");
				
		
	}
}
