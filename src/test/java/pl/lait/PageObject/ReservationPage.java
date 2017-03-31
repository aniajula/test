package pl.lait.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage {
	
	static String roundTrip_xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]"
				+ "/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]";
	
	static String oneWay_xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
	
	static String passCount_name = "passCount";
	static String departingFrom_name = "fromPort";
	static String fromMonth_name= "fromMonth";
	static String fromDay_name="fromDay";
	static String toPort_name="toPort";
	static String toMonth_name="toMonth";
	static String toDay_name="toDay";
	
	static String economyClass_xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/"
				+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input";
	
	static String businessClass_xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody"
			+ "/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";
	
	static String firstClass_xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/"
			+ "table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]";
	
	
	
	static String airline_name="airline";
	static String findFlights_name="findFlights";
	

	
	public WebElement radio_roundTrip(WebDriver driver){
		return driver.findElement(
				By.xpath(roundTrip_xpath));
	}
	
		public WebElement radio_oneWay(WebDriver driver){
			return driver.findElement(
					By.xpath(oneWay_xpath));
	}
		public void selectPassengersCount(WebDriver driver, String visibleText_passCount){
			
			Select passengers=new Select(driver.findElement(By.name(passCount_name)));
			passengers.selectByVisibleText(visibleText_passCount);	
		}
		public Select selectPassengersCount(WebDriver driver){
			Select passengers=new Select(driver.findElement(By.name(passCount_name)));
			//passengers.selectByVisibleText(visibleText_passCount);
			return passengers;
		}
		
		public void departingFrom(WebDriver driver, String visibleText_fromPort){
		Select departingFrom = new Select(driver.findElement(By.name(departingFrom_name)));
		departingFrom.selectByVisibleText( visibleText_fromPort);
		}
		
		public void fromMonth(WebDriver driver, String visibleText_fromMonth){
		Select onMonth = new Select(driver.findElement(By.name(fromMonth_name)));
		onMonth.selectByVisibleText(visibleText_fromMonth);
		}
		
		public void fromDay(WebDriver driver, String visibleText_fromDay){
		Select onDay = new Select(driver.findElement(By.name(fromDay_name)));
		onDay.selectByVisibleText(visibleText_fromDay);
		}
		
		public void toPort(WebDriver driver, String visibleText_toPort){
		Select arrivingIn= new Select(driver.findElement(By.name(toPort_name)));
		arrivingIn.selectByVisibleText(visibleText_toPort);
		}
		
		public void toMonth(WebDriver driver, String visibleText_toMonth){
		Select returningMonth=new Select(driver.findElement(By.name("toMonth")));
		returningMonth.selectByVisibleText(visibleText_toMonth);
		}
		
		public void toDay(WebDriver driver, String visibleText_toDay){
		Select returningDay=new Select(driver.findElement(By.name(toDay_name)));
		returningDay.selectByVisibleText(visibleText_toDay);
		}
		
		
		public WebElement radio_economyClass(WebDriver driver){
			return driver.findElement(
					By.xpath(economyClass_xpath));
		}
		public WebElement radio_businessClass(WebDriver driver){
			return driver.findElement(
					By.xpath(businessClass_xpath));
			
		}
			public WebElement radio_firstClass(WebDriver driver){
				return driver.findElement(
						By.xpath(firstClass_xpath));
			}
		
		public void airline(WebDriver driver, String visibleText_airline){
			Select airline=new Select(driver.findElement(By.name(airline_name)));
			airline.selectByVisibleText(visibleText_airline);
		}
			
		public WebElement button_findFlight(WebDriver driver){
			return driver.findElement(
					By.name(findFlights_name));
		}
		
		
		
}
