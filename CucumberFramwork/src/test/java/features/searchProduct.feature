Feature: Search and Place the order for products
@OffersPage
  Scenario Outline: Search Exprience for product search in both home and offer page
    Given User is on GreenCard Landing Page
    When User serached with Shortname <Name> and extracted actual name of product
    Then User serached for <Name> shortname in offers page 
    And validate product name in offers page matches with the Landing Page

Examples:
|Name|
|Tom|
|Beet|

  