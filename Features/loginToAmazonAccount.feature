Feature: Login to Amazon account

Scenario Outline: Login to Amazon account

Given I an on the amazon homepage

When i click on the sign in button 
And I enter the "<User_Name>" in input field
And i enter the "<passwords>" in password input field

And i click on the sign in button

Then ican successfully login to my amazon account
   
    Examples: 
      | User_Name  |  password |
      |tinatarafdar822@gmail.com| RonaldKutta18 |
