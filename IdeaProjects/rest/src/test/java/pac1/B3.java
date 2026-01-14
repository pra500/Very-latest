package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class B3 {

    @Test
    public void test() {


        given().when().get("https://jsonplaceholder.typicode.com/posts")
                .then().assertThat().statusCode(200)
                .body("[0].userId", equalTo(1));


        given().when().get("https://jsonplaceholder.typicode.com/posts")
                .then().assertThat().statusCode(200)
                .body("[1].id", equalTo(2));


        given().when().
                get("https://api.restful-api.dev/objects")
                .then().statusCode(200);

        System.out.println("-------");


        given().when().
                get("https://api.restful-api.dev/objects?page=1")
                .then().statusCode(200).log().all();


        given().when().
                get("https://api.restful-api.dev/objects?page=1")
                .then().statusCode(200).log().all();




        System.out.println("-------");

        //  https://jsonplaceholder.typicode.com/posts/2

        given().when().get("https://jsonplaceholder.typicode.com/posts/2").then()
                .assertThat().statusCode(200).body("id", equalTo(2));























    }


}


