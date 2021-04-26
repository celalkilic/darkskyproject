Feature:Home Page Test
  Scenario:Verified the lowest and the highest temperature
    Given User goes to home page
    When User enters current location
    And User presses enter
    And User learned lowest temperature
    And User learned highest temperature
    Then Verify the current lowest and highest temps current