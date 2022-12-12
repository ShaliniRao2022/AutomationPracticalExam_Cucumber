$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CucumberExamPage.feature");
formatter.feature({
  "line": 2,
  "name": "Background color change functionality",
  "description": "",
  "id": "background-color-change-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Feature1"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 2241966100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Sky Blue Background",
  "description": "",
  "id": "background-color-change-functionality;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the button As \"Set SkyBlue Background\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "CucumberExamPageStepDefinitions.button_exists(String)"
});
formatter.result({
  "duration": 142766800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 26
    }
  ],
  "location": "CucumberExamPageStepDefinitions.i_click_on_the_button_As(String)"
});
formatter.result({
  "duration": 43391700,
  "status": "passed"
});
formatter.match({
  "location": "CucumberExamPageStepDefinitions.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 48080200,
  "status": "passed"
});
formatter.after({
  "duration": 618910400,
  "status": "passed"
});
formatter.before({
  "duration": 1604432400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "White Background Change",
  "description": "",
  "id": "background-color-change-functionality;white-background-change",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "\"Set White Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on the button As \"Set White Background\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set White Background",
      "offset": 1
    }
  ],
  "location": "CucumberExamPageStepDefinitions.button_exists(String)"
});
formatter.result({
  "duration": 66100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Set White Background",
      "offset": 26
    }
  ],
  "location": "CucumberExamPageStepDefinitions.i_click_on_the_button_As(String)"
});
formatter.result({
  "duration": 60737900,
  "status": "passed"
});
formatter.match({
  "location": "CucumberExamPageStepDefinitions.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 51634800,
  "status": "passed"
});
formatter.after({
  "duration": 16829020600,
  "status": "passed"
});
});