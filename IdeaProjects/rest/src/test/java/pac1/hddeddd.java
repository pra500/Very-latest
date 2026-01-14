package pac1;

import org.json.JSONObject;

import static io.restassured.RestAssured.*;


public class hddeddd {


    public static void main(String[] args) {


        //get:

        given().when().get("https://reqres.in/api/users?page=2");


        //post:
        JSONObject jo = new JSONObject();
        jo.put("Sam", "qa2");
        jo.put("Sam1", "qa3");


        given().header("Content-Type", "application/json").body(jo.toString())
                .when().post("https://reqres.in/api/users").then().statusCode(201);


        //put:

        //


        //put:
        JSONObject jo1 = new JSONObject();
        jo1.put("Samsss", "qa2ss");
        jo1.put("Sam1sss34", "qa3ss");


        given().header("Content-Type", "application/json").body(jo.toString())
                .when().put("https://reqres.in/api/users/2").then().statusCode(200);


        //patch:


        JSONObject jo2 = new JSONObject();
        jo2.put("Cheerry", "devopsops");


        given().header("Content-Type", "application/json").body(jo.toString())
                .when().patch("https://reqres.in/api/users/2").then().statusCode(200);


        //delete:

        given().when().delete("https://reqres.in/api/users/2");

    }




}




