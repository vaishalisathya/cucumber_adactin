Feature: user can book hotel rooms using adactin
Scenario: user can able to login into the adactin
Given user launch the url of the adactin
When enter the user name
And enter the password
Then login by clicking the button
Scenario: user can find the hotels and rooms
When user can select the location
And user can select hotel
And user can select room type
And user can select number of rooms
And user can enter check in date
And user can enter check out date
And select adults per room
And select children per room
Then click the search button to search the hotel rooms
Scenario: selcting the hotel
When user can select the radio button to select the hotel
Then click the continue button
Scenario: Booking the hotel
When enter the first name
And enter the last name
And enter the billing address
And enter the credit card number
And select credit card type 
And select credit card exp month
And select Credit card exp year
And enter cvv number
Then click the book now option
Scenario: confirmatin of the hotel bookings
Then click the itinerary button
Scenario: shows the confimation page with your details
Then take screenshot of the webpage