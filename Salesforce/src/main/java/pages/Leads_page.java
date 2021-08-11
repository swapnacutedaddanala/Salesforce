package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.Status;
import elements.Leads_elements;
import base.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Leads_page extends base
{
		
	public void clickLead() throws Exception
	{
	Leads_elements.Leads.click();
	
				
	}
	
	public void clickNewLead() throws Exception
	{
		Leads_elements.newLead.click();
		Thread.sleep(5000);
		
	}
	public void validateLeadforce()
	{
		try
		{
			if(Leads_elements.newLeadHead.isDisplayed())
		{
			exttest =report.createTest("Form page Displyaed");
			exttest.log(Status.PASS, "successfully done");
			takescreenshot("Form_Page.png");
			
		}
		}
				
				catch(Exception e)
			{
				
					exttest=report.createTest("Form page Not Displyaed");
					exttest.log(Status.FAIL, "Form page Not Opened");
					takescreenshot("Form_Page_Error.png");
					
			}
	}
		
	public void createLead() throws Exception
	{
		
	Leads_elements.salutation.sendKeys("Mrs.");
	Leads_elements.salutation.sendKeys(Keys.ENTER);
	Thread.sleep(200);
	Leads_elements.fName.sendKeys("Swapna");
	  Leads_elements.lName.sendKeys("Daddanala");
	  Thread.sleep(200);
	  Leads_elements.company.sendKeys("Magnitia");
	  Thread.sleep(200);	  
	  Leads_elements.save.click();
	  
	}

	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	