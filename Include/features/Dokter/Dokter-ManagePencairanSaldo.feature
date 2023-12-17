@managepencairansaldodokter
Feature: Manage withdraw
  as a user i want manage withdraw
  
Scenario: User verify side button manage withdraw
    Given I Already login to manage withdraw
    When I clicked side button pencairan saldo
    Then I succesfully go to manage withdraw page

Scenario: User verify penarikan saldo button
		Given I Already login to manage withdraw
		When I clicked button pencairan saldo
		Then I  should see pop up form pencairan saldo

Scenario: User verify penarikan saldo
		Given I clicked button pencairan saldo
		And I fill metode pembayaran metode, nama penerima namapenerima, nomor rekening norekening, nominal penarikan nominal
		And I click cairkan dana button
		Then I should see pop up notification pencairan saldo di proses
		
		 


