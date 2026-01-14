package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Yyff {


    public static void main(String[] args) {

//
//
////given().when().get("https://api.restful-api.dev/objects").then().statusCode(200);
//
//        Response response= RestAssured.given().get("https://api.restful-api.dev/objects");
//        System.out.println(response.getStatusCode());
//
//
//
//        Response response111= RestAssured.given().get("https://api.restful-api.dev/objects");
//        System.out.println(response111.getStatusLine());
//
//
//
//
//


        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat()
                .statusCode(200).body("", hasSize(100));


        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat()
                .statusCode(200).body("[0].title", containsString("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));


                given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat()
                .statusCode(200).body("[0].title", containsString("sunt"));


        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat()
                .statusCode(200).body("[0].title", containsString("sunt aut facere"));


        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat()
                .statusCode(200).body("userId", hasItems(1, 1));




    }


}