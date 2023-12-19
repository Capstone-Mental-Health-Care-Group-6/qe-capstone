Feature: Transaction History
  As a user of Emphatic Care
  I want to access and interact with my transaction history
  So I can review and provide feedback effectively

  @transaction_history
  Scenario: View Transaction History
    Given I on dashboard menu
    When I taps on the menu transaction history
    Then I successfully sees the transaction history display

  #include submit_button_feedback
  @provide_ratings_and_feedback
  Scenario: Provide Ratings and Feedback after Counseling
    Given I navigate on transaction history menu
    When I provides ratings and feedback
    Then I successfully sends ratings and feedback

  @provide_ratings_and_blank_feedback
  Scenario: Provide Ratings with Blank Feedback after Counseling
    Given I navigate on transaction history menu
    When I provides ratings and feedback
    Then I fails to submit ratings and feedback

  @cancel_feedback
  Scenario: Cancel Giving Ratings and Feedback
    Given I navigate on transaction history menu
    When I clicks the X button
    Then I successfully cancels giving ratings and feedback

  @details_button_order_history
  Scenario: Verify Details button on Order History
    Given I navigate on transaction history menu
    When I taps the Detail button
    Then I is redirected to the order details page

  @give_a_rating_button_order_history
  Scenario: Verify Give a Rating button on Order History
    Given I navigate on transaction history menu
    When I taps the give a rating button
    Then I is redirected to the order details page

  @leave_a_review_button_order_history
  Scenario: Verify Leave a Review button on Order History
    Given I navigate on transaction history menu
    When I taps the leave a review button
    Then I successfully sees the popup for giving ratings and feedback

  @message_icon_order_history
  Scenario: Verify Message Icon on Order History
    Given I navigate on transaction history menu
    When I taps the message icon
    Then I is redirected to the history chat rooms

  @previous_icon_chat_history
  Scenario: Verify Previous Icon on Chat History
    Given I navigate on transaction history menu
    When I taps the previous icon
    Then I successfully returns to the history page

  @buy_again_button_order_history
  Scenario: Verify Buy Again button on Order History
    Given I navigate on transaction history menu
    When I taps the buy again button
    Then I successfully returns to the Make an Appointment page

  @previous_icon_order_history
  Scenario: Verify Previous Icon on Order History
    Given I navigate on transaction history menu
    When I taps the previous icon on order
    Then I successfully returns to the order history page