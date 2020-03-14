$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/artem/IdeaProjects/SeleniumProject/src/test/java/automation/features/cybertek.features");
formatter.feature({
  "line": 1,
  "name": "Retrieve password",
  "description": "",
  "id": "retrieve-password",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Testing retrieve password",
  "description": "",
  "id": "retrieve-password;testing-retrieve-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on the practice landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user navigates to forgot password page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters the email",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks retrieve password button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user be able to see \u0027Your e-mail\u0027s been sent!\u0027 message",
  "keyword": "Then "
});
formatter.match({
  "location": "RetrievePasswordDefinition.userIsOnThePracticeLandingPage()"
});
formatter.result({
  "duration": 7032134500,
  "status": "passed"
});
formatter.match({
  "location": "RetrievePasswordDefinition.userNavigatesToForgotPasswordPage()"
});
formatter.result({
  "duration": 235898100,
  "status": "passed"
});
formatter.match({
  "location": "RetrievePasswordDefinition.userEntersTheEmail()"
});
formatter.result({
  "duration": 144266000,
  "status": "passed"
});
formatter.match({
  "location": "RetrievePasswordDefinition.userClicksRetreivePasswordButton()"
});
formatter.result({
  "duration": 255085400,
  "status": "passed"
});
formatter.match({
  "location": "RetrievePasswordDefinition.userSeesSuccessMessage()"
});
formatter.result({
  "duration": 678335200,
  "status": "passed"
});
});