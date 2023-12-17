
Feature: Manage withdraw
  as a user i want manage withdraw
  
Scenario: Successful Withdrawal
    Given User is on the "Pencairan Saldo" page
    When User clicks the "Tarik Saldo" button
    And User chooses and clicks a withdrawal method
    And User fills in the "Nama Penerima" and "Nomor Rekening"
    And User chooses a nominal amount
    And User clicks the "Cairkan Dana" button
    Then User should successfully withdraw the funds

Scenario: Withdrawal with Empty Penerima Name
    Given User is on the "Pencairan Saldo" page
    When User clicks the "Tarik Saldo" button
    And User chooses and clicks a withdrawal method
    And User leaves the "Nama Penerima" empty and fills in the "Nomor Rekening"
    And User chooses a nominal amount
    And User clicks the "Cairkan Dana" button
    Then User should see an error message about the empty "Nama Penerima"

Scenario: Withdrawal with Empty Nomor Rekening
    Given User is on the "Pencairan Saldo" page
    When User clicks the "Tarik Saldo" button
    And User chooses and clicks a withdrawal method
    And User fills in the "Nama Penerima" and leaves the "Nomor Rekening" empty
    And User chooses a nominal amount
    And User clicks the "Cairkan Dana" button
    Then User should see an error message about the empty "Nomor Rekening"

Scenario: Withdrawal with Empty Penerima Name and Nomor Rekening
    Given User is on the "Pencairan Saldo" page
    When User clicks the "Tarik Saldo" button
    And User chooses and clicks a withdrawal method
    And User leaves both "Nama Penerima" and "Nomor Rekening" empty
    And User chooses a nominal amount
    And User clicks the "Cairkan Dana" button
    Then User should see an error message about the empty "Nama Penerima" and "Nomor Rekening"

Scenario: Cancel Withdrawal
    Given User is on the "Pencairan Saldo" page
    When User clicks the "Tarik Saldo" button
    And User chooses and clicks a withdrawal method
    And User fills in the "Nama Penerima" and "Nomor Rekening"
    And User chooses a nominal amount
    And User clicks the "Cairkan Dana" button
    And User clicks the "x" button
    Then User should cancel the withdrawal process
