@regression
#  @Stagingukba
Feature:Check whether a visa is required to visit the UK
#  @TesttorunNext
#  @lateef
  @Stagingukba
  @UKBAAA
  Scenario: Japan nationalities coming to study for more than 6 months
    Given I am on the UKBA website
    When I choose "Japan" nationality
    And I click on Continue button
    And I select "Study" as reason for coming to the UK
    And I click on Continue button
    And I choose option of Longer than 6 months
    And I submit the form
    Then I should be informed that "You’ll need a visa to study in the UK"

  @sanity
    @staging
  Scenario Outline: Japan nationalities coming to study for more than 6 months
    Given I am on the UKBA website
    When I choose "<CountryName>" nationality
    And I click on Continue button
    And I select "Study" as reason for coming to the UK
    And I click on Continue button
    And I choose option of Longer than 6 months
    And I submit the form
    Then I should be informed that "You’ll need a visa to study in the UK"
    Examples:
    |CountryName|
    |Japan|
    |USA|
    |North Korea|

@testEnvironmennt
    Examples:
      |CountryName|
      |Australia|
      |Ukraine|