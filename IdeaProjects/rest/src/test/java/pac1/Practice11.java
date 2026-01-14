package pac1;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

public class Practice11 {


    public static void main(String[] args) {
//
//        Response response= RestAssured.given().when().get("https://jsonplaceholder.typicode.com/posts/1").then().statusCode(200).extract().response();
//        int responsecode=  response.getStatusCode();
//        System.out.println(responsecode);
//






JSONObject jo = new JSONObject();
jo.put("userId", 12);
        jo.put("id", 12);
        jo.put("title", "title1");
        jo.put("body", "body1");



        Response re=RestAssured.given().body(jo.toString()).when().post("").then().statusCode(201).extract().response();
       String s= re.getHeader("content-type");

        System.out.println(s);














        }
    }

