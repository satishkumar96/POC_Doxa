Feature: validate end to end testing of login page

  Scenario: fetch login page title
    Given login page open properly
    Then fetch login page title

  Scenario Outline: do negative login
    Given enter email id as "<username>"
    And enter password as "<password>"
    When click on submit button
    Then fetch error message

    Examples: 
      | username      | password |
      | abc@gmail.com | abc      |

  Scenario: validate forgot password link
    Given login page open properly
    And click on forgot password link
    When forgot password page display
    And fetch current page title
    And fetch the instruction text
    Then enter email address as "abc@gmail.com"
    And click on reset button
    And fetch success message appear on the screen
    And click on Login Now button

  Scenario: validate Login Now button on forgot password page
    Given login page open properly
    And click on forgot password link
    When forgot password page display
    And fetch current page title
    Then fetch the instruction text
    And click on Login Now button
