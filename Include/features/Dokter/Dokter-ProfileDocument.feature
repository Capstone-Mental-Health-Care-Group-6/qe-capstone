@ProfileDokumen
Feature: Document
As a user i want to fill document
for information

@positive
    Scenario: User Verify Update Document data
    Given I already loggin dashboard dokter 
    When I go profile doctors
    And  I Click document data
    And I fill in the cv form, Surat Izin Praktik Psikologi Klinis, ijazah Terakhir, Surat Tanda Registrasi Psikologi Klinik
    Then I clicked the save changes button document data  
    
    
   @negative
 		Scenario: User Verify Update Academic data emptying form 
    Given I go to logging dashboard dokters
    When I go to the profile doctor
    And  I Click document data doctors
    And I emptying cv form, Surat Izin Praktik Psikologi Klinis, ijazah Terakhir, Surat Tanda Registrasi Psikologi Klinik
    And I clicking the save changes button document data
    Then I see message data must be filled
    
   
      