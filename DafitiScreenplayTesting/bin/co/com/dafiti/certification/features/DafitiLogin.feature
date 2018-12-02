#Author: ingenierojcano@gmail.com
@Login
Feature: Login Dafiti
  As a web user
  I want to login into dafiti
  To buy a product

  @LoginSuccess @SmokeTest
  Scenario: login with correct credentials
    Given that jhon wants to login into dafiti
    When he enters his credentials
      | email                    | password          |
      | jhonedercano@gmail.com | 5KVUrNrxg3ZMjUX |
    Then he should be able to see the logged in message

  @LoginPasswordFailure
  Scenario: login with correct credentials
		Given that jhon wants to login into dafiti
    When he enters his credentials
      | email                    | password   |
      | jhonedercano@gmail.com | 5KVUrNrx |
    Then he shouldn't be able to see the logged in message

  @LoginUsernameFailure
  Scenario: login with correct credentials
    Given that jhon wants to login into dafiti
    When he enters his credentials
      | email          | password          |
      | jhonedercano | 5KVUrNrxg3ZMjUX |
    Then he shouldn't be able to see the logged in message

  @LoginUsernameAndPasswordFailure
  Scenario: login with correct credentials
    Given that jhon wants to login into dafiti
    When he enters his credentials
      | email          | password |
      | jhonedercano | 5KVUrN |
    Then he shouldn't be able to see the logged in message
