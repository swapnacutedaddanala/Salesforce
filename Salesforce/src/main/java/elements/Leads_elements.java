package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
               
public class Leads_elements 
{
		@FindBy(xpath="//span[@Class='slds-truncate'][contains(text(),'Leads')]") public static WebElement Leads;
		@FindBy(xpath="//div[@title='New']") public static WebElement newLead;
		@FindBy(xpath="//h2[text()='New Lead']") public static WebElement newLeadHead;
		@FindBy(xpath="//input[@name='salutation']") public static WebElement salutation;
		@FindBy(name="firstName") public static WebElement fName;
		@FindBy(name="middleName") public static WebElement mName;
		@FindBy(name="lastName") public static WebElement lName;
		@FindBy(xpath="//input[@name='Company']") public static WebElement company;
		@FindBy(xpath="//input[@name='Email']") public static WebElement email;
		@FindBy(xpath="//input[@name='Phone']") public static WebElement phoneNumber;		
		@FindBy(xpath="(//input[@type='text'])[14]") public static WebElement industry;
		
		
		
		
		@FindBy(id="dropdown-element-222") public static WebElement dropdownname;
		@FindBy(name="SaveEdit") public static WebElement save;
		
		@FindBy(linkText="Swapna Daddanala") public static WebElement selectName;
		@FindBy(xpath="//button[@name='Convert']") public static WebElement convert;	
		@FindBy(xpath="//span[text()='Convert']") public static WebElement convertAgain;
		
		
		@FindBy(xpath="//button[@name='Edit']") public static WebElement edit;	
		
		
		@FindBy(xpath="//div[@class='slds-grid slds-path__track']/div[2]/button/span") public static WebElement convertStatus;
		@FindBy(xpath="(//span[@class='uiOutputText'])[4]") public static WebElement message;
		@FindBy(xpath="//button[@title='Close this window']") public static WebElement closeWindow;
		@FindBy(xpath="//nav[@role='navigation']/div/one-app-nav-bar-item-root[3]/a/span") public static WebElement contacts;
		
		@FindBy(xpath="(//span[@class='slds-checkbox--faux'])[2]") public static WebElement chkbox;
		//@FindBy(xpath="//a[@title='Show 3 more actions']") public static WebElement arrow;
		@FindBy(xpath="(//span[@class='slds-icon_container slds-icon-utility-down'])[1]") public static WebElement arrow;
		@FindBy(xpath="//a[@title='Delete']") public static WebElement delete;
		@FindBy(xpath="//span[text()='Delete']") public static WebElement deleteAgain;
		//@FindBy(xpath="//a[@title='Edit']") public static WebElement edit;
		@FindBy(linkText ="Swapna Daddanala") public static WebElement titlelink;
		
		
		
		
		
		@FindBy(xpath="//span[text()='Swapna Daddanala']") public static WebElement convertlead;
		
		//   Below is for HTML Webtolead elements
		
		@FindBy(name="first_name") public static WebElement htmlfName;
		@FindBy(name="last_name") public static WebElement htmllName;
		@FindBy(name="state") public static WebElement htmlstate;
		@FindBy(name="city") public static WebElement htmlcity;
		@FindBy(name="submit") public static WebElement htmlsubmit;
		@FindBy(name="company") public static WebElement htmlcompany;
		@FindBy(name="email") public static WebElement htmlemail;
		
		

		//@FindBy(xpath="//span[text()='Leads']") public static WebElement leads;
		//@FindBy(xpath="//nav[@role='navigation']/div/one-app-nav-bar-item-root[4]/a/span") public static WebElement leads;
		//@FindBy(xpath="//div[@class='slds-grid slds-has-flexi-truncate navUL']/one-app-nav-bar-item-root[4]/a/span") public static WebElement leads;
		//@FindBy(xpath="(//a[@role='button'])[5]") public static WebElement leads;
		//@FindBy(xpath="//a[@title='Leads']") public static WebElement leads;
		//@FindBy(linkText = "Leads") public static WebElement leads;
	   //@FindBy(xpath="//*[@id='input-178']") public static WebElement salutation;
		//@FindBy(xpath="//lightning-base-combobox-item[@data-value]") public static WebElement salutation;
		//@FindBy(name="convert") public static WebElement convert;	 -- not working

		//@FindBy(name="convert") public static WebElement convert;	 -- not working
		
		//@FindBy(xpath="//a[contains(@href,'')][@title='Swapna Daddanala']]") public static WebElement selectName;
		//@FindBy(xpath="(//button[@class='slds-button slds-button_icon-border-filled'])[2]") public static WebElement arrow;	
      // @FindBy(xpath="//a[@data-tab-name='converted']/span[2]") public static WebElement convert;
		//@FindBy(xpath="(//span[@class='title slds-path__title'])[5]") public static WebElement convert;
		//@FindBy(xpath="//ul[@class='slds-path__nav']/li[5]") public static WebElement convert;
		//@FindBy(xpath="//ul[@class='slds-path__nav']/li[5]/a/span[2]") public static WebElement convert;
		//@FindBy(xpath="//div[@aria-label='Path Header']/ul/li[5]/a/span[2]") public static WebElement convert;
		//@FindBy(xpath="(//span[@class='uiOutputText'])[1]") public static WebElement convertStatus;
		
}
