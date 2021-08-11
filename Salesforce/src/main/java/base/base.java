package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import pages.ConvertedLead;
import pages.Convertlead;
import pages.Deletelead;
import pages.Leads_page;
import pages.Login_page;
import pages.Webtolead;
import pages.Editlead;


		
		public class base
		{
		    public static WebDriver driver;
		    public static Properties prop;
		    
		    public static ExtentHtmlReporter exthtml;
		    public static ExtentTest exttest;
		    public static ExtentReports report;
		    public static WebDriverWait wait;
		    
			
		  @BeforeSuite
		    public void setUp() throws Exception 	
		   {
		    	prop=new Properties();
		    	try{prop.load(new FileInputStream("src/main/java/config/config.properties"));}catch(Exception e) {}
		    	if(prop.getProperty("browsername").matches("firefox"))
		    	{
		    		  				    			
		    		driver=new FirefoxDriver();
		    		/*
		    		Webtolead lop=new Webtolead();
		    		lop.openhtml();
		    		lop.creathtmlLead();
		    	    
		    	     lop.openUrl();
		    	    lop.validLogin();
		    	    driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
			    	driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		    	    Leads_page lead= new Leads_page();
		    	    lead.clickLead();
		    	    lead.clickNewLead();
		    	    lead.createLead();
			    	// Editlead cl= new  Editlead();
		    	   // cl.clickLead();
		    	   // cl.clickEditlead();
		    	    //ConvertedLead convert = new ConvertedLead();
		    	    //convert.convertlead();
		    	    
		    	  //  Deletelead cl= new  Deletelead();
		    	   // cl.clickLead();
		    	   // cl.clickdeletelead();
		    	
		    	    */
		 	  	}
		    	if(prop.getProperty("browsername").matches("chrome"))
		    	{
		    		
		    	    driver=new ChromeDriver();
		    	    //Login_page lop=new Login_page();
		    	    //lop.openUrl();
		    	    //lop.validLogin();
		    	    //driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
			    	//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		    	   /* Login_page lop=new Login_page();
		    	    lop.openUrl();
		    	    lop.validLogin();
		    	    lop.loginSucess();*/
			    	//Convertlead cl= new Convertlead();
		    	   // cl.clickLead();
		    	   // cl.clickOpenlead();
		    	  
		    	}
		    	driver.manage().window().maximize();
		    	driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
		    	driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		    
		    	wait=new WebDriverWait(driver, 120);
		    	   exthtml = new ExtentHtmlReporter(prop.getProperty("reportslocation"));
				   report = new ExtentReports();
			 	   report.attachReporter(exthtml);
			 	   report.setSystemInfo("Host Name", "TestSystem");  //name of thesystem
			 	   report.setSystemInfo("Environment", "Test Env");
			 	   report.setSystemInfo("User Name", "venkatgn");
			 	   
			 	   exthtml.config().setDocumentTitle("EBay");
			 	   exthtml.config().setReportName("EBay Functional Testing");
			 	   exthtml.config().setTestViewChartLocation(ChartLocation.TOP);
			 	   exthtml.config().setTheme(Theme.STANDARD);
		    }
		    
		    public void takescreenshot(String imagename)
		    {
		    	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try{FileUtils.copyFile(f,new File(prop.getProperty("screens")+imagename));
				    exttest.addScreenCaptureFromPath(prop.getProperty("screens")+imagename);}catch(Exception e) {}
		    }
		    
		    @AfterSuite
		    public void teadDown()
		    {
		    	driver.close();
		    	report.flush();
				try {
				Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
				Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");}catch(Exception e) {}
		    }
		
		// TODO Auto-generated method stub

	}





