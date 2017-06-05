$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/FeatureFiles/Deposit.feature");
formatter.feature({
  "line": 1,
  "name": "Desposit Page",
  "description": "",
  "id": "desposit-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5280116113,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Deposit with Invalid Card",
  "description": "",
  "id": "desposit-page;deposit-with-invalid-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Runme"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for Step2",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "found Step3",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefination.Test()"
});
formatter.result({
  "duration": 67615809,
  "status": "passed"
});
formatter.match({
  "location": "DepositStepDefination.Test()"
});
formatter.result({
  "duration": 231661,
  "status": "passed"
});
formatter.match({
  "location": "DepositStepDefination.Test2()"
});
formatter.result({
  "duration": 106967,
  "status": "passed"
});
formatter.after({
  "duration": 860479183,
  "status": "passed"
});
formatter.before({
  "duration": 3482116218,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Deposit with valid Card",
  "description": "",
  "id": "desposit-page;deposit-with-valid-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Runme"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I search for Step2",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationStepDefination.Test()"
});
formatter.result({
  "duration": 393314,
  "status": "passed"
});
formatter.match({
  "location": "DepositStepDefination.Test()"
});
formatter.result({
  "duration": 220244,
  "status": "passed"
});
formatter.after({
  "duration": 788921216,
  "status": "passed"
});
});