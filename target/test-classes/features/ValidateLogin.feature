Feature: To validate login of orangehr app

@wip0304a
Scenario: To validate login using valid credentials 

Given user is on "LoginPage"
And validateTitle to be ""
When user enters text into textbox "usernameTextbox" "Admin"
And user enters text into textbox "passwordTextbox" "admin123"
And user clicks "loginButton"