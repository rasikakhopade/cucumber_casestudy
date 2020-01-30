package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case_study3 {

	public static WebDriver driver;
 @Given("^user open TestMe$")
 public void openTestMeApp()
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc3a-training.pdc3a\\Desktop\\rasika selenium\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
 }
 @When("^user clicks signi$")
 public void signin()
 {
	 driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
 }
 @And("^user enters credential as$")
 public void enter(DataTable dt)
 {
	 List<String> cred=dt.asList(String.class);
	 driver.findElement(By.name("userName")).sendKeys(cred.get(0));
	 driver.findElement(By.name("password")).sendKeys(cred.get(1));
	 driver.findElement(By.name("Login")).click();
 }
 @And("^search product$")
 public void search(DataTable dt1)
 {
	 List<String> search=dt1.asList(String.class);
	 driver.findElement(By.name("products")).sendKeys(search.get(0));
	
 }
 @And("^click on find button$")
 public void find()
 {
	
	 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	
 }
 @Then("^click on add to cart button$")
 public void cart()
 {
	
	 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	
 }
 
 

}
