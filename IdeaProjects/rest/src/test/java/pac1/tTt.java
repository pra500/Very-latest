package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class tTt {

    public static void main(String[] args) {


        // https://api.restful-api.dev/objects


        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200).body("[0].id",equalTo("1"));


        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("[0].id", notNullValue());



        given().when().get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("[2].name", containsString("Apple iPhone 12 Pro Max"));



        given().when().get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("[1].name",equalTo("Apple iPhone 12 Mini, 256GB, Blue"));



        given().when().get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("[1].data",equalTo(null));

        given().when().get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("[0].data.color",equalTo("Cloudy White"));



        given().when().get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("[0].data.capacity",equalTo("128 GB"));



        given().when().get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("[0].data.capacity",equalTo("128 GB"));


        given().when().get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("[0].data.capacity",equalTo("128 GB"));



        given().when().get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("[0].data.capacity", notNullValue());



        given().when().get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("[0].data.capacity", containsString("128 GB"));


        Response response= RestAssured.given().when().get("https://api.restful-api.dev/objects");

        System.out.println( response.getHeaders());

        System.out.println( response.getStatusCode());

        System.out.println(response.getContentType());
        System.out.println(response.getHeaders());

        System.out.println(response.getDetailedCookie("Connection"));


        given().when().get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("[0].data.capacity", containsString("128 GB"));













    }
}
