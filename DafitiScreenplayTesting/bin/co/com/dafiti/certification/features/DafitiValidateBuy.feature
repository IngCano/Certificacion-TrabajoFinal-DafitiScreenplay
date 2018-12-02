#Author: your.email@your.domain.com
@Buy
Feature: Buy Product Dafiti
  As a web user
  I want to buy an item in Dafiti

  @SuccessfulBuyTest @SmokeTest
  Scenario: Buy a item in Dafiti.com
    Given that jhon wants to login into dafiti
    When he enters his credentials
      | email                  | password        |
      | jhonedercano@gmail.com | 5KVUrNrxg3ZMjUX |
    Then he should be able to see the logged in message
    Given that jhon wants to buy an item
    When he searchs for the item
      | Zapatos |
    Then he should be able to see the search results
    When he adds the item to the shopping cart
    Then he should be able to see the item in the shoping cart
      | 1 PRODUCTO |
