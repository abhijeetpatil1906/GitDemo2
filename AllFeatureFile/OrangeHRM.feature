Feature: Test OrangeHRM Application

  Scenario: Test Login Functionality
    Given user is on Loginpage
    When user enters valid username and valid password
    Then user click on login button

  Scenario: Test Homepage functionality
    Then verify homepage title
    And verify homepage url
    And verify homepage logo

  Scenario: Test PIM page functionality
    When user is on PIM page
    Then validate PIM page url

  Scenario: Create New user in PIM page
    When user click on Add button
    When user is on add employee page
    Then user enter firstname and lastname
    Then user can capture employee id
    Then user can click on Save button

  Scenario: Search PIM Page employee and delete employee
    When user click on employee list
    When user enter employee id
    Then user click on search
    And user click on checkBox
    And user click on Delete selected
    Then capture popup text
    Then click on yes delete button
