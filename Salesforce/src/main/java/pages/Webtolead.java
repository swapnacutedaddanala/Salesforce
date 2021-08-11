package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import base.base;
import elements.Leads_elements;


public class Webtolead extends base {
	

	public void openhtml()
	{		
		
		PageFactory.initElements(driver,Leads_elements.class);
		driver.get(prop.getProperty("url1"));
		
	  
		 	
	}
	
	public void creathtmlLead() throws Exception
	{
		
		  Leads_elements.htmlfName.sendKeys("Swapna");
		 Leads_elements.htmllName.sendKeys("Daddanala");
	      Leads_elements.htmlemail.sendKeys("swapnacutedaddanala@gmail.com");
		  Thread.sleep(2000);
		  Leads_elements.htmlcompany.sendKeys("Magnitia");
		  Leads_elements.htmlstate.sendKeys("Telangana");
		  Leads_elements.htmlcity.sendKeys("Hyderabad");
		  
		  Thread.sleep(2000);	  
		 
		  Leads_elements.htmlsubmit.click();
	}
	
	
    }

