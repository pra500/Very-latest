package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Gettt156 {


    public static void main(String[] args) {

        Response res = RestAssured.given().when().get("https://api.restful-api.dev/objects");
       String sessionid= res.getSessionId();

        System.out.println(sessionid);
    }
}
