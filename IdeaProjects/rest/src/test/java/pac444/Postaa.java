package pac444;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

public class Postaa {

    public static void main(String[] args) {

//
//
//        RestAssured.baseURI = "https://reqres.in/api";
//
//        // Create JSON object with fields to update
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("name", "Pragti Updated");
//        requestBody.put("job", "QA Engineer");
//
//        // Send PATCH request
//        Response response = RestAssured
//                .given()
//                .contentType(ContentType.JSON)
//                .body(requestBody.toString())
//                .patch("/users/2");  // PATCH endpoint
//
//        // Print response
//        System.out.println("Status Code: " + response.getStatusCode());
//        System.out.println("Response Body: " + response.getBody().asString());


        JSONObject jo = new JSONObject();
        jo.put("name", "Doyyy");
        jo.put("job", "QA");
//        jo.put("","");
//        jo.put("","");
//        jo.put("","");


        Response response = RestAssured.given()
                .baseUri("https://reqres.in/api/users")
                .header("Content-Type", "application/json")
                .body(jo.toString())
                .when().post().then().statusCode(201).extract().response();

        System.out.println(response.asString());


        //*********************


//


    }
}



