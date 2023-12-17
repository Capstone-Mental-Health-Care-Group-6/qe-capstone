Feature: Manage Pencairan Dana Dokter
  As a user
  I want to manage pencairan saldo
  So that I can manage pencairan saldo doktor
  
   @positive
  Scenario: User verify side button dana dokter
  Given I already login as a admins
  When I click side button dana dokter
  Then I succesfully go to dana dokter page
  
  Scenario: User verify feature search on dana dokter
  Given I already on the dana dokter page
  When I Search by name dokter, date, saldo cair
  Then I get searched data content dana dokter page
  
  Scenario: User verify feature change to pending 
  Given I on the manage dana dokter
  When I click three dots
  And I change done to penfing by click pending 
  Then I succesfully updated dana dokter status to pending
    
   Scenario: User verify feature change to done 
  Given I am on the manage dana dokter
  When I clicking three dots
  And I change pending to done by click done 
  Then I succesfully updated dana dokter status to done