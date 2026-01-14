package pac222;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class T {

    public static void main(String[] args) {


        given()
                .when().get("https://reqres.in/api/users?page=2").then().statusCode(200);


        System.out.println("---------");


        //post:

//        {
//            "email": "eve.holt@reqres.in",
//                "password": "pistol"
//        }


        JSONObject jo = new JSONObject();
        jo.put("email", "pop23Y@yahoo.com");
        jo.put("password", "pop23Y@1234");


        given().body(jo.toString()).when()
                .post("https://reqres.in/api/register").then()
                .statusCode(201).body("email", equalTo("pop23Y@yahoo.com"));


























//put:

//
//
//        {
//            "name": "morpheus",
//                "job": "zion resident"
//        }
//

        JSONObject jo11 = new JSONObject();
        jo11.put("name", "morpheus0000");


        given().when().put("https://reqres.in/api/users/2")
                .then().statusCode(200).body("name", equalTo("morpheus0000"));

        //delete:


        // https://reqres.in/api/users/2


        given().when().delete("https://reqres.in/api/users/2").then().statusCode(204);


        //patch:


        HashMap<String, String> map = new HashMap<String, String>();
        map.put("job", "qaaa");


        given().body(map.toString()).when().patch("//https://reqres.in/api/users/2")
                .then().statusCode(200);


    }
}


