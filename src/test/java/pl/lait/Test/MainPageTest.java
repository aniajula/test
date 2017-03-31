package pl.lait.Test;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.PageObject.MainPage;
import pl.lait.Setup.Init;

public class MainPageTest extends Init{

	protected static WebDriver driver;
	
	@Before
	public void run(){ //static przypisany na stałe do klasy
		driver=getDriver();
	}
	
	//@Test
	public void test1_mainMenu(){
		MainPage main=new MainPage();
		main.link_contact(driver).click(); 
		main.link_register(driver).click();
		main.link_signon(driver).click();
		main.link_support(driver).click();
	}
	
	
	
}


