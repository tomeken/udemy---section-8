$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("wordpress.feature");
formatter.feature({
  "line": 1,
  "name": "Test of content AddToYourOrder page",
  "description": "",
  "id": "test-of-content-addtoyourorder-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Checking of CartSubtotal content",
  "description": "",
  "id": "test-of-content-addtoyourorder-page;checking-of-cartsubtotal-content",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@wordpress"
    },
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on wordpress website \"https://wordpress.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks to login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is on first login page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enter email and press Continue",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is on second page password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User enter password and press LogIn",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User is on main login page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User press avatar",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User is personal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User is click notification",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User press checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Checkbox is unselected",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://wordpress.com",
      "offset": 30
    }
  ],
  "location": "WordpressSteps.userIsOnWordpressWebsite(String)"
});
formatter.result({
  "duration": 11674619866,
  "status": "passed"
});
formatter.match({
  "location": "WordpressSteps.userClicksToLogin()"
});
formatter.result({
  "duration": 2617771049,
  "status": "passed"
});
formatter.match({
  "location": "WordpressSteps.userIsOnFirstLoginPage()"
});
formatter.result({
  "duration": 72109600,
  "status": "passed"
});
formatter.match({
  "location": "WordpressSteps.userEnterEmailAndPressContinue()"
});
formatter.result({
  "duration": 395319709,
  "status": "passed"
});
formatter.match({
  "location": "WordpressSteps.userIsOnSecondPagePassword()"
});
formatter.result({
  "duration": 62850664,
  "status": "passed"
});
formatter.match({
  "location": "WordpressSteps.userEnterPasswordAndPressLogIn()"
});
formatter.result({
  "duration": 579397821,
  "status": "passed"
});
formatter.match({
  "location": "WordpressSteps.userIsOnMainLoginPage()"
});
formatter.result({
  "duration": 9034632954,
  "status": "passed"
});
formatter.match({
  "location": "WordpressSteps.userPressAvatar()"
});
formatter.result({
  "duration": 85078843,
  "status": "passed"
});
formatter.match({
  "location": "WordpressSteps.userIsPersonalPage()"
});
formatter.result({
  "duration": 444664165,
  "status": "passed"
});
formatter.match({
  "location": "WordpressSteps.userIsOnNotificationPage()"
});
formatter.result({
  "duration": 703570360,
  "status": "passed"
});
formatter.match({
  "location": "WordpressSteps.userPressCheckbox()"
});
formatter.result({
  "duration": 62586287,
  "status": "passed"
});
formatter.match({
  "location": "WordpressSteps.checkboxIsUnselected()"
});
formatter.result({
  "duration": 45614855,
  "status": "passed"
});
});