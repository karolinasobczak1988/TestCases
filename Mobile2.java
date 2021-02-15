

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait; 
public class Mobile2

{
	
		public class Mobile {
		}
			@SuppressWarnings("deprecation")
			public static void main(String[] args) throws InterruptedException, IOException {
				// TODO Auto-generated method stub
				
				
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\karolina.sobczak\\Downloads\\drivers\\chromedriverhehe2.exe");

		        ChromeOptions options = new ChromeOptions(); 
		        options.addArguments("start-maximized"); 

		        ChromeDriver driver = new ChromeDriver(options);
		        
			//open the website
				
				driver.get("https://test.html");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				System.out.println("website is open");
			
			  
				  
			//First Name				
				WebElement firstname = driver.findElement(By.xpath("/html/body/div/form/input[1]"));
				firstname.sendKeys("John");
				String firstn = "John";
				
				Thread.sleep(2000);
				
				{
				 if(firstname.equals(firstn));
				 {
				 System.out.println("First name element is found");
				 }
				 else
					 System.out.println("First name element is NOT found");
			      
			   }
			
				
			//Last Name
				WebElement lastname = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
				lastname.sendKeys("Newton");
				String namee = "Newton";
				
				Thread.sleep(2000);
				
				 {
					 if(lastname.equals(namee));
				 {
				 System.out.println("Last name element is found");
				 }
				 else
					 System.out.println("Last name element is NOT found");
				
			//Date of birth
				WebElement dateob = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
				dateob.sendKeys("15/08/2003");
				int date;
				date = 15/08/2003;
				
				Thread.sleep(2000);
				
				{
					 if(dateob.equals(date));
				 {
				 System.out.println("DOB element is found");
				 }
				 else
					 System.out.println("DOB element is NOT found");
			//Address
				WebElement address = driver.findElement(By.xpath("/html/body/div/form/input[4]"));
				address.sendKeys("1 Claypool Rd");				
				String add = "1 Claypool Rd";
						
				Thread.sleep(2000);
				
				{
					 if(address.equals(add));
				 {
				 System.out.println("Address element is found");
				 }
				 else
					 System.out.println("Address element is NOT found");
				
			//Postcode
				WebElement postc = driver.findElement(By.xpath("/html/body/div/form/input[5]"));
				postc.sendKeys("BL6 6DY");
				String pcode = "BL6 6DY";
				
				Thread.sleep(2000);
				
				{
					 if(postc.equals(pcode));
				 {
				 System.out.println("Postcode element is found");
				 }
				 else
					 System.out.println("Postcode element is NOT found");
					 
			//Contract
				WebElement contract = driver.findElement(By.xpath("/html/body/div/form/input[6]"));
				contract.sendKeys("12");
			    String months = "12";
			    
			    Thread.sleep(2000);
				
				{
					 if(contract.equals(months));
				 {
				 System.out.println("Months element is found");
				 }
				 else
					 System.out.println("Months element is NOT found");
				
			//Price
				WebElement price = driver.findElement(By.xpath("/html/body/div/form/input[7]"));
				price.sendKeys("35");
	  	   	    String pricepound = "35";
	  	   	    
	  	   	    Thread.sleep(2000);
					
					{
						 if(price.equals(pricepound));
					 {
					 System.out.println("Price element is found");
					 }
					 else
						 System.out.println("Price element is NOT found");
				
			//Submit
				WebElement submitb = driver.findElement(By.name("Submit"));
				submitb.click();
				
				Thread.sleep(2000);
				
			//Checking if the form was accepted
				
				
				if(driver.getCurrentUrl().equals("https://confirm.html"));
				    System.out.println("Failure");
				else
				    System.out.println("Success");
				
				

		
		

		}
		}

}


			
			
		
