package pac222;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class eggt {

    public static void main(String[] args) {


        Response ss = RestAssured.given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).extract().response();

        int code = ss.getStatusCode();
        System.out.println(code);


        Response ss1 = RestAssured.given().when().get("https://reqres.in/api/users?page=10").then().statusCode(200).extract().response();

        int code1 = ss1.getStatusCode();
        System.out.println(code1);


        Response ss2 = RestAssured.given().when().get("https://reqres.in/api/users?page=10").then().statusCode(200).extract().response();

        int code2 = ss2.getStatusCode();
        System.out.println(code2);



        Response ssww1 = RestAssured.given().when().get("https://reqres.in/api/users?page=10").then().statusCode(200).extract().response();

        int codeww1 = ssww1.getStatusCode();
        System.out.println(codeww1);


        Response ss8 = RestAssured.given().when().get("https://reqres.in/api/users?page=10").then().statusCode(200).extract().response();

        int code8 = ss8.getStatusCode();
        System.out.println(code8);


    }


}
