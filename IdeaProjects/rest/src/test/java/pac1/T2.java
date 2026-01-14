package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class T2 {

    @Test
    public void egeTest() {


        //  https://reqres.in/api/users?page=2

/*
given().
        when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
        .body("data", hasSize(6));





        given().
                when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data.id", hasItem(9));





        given().
                when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data.id", hasItems(8,9,10,11));


*/



        /*

        given().
                when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("name", hasItems("Google Pixel 6 Pro", "Apple iPhone 12 Mini, 256GB, Blue"))
                .and().body("", hasSize(13)).and().body("name", hasItem("Google Pixel 6 Pro"));
*/



















        given().
                when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("name", hasItems("Google Pixel 6 Pro", "Apple iPhone 12 Mini, 256GB, Blue"))
                .and().body("", hasSize(lessThan(20))).and().body("name", hasItem("Google Pixel 6 Pro"));


        given().
                when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("name", hasItems("Google Pixel 6 Pro", "Apple iPhone 12 Mini, 256GB, Blue"))
                .and().body("", hasSize
                        (lessThanOrEqualTo(20)))
                .and().body("name", hasItem("Google Pixel 6 Pro"));


        given().
                when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("name", hasItems("Google Pixel 6 Pro", "Apple iPhone 12 Mini, 256GB, Blue"))
                .and().body("", hasSize
                        (greaterThan(4))).
                and().body("name", hasItem("Google Pixel 6 Pro"));


    }
}
