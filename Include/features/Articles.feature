Feature: Article Interaction
  As a user of Emphatic Care
  I want to interact with articles
  So I can access and utilize articles effectively

  # [article_details]
  Scenario: View Article Details
    Given I on the Home page menu
    When I tap on an article
    Then I enter the article details page

  # [search_field]
  #Scenario: Use Search Field
    #Given I am on the Home page menu
    #When I search for keywords
    #Then I successfully use the search field

  # [invalid_keywords]
  #Scenario: Search with Invalid Keywords
    #Given I am on the Home page menu
    #When I search for keywords
    #Then I don't find the expected search results

  # [navigate_previous_page]
  Scenario: Navigate to Previous Page
    Given I on the Home page menu
    When I tap the previous button
    Then I view the previous homepage from the article selection page

  # [keyword_category_button]
  #Scenario: Use Keyword Category button
    #Given I am on the Home page menu
    #When I tap the button category button
    #Then I successfully search for articles using keywords

   #[return_from_article_details]
  Scenario: Return from Article Details
    Given I on the Home page menu
    When I tap the previous button from article details
    Then I return to the previous article selection page
