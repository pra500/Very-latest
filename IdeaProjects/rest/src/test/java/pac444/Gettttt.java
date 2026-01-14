package pac444;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Gettttt {

    public static void main(String[] args) {


        Response res= RestAssured.given().when().get("https://agify.io/")
                .then().statusCode(200).extract().response();

        System.out.println(res.getStatusLine());




    }
}
