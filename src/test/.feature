Feature: Technicals Adding
  As a Developer
  I want to add Technicals through API
  So that It can be available to applications.

  Background:
    Given The Endpoint "https://techelp-api.zeabur.app/api/v1/technicals" is available

  @technical-adding
  Scenario: Add Technical
    When A Post Request is sent with values "Jorge", "Diaz", "948383823","Paruro 114", "Lima", "5", "SGVsbG8sIHlvd5B3b3JsZCE=", "jorge@techelp.com", "Lima", "Tecnico de iPhones"
    Then A Response is received with Status 200
    And An Technical Resource is included in Response Body, with values "Jorge Diaz", "Paruro 114", "Lima", "5", "SGVsbG8sIHlvd5B3b3JsZCE=", "Tecnico de iPhones"

  @technical-duplicated
  Scenario: Add Technical with existing Name
    Given An Technicals Resource with values "Jorge", "Diaz", "948383823", "Paruro 114", "Lima", "5", "SGVsbG8sIHlvd5B3b3JsZCE=", "jorge@techelp.com",
    When A Post Request is sent with values "Jorge", "Diaz", "948383823", "Paruro 114", "Lima", "5", "SGVsbG8sIHlvd5B3b3JsZCE=", "jorge@techelp.com",
    Then A Response is received with Status 400
    And A Message is included in Response Body with values "Not all constraints satisfied for Technical: An Technical with the same name already exists."




Feature: Items Adding
  As a Developer
  I want to add Items in the technician's inventory through API
  So that It can be available to applications.

  Background:
    Given The Endpoint "https://techelp-api.zeabur.app/api/v1/inventory/" is available

  @item-adding
  Scenario: Add Item in the technician inventory
    When A Post Request is sent with values 1, "Bateria Xiaomi 3500", 10, 80
    Then A Response is received with Status 200
    And An Items Resource is included in Response Body, with values 1, "Bateria Xiaomi 3500", 10, 80

  @item-duplicated
  Scenario: Add Item with existing Name
    Given An Items Resource with values 1, "Bateria Xiaomi 3500", 10, 80 is already stored
    When A Post Request is sent with values 1, "Bateria Xiaomi 3500", 10, 80
    Then A Response is received with Status 400
    And A Message is included in Response Body with values "Not all constraints satisfied for Item: An Item with the same name already exists."



Feature: Tasks Adding
  As an Developer
  I want to add Tasks through API
  So that It can be available to applications.
  Background:
    Given The Endpoint "https://techelp-api.zeabur.app/api/v1/task" is available

  @task-adding
  Scenario: Add Task
    When A Post Request is sent with values "Juan Gonzales", "9382828822", "948383823", "La camara de mi celular no funciona", "Xiaomi Camera 35", "2023-11-03T05:00:00:000+00:00", "50", 1
    Then A Response is received with Status 200
    And An Task Resource is included in Response Body, with values "Juan Gonzales", "9382828822", "948383823", "La camara de mi celular no funciona", "Xiaomi Camera 35", "2023-11-03T05:00:00:000+00:00", "50", 1
