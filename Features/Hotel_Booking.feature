Feature: Hotel booking - blibli website

  Scenario: Book a hotel at yogyakarta
    Given I launch blibli-travel website
    When Hotel tab is clicked
    Then Enter destination Name, check in and check out date
    Then choose no of Guest and Room
    Then Hit find a hotel
    Then choose the hotel
    Then book the delux room
    Then fill the customer data and continue to payment
    Then Do the booth payment
    And Close the browser



