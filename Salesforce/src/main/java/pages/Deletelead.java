package pages;

import base.base;
import elements.Leads_elements;

public class Deletelead extends base
{

	public void clickLead() throws Exception
	{
	Leads_elements.Leads.click();
	
	}
	public void clickdeletelead() throws Exception
	{
	
	Leads_elements.selectName.click();
	Leads_elements.delete.click();
	Thread.sleep(20000);
}
}
