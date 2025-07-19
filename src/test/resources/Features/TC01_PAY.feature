Feature: Create PAY Record Automation in orange HRM

Background: Common Steps

    When User OPEN URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC01 
		And User PRESS username as "Admin" and password as "admin123"
    Then NAVIGATE to PAY Page
    When Add PAY Records with Pay as "waffle" 
    When CLICK on logout button
    
    
@talk       #tag
Scenario: TC02
  	And User PRESS username as "Admin" and password as "admin123"
    Then NAVIGATE to PAY Page
    When Add PAY Records with Pay as "waffle12" 
    When CLICK on logout button
  
@walk     
Scenario: TC03
		And User PRESS username as "Admin" and password as "admin123"
    Then NAVIGATE to PAY Page
    When Add PAY Records with Pay as "waffle12" 
    When CLICK on logout button
  