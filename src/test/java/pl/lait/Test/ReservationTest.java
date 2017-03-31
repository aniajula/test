package pl.lait.Test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.PageObject.MainPage;
import pl.lait.PageObject.Reservation2Page;
import pl.lait.PageObject.ReservationPage;
import pl.lait.PageObject.SignOnPage;
import pl.lait.Setup.Init;

public class ReservationTest extends Init{

	protected static WebDriver driver;
	
	@Before
	public void run(){ //static przypisany na stałe do klasy
		driver=getDriver();
	}
	
	//@Test
	public void reservation(){
		MainPage mainPage= new MainPage();
		SignOnPage signOn= new SignOnPage();
		ReservationPage reservPage=new ReservationPage();
		Reservation2Page reserv2Page=new Reservation2Page();
		
		mainPage.link_signon(driver).click();
		signOn.loginAs("Ania123-jula", "Ania123", driver);
		reservPage.radio_oneWay(driver).click();
		//reservPage.selectPassengersCount(driver).selectByVisibleText("2"); // zwraca select
		reservPage.selectPassengersCount(driver,"1"); //void
		reservPage.departingFrom(driver, "New York");
		reservPage.fromMonth(driver, "April");
		reservPage.fromDay(driver, "10");
		reservPage.toPort(driver, "London");
		reservPage.toMonth(driver, "January");
		reservPage.toDay(driver, "15");
		reservPage.radio_businessClass(driver).click();
		reservPage.radio_firstClass(driver).click();
		reservPage.radio_economyClass(driver).click();
		reservPage.airline(driver, "Blue Skies Airlines");
		
		printScr("reservation");
		
		reservPage.button_findFlight(driver).click();
		
		printScr("reservation");
		reserv2Page.radio_Depart(driver).click();
		reserv2Page.radio_Return(driver).click();
		printScr("reservation2");
		reserv2Page.button_continue(driver).click();
		printScr("reservation2");
		
		reserv2Page.selectMeal(driver).selectByVisibleText("Vegetarian");
		
		reserv2Page.personalName("Anna", "Malicka", driver);	
		//reserv2Page.selectMeal(driver,"Hindu");
		reserv2Page.cardType(driver, "Visa");
		reserv2Page.numberCard(driver, "123466");
		reserv2Page.noneCard1(driver, "02");
		reserv2Page.noneCard2(driver, "2001");
		reserv2Page.cardPersonalName("Anna", null, "Malicka", driver);
		reserv2Page.checkTicketlessAdress(driver).click();
		reserv2Page.input_billAdress1(driver, "nowy adres billadres");
		reserv2Page.input_billcity1(driver, "nowe miasto");
		reserv2Page.input_billState1(driver,"nowy stan");
		reserv2Page.input_input_billZip1(driver, "kod");
		reserv2Page.selectCountry_name(driver, "TOGO");
		//reserv2Page.checkadressTheSameAsBilling(driver).click();
		printScr("reservation3");
		reserv2Page.buttonBuyFlights(driver).click();
		printScr("reservation3");
		
		
		
		
		
	}
}
