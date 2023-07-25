@regression
Feature: Visa Confirmation
  As user I want to check visa status with uk gov home office website

@smoke

  Scenario Outline: User from Australia coming to UK for tourism
    Given I click on start button
    When I Select a Nationality "<Nationality>"
    And I Click on Continue button
    And I Select reason "<reason>"
    And  I Click on Continue button
    Then verify result "<result>"
  Examples:
  | Nationality  |              reason               |             result                          |
  |  Australia   |       Tourism                     |  You will not need a visa to come to the UK |


  Scenario Outline: User from Chile coming to UK for work and plans on staying for longer than six months
    Given I click on start button
    When I Select a Nationality "<Nationality>"
    And I Click on Continue button
    And I Select reason "<reason>"
    And I Click on Continue button
    And I Select intendent to stay for "<longer than 6 months>"'
    And I Click on Continue button
    And I Select have planning to work for "<Health and care professional>"
    And I Click on Continue button
    Then I verify result "<result>"

    Examples:
      | Nationality  |              reason               |             result                           |
      |  Chile       |   Work, academic visit or business|   You need a visa to work in health and care |


  @sanity

  Scenario Outline: User from Columbian National coming to the UK to join a partner for a long stay
    Given I Click on start button
    When I Select a Nationality "<Nationality>"
    And I Click on Continue button
    And I Select reason "<reason>"
    And I Click on Continue button
    And I Select state My partner of family member have uk immigration status "<yes>"
    And I Click on Continue button
    Then I verify result "<result>"

    Examples:
      | Nationality  |              reason                    |             result                                           |
      | Colombia     | Join partner or family for a long stay |  You’ll need a visa to join your family or partner in the UK |

