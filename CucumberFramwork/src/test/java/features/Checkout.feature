Feature: Place the order for products
@PlaceOrder
  Scenario Outline: Search Exprience for product search in both home and offer page
    Given User is on GreenCard Landing Page
    When User serached with Shortname <Name> and extracted actual name of product
    And Added "3" items on the selected product to cart
    Then User proceeds to Checkout and validate the <Name> items in checkout page
    And verify user has ability to enter promo code and place the order

Examples:
|Name|
|Tom|


  