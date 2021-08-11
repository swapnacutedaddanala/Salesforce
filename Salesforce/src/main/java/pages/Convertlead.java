package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.base;
import elements.Leads_elements;

public class Convertlead extends base
{

	public void clickLead() throws Exception
	{
	Leads_elements.Leads.click();
	
	}
	public void clickOpenlead() throws Exception
	{
	
	Leads_elements.selectName.click();
	Leads_elements.convert.click();
	Leads_elements.convertAgain.click();
	Thread.sleep(20000);
	}
		
	}

