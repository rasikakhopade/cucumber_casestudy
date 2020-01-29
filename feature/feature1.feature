Feature: Register 


Scenario: Register on TestMeApp
	Given user open TestMeApp
	When user clicks SignUp
	And enter user name as "rasika"
	And enter first name as "rasika"
	And enter last name as "khopade"
	And enter password as "rasika1234"
    And enter confirm password as "rasika1234"
	And user select gender "female"
	And enter email as "rasika@gmail.com"
	And enter mobile as "8895623458"
	And enter dob as "29/03/1998"
	And enter address as "pune_maharashtra"
	And user select security question as "What is your Birth Place?"
	And enter answer as "wai"
	Then user clicks register
	
	
@login
Scenario: Login using datatable
Given user open TestMeApp
When user clicks signin
And user enters credentials as
|lalitha|
|Password123|


@searchproduct
Scenario: Product Search
Given user open TestMeApp
When user clicks signin
And user enters credentials as
|lalitha|
|Password123|
And search product
|Head|
And click on find button
Then click on add to cart button

