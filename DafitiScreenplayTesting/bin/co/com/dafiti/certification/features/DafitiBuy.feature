#Author: your.email@your.domain.com
@Buy
Feature: Buy Product Dafiti
  As a web user
  I want to search a product
  To add it to the shopping cart

  @BuySuccess
  Scenario: Successful Buy
    Given that jhon wants to buy an item
    When he searchs for the item
      | Zapatos |
    Then he should be able to see the search results
    When he adds the item to the shopping cart
    Then he should be able to see the item in the shoping cart
      | 1 PRODUCTO  |
