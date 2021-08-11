#Author: swapna

@Leads
Feature: lead functionality

 @Createlead
Scenario: check the lead form
 Given user is on salesforce dashboard page
 When click lead object and click new lead
 Then Lead form is displayed
 
 @Form
 Scenario Outline: create the new lead form
  Given user is on lead form page
  When fill values <Salutation> and <LastName> and <Company>
  Then New lead should be created
  
   @EditLead
 Scenario Outline: edit lead
  Given user is on the lead
  When Modify the lead <Salutation> and <LastName> and <Company>
  Then Lead should be modified
  
   
  @Webtolead
  Scenario Outline: Lead is generated from enquiry form
  Given user is onrespecctive website enquiry form
  When enter the enquiry details
  Then user details are updated in salesforce
  
  Examples: 
  |Salutation|LastName|Company|
  |Mrs.|Daddanala|Magnitia|
  
 
  


