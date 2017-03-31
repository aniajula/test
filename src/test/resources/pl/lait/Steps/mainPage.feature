Feature: Main page testing - top bar 

Scenario: Open main page and click links
	Given I open main page
	When I click link "SIGN-ON"
	When I click link "REGISTER"
	When I click link "SUPPORT"
	When I click link "CONTACT"
	Then I should see contact page

	
Scenario: Log in a as sierotka m
	Given I open main page
	When I click link "SIGN-ON"
	When I fill in login fields with "Ania123-jula" "Ania123"
	Then I sholud see flights reservation page
	 