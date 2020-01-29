package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Step_definition 
{
	public static WebDriver driver;
 @Given("^user open TestMeApp$")
 public void openTestMeApp()
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc3a-training.pdc3a\\Desktop\\rasika selenium\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
 }
 @When("^user clicks SignUp$")
 public void sign()
 {
	 driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
 }
 @When("^user clicks signin$")
 public void signin()
 {
	 driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
 }
 @And("^user enters credentials as$")
 public void enter(DataTable dt)
 {
	 List<String> cred=dt.asList(String.class);
	 driver.findElement(By.name("userName")).sendKeys(cred.get(0));
	 driver.findElement(By.name("password")).sendKeys(cred.get(1));
	 driver.findElement(By.name("Login")).click();
 }
 
 @And("^enter user name as \"([^\"]*)\"$")
 public void  username(String username)
 {
	 driver.findElement(By.name("userName")).sendKeys(username);
 }
 @And("^enter first name as \"([^\"]*)\"$")
 public void firstname(String firstname)
 {
	 driver.findElement(By.name("firstName")).sendKeys(firstname);
 }
 @And("^enter last name as \"([^\"]*)\"$")
 public void lastname(String lastname)
 {
	 driver.findElement(By.name("lastName")).sendKeys(lastname);
 }
 @And("^enter password as \"([^\"]*)\"$")
 public void password(String password)
 {
	 driver.findElement(By.name("password")).sendKeys(password);
 }
 @And("^enter confirm password as \"([^\"]*)\"$")
 public void password1(String password1)
 {
	 driver.findElement(By.name("confirmPassword")).sendKeys(password1);
 }
 @And("^user select gender \"([^\"]*)\"$")
 public void gender(String gender)
 {
	if(gender.equalsIgnoreCase("Male"))
	{
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}
	else if(gender.equalsIgnoreCase("Female"))
	{
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}
 }
 @And("^enter email as \"([^\"]*)\"$")
 public void email(String email)
 {
	 driver.findElement(By.name("emailAddress")).sendKeys(email);
 }
 @And("^enter mobile as \"([^\"]*)\"$")
 public void mobile(String mobile)
 {
	 driver.findElement(By.name("mobileNumber")).sendKeys(mobile);
 }
 @And("^enter dob as \"([^\"]*)\"$")
 public void dob(String dob)
 {
	 driver.findElement(By.name("dob")).sendKeys(dob);
 }
 @And("^enter address as \"([^\"]*)\"$")
 public void address(String address)
 {
	 driver.findElement(By.name("address")).sendKeys(address);
 }
 
 @And("^user select security question as \"([^\"]*)\"$")
 public void question(String question)
 {
	 Select s=new Select(driver.findElement(By.name("securityQuestion")));
	 s.selectByIndex(0);
 }
 @And("^enter answer as \"([^\"]*)\"$")
 public void ans(String ans)
 {
	 driver.findElement(By.name("answer")).sendKeys(ans);
 }
 @And("^user clicks register$")
 public void register()
 {
	 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
 }
}
