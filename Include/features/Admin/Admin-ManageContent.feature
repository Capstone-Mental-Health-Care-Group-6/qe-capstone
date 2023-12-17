@Managecontent
Feature: Manage content
As a user 
i want to manage the content

  @positive
  Scenario: User verify side button manage content
  Given I already log in as admin
  When I click side button manage content
  Then I succesfully go to manage content page
  
  Scenario: User verify feature search on manage content 
  Given I already on the manage content
  When I Search by judul and author
  Then I get searched data content
  
  Scenario: User verify feature terima pengajuan article
  Given I on the manage content page
  When I click one of content to see details
  And I Click terima button
  Then I Should se notification article published
    
  Scenario: User verify feature tolak pengajuan article
  Given I am on the manage content page
  When I click one of content to see details article
  And I Click tolak button
  And I choose alasan penolakan
  And I click tolak pengajuan button
  Then I Should se notification article rejected
  