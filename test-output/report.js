$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/white.feature");
formatter.feature({
  "line": 2,
  "name": "I am on techfios Site for background color change",
  "description": "",
  "id": "i-am-on-techfios-site-for-background-color-change",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Blue"
    },
    {
      "line": 1,
      "name": "@White"
    }
  ]
});
formatter.before({
  "duration": 7308013200,
  "status": "passed"
});
formatter.before({
  "duration": 5396894400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Get White color",
  "description": "",
  "id": "i-am-on-techfios-site-for-background-color-change;get-white-color",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the techfios site for the color change",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click White background",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Back ground color is blue",
  "keyword": "Then "
});
formatter.match({
  "location": "White_color.i_am_on_the_techfios_site_for_the_color_change()"
});
formatter.result({
  "duration": 159367200,
  "status": "passed"
});
formatter.match({
  "location": "White_color.i_click_White_background()"
});
formatter.result({
  "duration": 2256315700,
  "status": "passed"
});
formatter.match({
  "location": "White_color.back_ground_color_is_blue()"
});
formatter.result({
  "duration": 116700,
  "status": "passed"
});
});