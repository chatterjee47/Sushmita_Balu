Feature: Login Functionality


   @BookStore
  Scenario Outline: Testing login page
    Given User is on login page
    Then User enters Username"<UserName>"
    Then User enters Password "<Password>"
    Then User clicked on login button
    And Verify title of the page

    Examples: 
      | UserName | Password |
      | Admin    | admin123 | 
