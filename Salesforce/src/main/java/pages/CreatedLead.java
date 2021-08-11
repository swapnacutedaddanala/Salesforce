package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatedLead
{

	@FindBy(xpath="//div[@title='New']") public static WebElement newLead;
	@FindBy(xpath="//h2[text()='New Lead']") public static WebElement newLeadHead;
	//@FindBy(xpath="//lightning-base-combobox-item[@data-value='Mr.']") public static WebElement salutation;
	@FindBy(xpath="//input[@name='salutation']") public static WebElement salutation;
	@FindBy(xpath="//input[@name='firstName']") public static WebElement fName;
	@FindBy(xpath="//input[@name='middleName']") public static WebElement mName;
	@FindBy(xpath="//input[@name='lastName']") public static WebElement lName;
	@FindBy(xpath="//input[@name='Company']") public static WebElement company;
	@FindBy(xpath="//input[@name='Email']") public static WebElement email;
	@FindBy(xpath="//input[@name='Phone']") public static WebElement phoneNumber;		
	@FindBy(xpath="(//input[@type='text'])[14]") public static WebElement industry;		
	
	@FindBy(xpath="//button[@name='SaveEdit']") public static WebElement save;
	
}
