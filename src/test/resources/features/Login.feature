Feature: Login Function

#Scenario: Valid Login
#Given User is on Login Page
#When User enter login credentials
#Then Should navigate to Home Page

#Scenario: Valid Login
#Given User is on Login Page
#When User enter "tomsmith" and "SuperSecretPassword!"
#Then Should navigate to Home Page

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enter "<username>" and "<password>" 
#Then Should navigate to Home Page

#Examples:
 # | username | password |
 #| testuser1 | welcome1 |
 # | testuser2 | welcome2 |
 # | tomsmith | SuperSecretPassword! |
 
Scenario: Valid Login
Given User is on Login Page
When User enter login credentials
	 | username | password |
	 | tomsmith  | SuperSecretPassword! |
Then Should navigate to Home Page
  
  

