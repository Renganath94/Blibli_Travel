Feature: Train/Cars Booking - Blilbi travel website

  Scenario: Should able to book the train and Pay
    Given Launch blibli travel website
    When Cars tab is selected
    Then I enter the origin location
    Then i enter the destination location
    Then I enter the date
    Then I select the one-way radio button
    Then choose no of tickets
    And click find tickets

