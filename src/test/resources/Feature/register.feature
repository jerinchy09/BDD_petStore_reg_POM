Feature: Register
@required
Scenario: valid_registration
Given when the user launches the url
And click on sign in
And click on register now
When the user enters "j2ee" and "j2ee" and "j2ee" credentials
Then user should successfully register a new account
@required
Scenario: invalid_registration
Given when the user launches the url
And click on sign in
And click on register now
When the user enters "jfhg" and "jdsds" and "asdsd" credentials
Then error message
