package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class d {

    @Test
    public void hewffTest() {

        //     https://jsonplaceholder.typicode.com/posts



        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(200)
                .body("id", hasItems(1, 2));



        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(200)
                .body("id", hasItem(2));





        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10").then().assertThat().statusCode(200)
                .body("", hasSize(3));






    }


}
