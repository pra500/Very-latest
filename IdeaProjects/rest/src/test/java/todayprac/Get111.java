package todayprac;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.util.*;


public class Get111 {


    public static void main(String[] args)
    {
//        Response res = RestAssured.given().when().get("https://reqres.in/api/users/2").then()
//                .statusCode(200).extract().response();
//
//        int code = res.getStatusCode();
//
//        System.out.println(code);



        /*



        Map<String, String> map =new HashMap<String, String>();

        map.put("id",   "20");
        map.put("email",   "georgee333.bluth2222@reqres.in");
        map.put("first_name",   "georgee333");
        map.put("last_name",   "bluth2222");
        map.put("avatar",   "https://reqres.in/img/faces/33-image.jpg");


Response res=RestAssured.given().body(map).when().post("https://reqres.in/api/users").then().statusCode(201).extract().response();

       // System.out.println(res.getBody().asString());

        int c=
res.getStatusCode();
        System.out.println(c);

//res.getBody().asString();






*/




        //detete:

        Response response=RestAssured.given().when().delete("https://reqres.in/api/users/2").then()
                .statusCode(204).extract().response();
        int code= response.getStatusCode();
        System.out.println(code);



        //put:

/*
        {
            "name": "morssssspheus",
                "job": "leader"
        }


*/




        JSONObject jo=new JSONObject();
        jo.put("name", "morssssspheus");

        Response response1=RestAssured.given().body(jo).when().put("https://reqres.in/api/users/2").then()
                .statusCode(200).extract().response();




        //patch

        JSONObject jo2=new JSONObject();
        jo2.put("name", "morssssspheus");

        Response response2=RestAssured.given().body(jo2.toString()).when().patch("https://reqres.in/api/users/2").then()
                .statusCode(201).extract().response();

        System.out.println(response2.getStatusCode());

    }


}


