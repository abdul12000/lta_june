@ConfigTest
Feature: Registration to Newtours website

  Background:
    Given I am on the Newtours website
    When I click on the Register link
@Newours
  @lateef
  Scenario Outline: Register by entering only User Information
#    Given I am on the Newtours website "http://demo.guru99.com/selenium/newtours/"
#  Given I am on the Newtours website
#    When I click on the Register link
    And I enter "<Username>", password and confirm as "password120"
    And I click submit button
    Then confirmation page is displayed with my "<Username>"
    Examples:
    |Username|
    |Jose1234|
#    |Jose1234*!5|
#    |Jose1234%3|
#    |PSKJ78-|



  Scenario Outline: Register by entering incorrect password for confirm password throws error
#    Given I am on the Newtours website "http://demo.guru99.com/selenium/newtours/"
#    Given I am on the Newtours website
#    When I click on the Register link
    And I enter "<Username>", and "password" with incorrect password for confirm password
    And I click submit button
    Then confirmation page should not be displayed
    And error message is displayed as "PAssword and con.password does not match"
    Examples:
      |Username|
      |Jose12345|

  @lateef1111
  Scenario Outline: Register by  entering more information  requested
#    Given I am on the Newtours website "http://demo.guru99.com/selenium/newtours/"
#    Given I am on the Newtours website
#    When I click on the Register link
    And I enter "<LastName>" and select "<CountryName>"
    And I enter "<Username>", password and confirm as "password120"
    And I click submit button
    Then confirmation page is displayed with my "<Username>"
    Examples:
      | Username | LastName | CountryName |
      | LateefAA   | Ade      | TOGO  |
#      | LateefDD   | AdeACC      | BAHRAIN  |
#      | LateefFR   | Adekjj     | UGANDA  |
#      | LateefAfg   | AdeLO      | SPAIN  |

@NtUnique
  Scenario Outline: Register by  entering more information and random email
#    Given I am on the Newtours website
#    When I click on the Register link
    And I enter "<LastName>" and select "<CountryName>" and enter unique email address
    And I enter "<Username>", password and confirm as "password120"
    And I click submit button
    Then confirmation page is displayed with my "<Username>"
    Examples:
      | Username | LastName | CountryName |
      | LateefAA   | Ade      | TOGO  |