Feature: Assign Leave Feature Working Fine

  Scenario Outline: Submit Assign Leave Form
    Given Login Application <username> and <password>
    When Click on AssignLeave link
    And Fill applyLeave form <leaveValue>, <fromDate>, <endDate>, <textArea>
    Then Click on Submit button
    Then Confirm the form submittion

 

    Examples: 
      | leaveValue | fromDate | endDate |textArea | username | password |
      | CAN - Bereavement | 2022-11-14 | 2022-11-15 | I Need to Leave | Admin | admin123 |
      