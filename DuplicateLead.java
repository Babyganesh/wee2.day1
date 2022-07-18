package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();	
       String title = driver.getTitle();
       System.out.println(title);
       driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Create Lead")).click();
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("BABY");
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("GANESH");
       driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("B");
       driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("G");
       driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Marketing");
       driver.findElement(By.id("createLeadForm_description")).sendKeys("Marketing field...");
       driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babyganeshece@gmail.com");
       //handle method
       WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
       Select drop1=new Select(State); 
       //select by visible method
       drop1.selectByVisibleText("New York");
       driver.findElement(By.className("smallSubmit")).click();
       System.out.println( driver.getTitle());
       //click duplicate lead
       driver.findElement(By.linkText("Duplicate Lead")).click();
       driver.findElement(By.id("createLeadForm_companyName")).clear();
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NEW TEASTLEAF");
       driver.findElement(By.id("createLeadForm_firstName")).clear();
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Baby G");
       driver.findElement(By.className("smallSubmit")).click();
       System.out.println( driver.getTitle());
      
       
	       
	     }}

