Feature: Transaction History
  As a user of Emphatic Care
  I want to access and interact with my transaction history
  So I can review and provide feedback effectively

  @transaction_history
  Scenario: View Transaction History
    Given User launches the Emphatic Care mobile app
    When User taps on the "History" menu
    Then User successfully sees the transaction history display

  @provide_ratings_and_feedback
  Scenario Outline: Provide Ratings and Feedback after Counseling
    Given User launches the Emphatic Care mobile app
    And User taps on the "History" menu
    And User sees rating and feedback popups
    When User provides ratings and feedback "<feedback>"
    And User taps the "Detail" button
    Then User successfully sends ratings and feedback

    Examples: 
    | feedback                              |
    | highly recommend this psychologist!   |

  @provide_ratings_and_blank_feedback
  Scenario Outline: Provide Ratings with Blank Feedback after Counseling
    Given User launches the Emphatic Care mobile app
    And User taps on the "History" menu
    And User sees rating and feedback popups
    When User provides ratings with blank feedback "<feedback>"
    And User taps the "Detail" button
    Then User fails to submit ratings and feedback

    Examples: 
    | feedback |
    |          |

  @cancel_feedback
  Scenario: Cancel Giving Ratings and Feedback
    Given User launches the Emphatic Care mobile app
    And User taps on the "History" menu
    When User clicks the "x" button
    Then User successfully cancels giving ratings and feedback

  @submit_button_feedback
  Scenario Outline: Verify "Submit" Button on Feedback and Ratings Popup
    Given User launches the Emphatic Care mobile app
    And User taps on the "History" menu
    And User taps to the "Ratings" section
    And User provides feedback "<feedback>"
    When User taps the "send" button
    Then User successfully sends ratings and feedback
    
    Examples: 
    | feedback                              |
    | highly recommend this psychologist!   |

  @details_button_order_history
  Scenario: Verify "Details" Button on Order History
    Given User launches the Emphatic Care mobile app
    And User taps on the "History" menu
    When User taps the "Detail" button
    Then User is redirected to the order details page

  @give_a_rating_button_order_history
  Scenario: Verify "Give a Rating" Button on Order History
    Given User launches the Emphatic Care mobile app
    And User taps on the "History" menu
    When User taps the "give a rating" button
    Then User is redirected to the order details page

  @leave_a_review_button_order_history
  Scenario: Verify "Leave a Review" Button on Order History
    Given User launches the Emphatic Care mobile app
    And User taps on the "History" menu
    And User taps the "give a rating" button
    When User taps the "leave a review" button
    Then User successfully sees the popup for giving ratings and feedback

  @message_icon_order_history
  Scenario: Verify Message Icon on Order History
    Given User launches the Emphatic Care mobile app
    And User taps on the "History" menu
    And User taps the "detail" button
    And User taps the "message" icon
    Then User is redirected to the history chat rooms

  @previous_icon_chat_history
  Scenario: Verify "Previous" Icon on Chat History
    Given User launches the Emphatic Care mobile app
    And User taps on the "History" menu
    And User taps the "detail" button
    And User taps the "message" icon
    When User taps the "previous" icon
    Then User successfully returns to the history page

  @buy_again_button_order_history
  Scenario: Verify "Buy Again" Button on Order History
    Given User launches the Emphatic Care mobile app
    And User taps on the "History" menu
    And User taps the "detail" button
    And User taps the "buy again" button
    Then User successfully returns to the Make an Appointment page

  @previous_icon_order_history
  Scenario: Verify "Previous" Icon on Order History
    Given User launches the Emphatic Care mobile app
    And User taps on the "History" menu
    And User taps the "detail" button
    And User taps the "message" icon
    And User taps the "previous" icon
    Then User successfully returns to the order history page
