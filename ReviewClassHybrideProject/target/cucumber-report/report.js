$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Features/LogIn.feature");
formatter.feature({
  "line": 3,
  "name": "LogIn",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@LogIn"
    }
  ]
});
formatter.before({
  "duration": 6788588356,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should able to LogIn successfully with valid credential",
  "description": "",
  "id": "login;user-should-able-to-login-successfully-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter valid credential",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should able to log in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnLoginPage()"
});
formatter.result({
  "duration": 1250234161,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.user_enter_valid_credential()"
});
formatter.result({
  "duration": 5529833913,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.user_should_able_to_log_in_successfully()"
});
formatter.result({
  "duration": 2057397296,
  "status": "passed"
});
formatter.after({
  "duration": 81627301,
  "status": "passed"
});
});