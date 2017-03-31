package pl.lait.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Reservation2Page {

	static String radioDepart_xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/"
			+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input";
	
	static String radioReturn_xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/"
			+ "tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input";

	static String buttonReserveFlights_name="reserveFlights";
	
	static String firstName_name = "passFirst0";
	static String surname_name = "passLast0";
	static String selectMeal_name= "pass.0.meal";
	static String selectCardType_name="creditCard";
	static String numberCard_name="creditnumber";
	static String selectnoneCard1_name="cc_exp_dt_mn";
	static String selectnoneCard2_name="cc_exp_dt_yr";
	static String first_name = "cc_frst_name";
	static String middle_name = "cc_mid_name";
	static String last_name = "cc_last_name";
	
	static String checkTicketlessAdress_xpath="/html/body/div/table/tbody/tr/"
			+ "td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/"
			+ "td/form/table/tbody/tr[8]/td[2]/input";
	
	static String input_billAdress1_name="billAddress1";
	static String input_billcity1_name="billCity";
	static String input_billState1_name="billState";
	static String input_billZip1_name="billZip";
	static String selectCountry_name="billCountry";
	
	static String checkadressTheSameAsBilling_xpath="/html/body/div/table/tbody/tr/"
			+ "td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input";
	
	static String buttonBuyFlights_name="buyFlights";
	
	public WebElement radio_Depart(WebDriver driver){
	return driver.findElement(
			By.xpath(radioDepart_xpath));
	}
	
	public WebElement radio_Return(WebDriver driver){
		return driver.findElement(
				By.xpath(radioReturn_xpath));
	}
	public WebElement button_continue(WebDriver driver){
		return driver.findElement(
				By.name(buttonReserveFlights_name));
	}
	//page 3
	
	//public WebElement firstName(WebDriver driver){
		//return driver.findElement(By.name(firstName_name));}
	
	
	public void personalName(String name, String surname,WebDriver driver) {
		
		driver.findElement(By.name(firstName_name)).sendKeys(name);
		driver.findElement(By.name(surname_name)).sendKeys(surname);
	}
	
	//public Select selectMeal(WebDriver driver){
		//Select selectMeal = new Select(driver.findElement(By.name("pass.0.meal")));
		//return selectMeal;}
	
	public Select selectMeal(WebDriver driver){
		return new Select(driver.findElement(By.name(selectMeal_name)));
	}
	
	//public void selectMeal(WebDriver driver, String visibleText_selectMeal){
		
		//Select selectMeal=new Select(driver.findElement(By.name(selectMeal_name)));
		//selectMeal.selectByVisibleText(visibleText_selectMeal);	
	//}
		
	public void cardType(WebDriver driver, String visibleText_cardType){
		
		Select cardType=new Select(driver.findElement(By.name(selectCardType_name)));
		cardType.selectByVisibleText(visibleText_cardType);	
		}
	
	public void numberCard(WebDriver driver, String number){
		driver.findElement(By.name(numberCard_name)).sendKeys(number);
	}
	
	public void noneCard1(WebDriver driver, String visibleText_noneCard1){
		
		Select noneCard1=new Select(driver.findElement(By.name(selectnoneCard1_name)));
		noneCard1.selectByVisibleText(visibleText_noneCard1);	
		}
	
	public void noneCard2(WebDriver driver, String visibleText_noneCard2){
		
		Select noneCard2=new Select(driver.findElement(By.name(selectnoneCard2_name)));
		noneCard2.selectByVisibleText(visibleText_noneCard2);	
		}
	
	public void cardPersonalName(String first, String middle, String last, WebDriver driver) {
		
		driver.findElement(By.name(first_name)).sendKeys(first);
		driver.findElement(By.name(middle_name)).sendKeys(middle);
		driver.findElement(By.name(last_name)).sendKeys(last);
	}
	
	public WebElement checkTicketlessAdress(WebDriver driver){
		return driver.findElement(
				By.xpath(checkTicketlessAdress_xpath));
	}
	
	public void input_billAdress1(WebDriver driver, String billadress){
		driver.findElement(By.name(input_billAdress1_name)).clear();
		driver.findElement(By.name(input_billAdress1_name)).sendKeys(billadress);
	}
	
	public void input_billcity1(WebDriver driver, String billcity){
		driver.findElement(By.name(input_billcity1_name)).clear();
		driver.findElement(By.name(input_billcity1_name)).sendKeys(billcity);
	}
	public void input_billState1(WebDriver driver, String billstate){
		driver.findElement(By.name(input_billState1_name)).clear();
		driver.findElement(By.name(input_billState1_name)).sendKeys(billstate);
	}
	
	public void input_input_billZip1(WebDriver driver, String billzip){
		driver.findElement(By.name(input_billZip1_name)).clear();
		driver.findElement(By.name(input_billZip1_name)).sendKeys(billzip);
	}
	public void selectCountry_name(WebDriver driver, String visibleText_selectCountry){
		
		Select selectCountry=new Select(driver.findElement(By.name(selectCountry_name)));
		selectCountry.selectByVisibleText(visibleText_selectCountry);	
		}
	
	public WebElement checkadressTheSameAsBilling(WebDriver driver){
		return driver.findElement(
				By.xpath(checkadressTheSameAsBilling_xpath));
	}
	
	public WebElement buttonBuyFlights(WebDriver driver){
		return driver.findElement(
				By.name(buttonBuyFlights_name));
	}
}
	