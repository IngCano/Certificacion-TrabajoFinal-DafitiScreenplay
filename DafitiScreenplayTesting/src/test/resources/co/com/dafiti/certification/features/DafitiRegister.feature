#Author: ingenierojcano@gmail.com

@Register
Feature: register Dafiti
  As a web user
  I want to register into Dafiti
  To be able to login

  @RegisterSuccess @SmokeTest
  Scenario: register with correct data
    Given that Jhon is in the Dafiti register page
    When he submits all the data entered
    	| email | password | confirmPassword | firstName | lastNames | documentNumber | documentType | birthDate | gender |
    	| ""    | ""       | ""              | ""        | ""        | ""             | ""           | ""        | ""     |
    Then he should see the Dafiti success registry page