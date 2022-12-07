
Feature: Document Uploading feature Testing

#Here we check the uploading functionality working fine or not
  Scenario: Document single file uploading for document manager
    Given launch browser and driver
    When Upload the required document
    Then validate the uploaded document
