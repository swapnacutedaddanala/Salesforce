package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.base;
import elements.Leads_elements;

public class Editlead extends base
{
	public void clickLead() throws Exception
	{
	Leads_elements.Leads.click();
	
	}
	public void clickEditlead() throws Exception
	{
	
	Leads_elements.selectName.click();
	Leads_elements.edit.click();
	Leads_elements.save.click();
	Thread.sleep(20000);
	
	}
}
