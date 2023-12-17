@managepencairansaldodokter
Feature: Manage withdraw
  as a user i want manage withdraw
  
Scenario: User verify side button manage withdraw
    Given I Already login to manage withdraw
    When I clicked side button pencairan saldo
    Then I succesfully go to manage withdraw page

Scenario: User verify penarikan saldo button
		Given I Already on the withdraw page
		When I clicked pencairan saldo
		Then I  should see pop up form pencairan saldo

Scenario Outline: User verify penarikan saldo
		Given I already click pencairan saldo
		And I fill metode pembayaran <metode>, nama penerima <namapenerima>, nomor rekening <norekening>, nominal penarikan <nominal>
		And I click cairkan dana button
		Then I should see pop up notifycation pencairan saldo di proses
		
		   Examples: 
      |	metode  | namapenerima | norekening | nominal  | 
      | BNI			| yanto				 | 118118118	| 50000		 | 
      


