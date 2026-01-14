package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.checkerframework.checker.index.qual.LessThan;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Lessthanassertion {

    public static void main(String[] args)
    {



        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200)
                .and().body("[0].id", equalTo("3")).and().time(lessThan(2000L));


        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=2")
                .then().assertThat().statusCode(200)
                .and().body("[2].id", equalTo("2")).and().time(lessThan(2000L));



      //  given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=2")
       //         .then().assertThat().statusCode(200)
       //        .and().body("[2].id", equalTo("2")).and().time(equalTo(795L));



        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=2")
                .then().assertThat().statusCode(200)
                .and().body("[2].id", equalTo("2")).and().time(greaterThan(2000L));





        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=2")
                .then().assertThat().statusCode(200)
                .and().body("[2].id", equalTo("2")).and().time(lessThan(3000L));





        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=2")
                .then().assertThat().statusCode(200)
                .and().body("[2].id", equalTo("2")).and().time(lessThan(4000L));







    }

}
