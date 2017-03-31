package pl.lait.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {


//kopiujemy ze zbadanego elementu wszystkie przyciski z tr<>tr i usuwam wszystyko do nazwy przycisków
   
	static String signonLinkText ="SIGN-ON";
	static String registerLinkText ="REGISTER";
	static String supportLinkText ="SUPPORT";
	static String contactLinkText ="CONTACT";
    
	public WebElement link_click(WebDriver driver,String txt){
		return driver.findElement(By.linkText((txt)));
	}
    
   public WebElement link_signon(WebDriver driver){
		return driver.findElement(By.linkText(signonLinkText));
	}
  public  WebElement link_register(WebDriver driver){
	  return driver.findElement(By.linkText(registerLinkText));
  }
  public  WebElement link_support(WebDriver driver){
	  return driver.findElement(By.linkText(supportLinkText));
  }
  public WebElement link_contact(WebDriver driver){
	  return driver.findElement(By.linkText(contactLinkText));
}
}