Feature: Article Interaction
  As a user of Emphatic Care
  I want to interact with articles
  So I can access and utilize articles effectively

  @article_details
  Scenario: View Article Details
    Given User is on the articles page
    When User taps on an article
    Then User enters the article details page

  @search_field
  Scenario Outline: Use Search Field
    Given User is on the articles page
    When User searches for "<keywords>"
    Then User successfully uses the search field
    
    Examples: 
      | keywords |
      | cemas    |

  @invalid_keywords
  Scenario Outline: Search with Invalid Keywords
    Given User is on the articles page
    When User searches for "<keywords>"
    Then User doesn't find the expected search results
    
    Examples: 
      | keywords          |
      | Budidaya jeruk    |
      | Budidaya apel     |

  @navigate_previous_page
  Scenario: Navigate to Previous Page
    Given User is on the articles page
    When User taps the previous button
    Then User views the previous homepage from the article selection page

  @keyword_category_button
  Scenario Outline: Use Keyword Category Button
    Given User is on the articles page
    When User taps the "<button>" category button
    Then User successfully searches for articles using keywords

    Examples: 
      | button     |
      | Semua      |
      | Depresi    |
      | Emosi      |
      | Kecemasan  |

  @return_from_article_details
  Scenario: Return from Article Details
    Given User is on the articles page
    When User taps the previous button from article details
    Then User returns to the previous article selection page
