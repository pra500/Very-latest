package pac1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;



public class dv {
    public static void main(String[] args) {


        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("id", hasSize(13));




        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("name", hasItem("Apple iPad Mini 5th Gen"));


        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("name", hasItems("Apple iPad Mini 5th Gen", "Apple iPad Air", "Apple iPad Air"));








    }


}
