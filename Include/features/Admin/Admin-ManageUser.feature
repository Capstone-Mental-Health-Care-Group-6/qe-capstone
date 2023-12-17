@Manageuser
Feature: User Management
As a user i want to manage Account

  @positive
  Scenario: User verify side button user management
  Given I already logged in as a admin
  When I click side button manage user
  Then I succesfully go to manage user page
  
  Scenario: User verify feature search on manage user 
  Given I already on the manage user page
  When I Search by name user, email, no telp and status user
  Then I get searched data user
  
  #filter skipped because cant filtered data
  
  Scenario: user manage user via table user 
  Given I am on the manage user page
  When I Click three dots button at table user
  Then I click non activing or activing account
  #Then I succesfully non activing or activing account
  
  Scenario: user manage user via detail user 
  Given I am on the manage user pages
  When I Click see details account
  And I click status account and change status account
  Then I clicked yakin button
  #Then I succesfully non activing account
  
  #data statis cant change if already choose
  #notification change account to active gaada
  