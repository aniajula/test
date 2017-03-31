package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.cli.Main;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;
import pl.lait.PageObject.MainPage;
import pl.lait.PageObject.Reservation2Page;
import pl.lait.PageObject.ReservationPage;
import pl.lait.PageObject.SignOnPage;
import pl.lait.Setup.Init;

public class MainPageStepDefs extends Init {
	protected WebDriver driver;

	@Before
	public void init() {
		driver = getDriver();

	}

	@Given("^I open main page$")
	public void i_open_main_page() {
		System.out.println("krok pierwszy w naszym teście");
	}

	@When("^I click link \"([^\"]*)\"$")
	public void i_click_link(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException(); wyrzuć wyjatek
		MainPage main = new MainPage();
		main.link_click(driver, arg1).click();

	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I should see contact page$")
	public void i_should_see_contact_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Page title : " + driver.getTitle());
		Assert.assertEquals("Wrong page title", "Under Construction: Mercury Tours", driver.getTitle());
	}

	// --logowanie

	@When("^I fill in login fields with \"([^\"]*)\" \"([^\"]*)\"$") // [powielamy\"([^\"]*)\"
	public void i_fill_in_login_fields_with(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SignOnPage login = new SignOnPage();
		login.loginAs(arg1, arg2, driver);
	}

	@Then("^I sholud see flights reservation page$")
	public void i_sholud_see_flights_reservation_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Wrong page title", "Find a Flight: Mercury Tours:", driver.getTitle());
	}

	@When("^I fill reservation first page$")
	public void i_fill_reservation_first_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		MainPage mainPage = new MainPage();
		SignOnPage signOn = new SignOnPage();
		ReservationPage reservPage = new ReservationPage();

		reservPage.radio_oneWay(driver).click();
		reservPage.selectPassengersCount(driver, "1"); // void
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
	}

	@When("^I fill reservation second page$")
	public void i_fill_reservation_second_page() throws Throwable {

		Reservation2Page reserv2Page = new Reservation2Page();

		reserv2Page.radio_Depart(driver).click();
		reserv2Page.radio_Return(driver).click();
		reserv2Page.button_continue(driver).click();
	}

	@When("^I fill reservation third page$")
	public void i_fill_reservation_third_page() throws Throwable {

		Reservation2Page reserv2Page = new Reservation2Page();

		

		reserv2Page.personalName("Anna", "Malicka", driver);
		reserv2Page.selectMeal(driver).selectByVisibleText("Vegetarian");
		// reserv2Page.selectMeal(driver,"Hindu");
		reserv2Page.cardType(driver, "Visa");
		reserv2Page.numberCard(driver, "123466");
		reserv2Page.noneCard1(driver, "02");
		reserv2Page.noneCard2(driver, "2001");
		reserv2Page.cardPersonalName("Anna", null, "Malicka", driver);
		reserv2Page.checkTicketlessAdress(driver).click();
		reserv2Page.input_billAdress1(driver, "nowy adres billadres");
		reserv2Page.input_billcity1(driver, "nowe miasto");
		reserv2Page.input_billState1(driver, "nowy stan");
		reserv2Page.input_input_billZip1(driver, "kod");
		reserv2Page.selectCountry_name(driver, "TOGO");
		// reserv2Page.checkadressTheSameAsBilling(driver).click();
		reserv2Page.buttonBuyFlights(driver).click();
		printScr("reservation3");
	}

	@Then("^I sholud see flight confirmation page$")
	public void i_sholud_see_flights_confirmation_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("Wrong page title", "Flight Confirmation: Mercury Tours:", driver.getTitle());
	}
	@After
	public void end() {
		cleanUp();
	}

}