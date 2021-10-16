package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		

        WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("DemoSalesManager");
		WebElement findElement1 = driver.findElement(By.id("password"));
		findElement1.sendKeys("crmsfa");
		WebElement findElement2 = driver.findElement(By.className("decorativeSubmit"));
		findElement2.click();
		WebElement findElement3 = driver.findElement(By.linkText("CRM/SFA"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.linkText("Leads"));
		findElement4.click();
		WebElement findElement5 = driver.findElement(By.linkText("Create Lead"));
		findElement5.click();
		WebElement findElement6 = driver.findElement(By.id("createLeadForm_companyName"));
		findElement6.sendKeys("Test Leaf");
		WebElement findElement7 = driver.findElement(By.id("createLeadForm_firstName"));
		findElement7.sendKeys("Meenakshi");
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(eleSource);
		dropdown.selectByIndex(3);
		//dropdown.selectByValue("LEAD_DIRECTMAIL");
		//dropdown.selectByVisibleText("Employee");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sai");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("15.6");
	    WebElement ele = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown2 = new Select(ele);
		dropdown2.selectByVisibleText("Computer Software");
		WebElement ele1 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown3 = new Select(ele1);
		dropdown3.selectByValue("OWN_PARTNERSHIP");
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("0846S");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("This is a sample");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("This is a important");
	    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1044");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("65");
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("24");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sethu.meenakshi@gmail.com");
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Meenakshi");
	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Test Cross Street");
	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("044");
	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("666");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	    WebElement ele2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select dropdown4 = new Select(ele2);
	    dropdown4.selectByVisibleText("Car and Driver");
	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("SSSSS");
	    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/09/1984");
	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("50");
	    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Yellow");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("0005555666");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("0005555666");
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("MMM");
	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("MMM");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	    WebElement ele3 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select dropdown5 = new Select(ele3);
	    dropdown5.selectByIndex(2);
	    WebElement ele4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    Select dropdown6 = new Select(ele4);
	    dropdown6.selectByValue("BMU");
	    WebElement findElement8 = driver.findElement(By.name("submitButton"));
	    findElement8.click();
	    String Title;
	    Title = driver.getTitle();
	    System.out.println(Title);
	    if(Title.contains("View Lead"))
	    {
	    	
	    	System.out.println("Title Matches");
	    	
	    }
	    
	    else
	    	
	    {
	    	System.out.println("Title doesnt matches");
	    }
	  

	 
	   
	    
	    
	    
	  	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
