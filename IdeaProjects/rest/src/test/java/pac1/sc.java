package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class sc {
     @Test
     public void testFFTest(){


         given().when().get("https://dummy-json.mock.beeceptor.com/todos").
                 then().assertThat().
                 statusCode(200).
                 body("", hasSize(20));



         given().when().get("https://dummy-json.mock.beeceptor.com/todos").
                 then().assertThat().
                 statusCode(200).
                 body("id", hasItem(2));



         given().when().get("https://dummy-json.mock.beeceptor.com/todos").
                 then().assertThat().
                 statusCode(200).
                 body("userId", hasItems(7,1,5));











     }
}
