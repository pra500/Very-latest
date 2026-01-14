package pac1;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class St {

    @Test
    public void ge() {


        given().when().get("https://api.restful-api.dev/objects").then().statusCode(200)
                .log().all();


        given().when().get("https://api.restful-api.dev/objects").then().statusCode(200)
                    .log().all().body("[0].id", equalTo("1"));







    }
}





