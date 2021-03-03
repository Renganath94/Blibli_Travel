Feature: Flight Booking - Blibli Travel Website


  Scenario: Book Flight
    Given I launch blibli travel website
    Then I enter origin as jakarta(CGK)
    Then I enter destination as Singapore(SIN)
    Then  I enter date of travel
    Then click on one-way radio_button
    Then click to choose passengers
    Then choose flight class
    Then Hit find tickets
    Then Book Garuda Indonesia Flight on 15:05
    Then Fill form details and click order
    Then do Payment at the booth
    Then Pay Now
    Then verify recommendation stay is there
    And hit order now and check the hotel names before and after
    And close the browser






