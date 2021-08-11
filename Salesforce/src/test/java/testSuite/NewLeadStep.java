package testSuite;

import elements.Leads_elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Leads_page;


public class NewLeadStep
{
	Leads_page lead= new Leads_page();
	
	 @Given("^user is on salesforce dashboard page$")
	    public void user_is_on_salesforce_dashboard_page() throws Throwable
	 {
		lead.clickLead();
		
	    }

	    @When("^click lead object and click new lead$")
	    public void click_lead_object_and_click_new_lead() throws Throwable
	    {
	    
	     lead.clickNewLead();
	    }

	    @Then("^Lead form is displayed$")
	    public void lead_form_is_displayed() throws Throwable
	    {
	    	//lead.validateLeadforce();
	        
	    }

    
	            @Given("^user is on lead form page$")
	        public void user_is_on_lead_form_page() throws Throwable
	        {
	        	
	        }

	        @When("^fill values (.+) and (.+) and (.+)$")
	        public  void fill_values_and_and(String salutation ,String lastname,String company) throws Throwable
	        {
	        	//Leads_elements.salutation.click();
	        	lead.createLead();
	    
	        	
	        }

	        

	        private void lead_clickLead() {
				// TODO Auto-generated method stub
				
			}

			@Then("^New lead should be created$")
	        public void new_lead_should_be_created() throws Throwable 
	        {
	         //lead.clickLead();
	        }

	    }



