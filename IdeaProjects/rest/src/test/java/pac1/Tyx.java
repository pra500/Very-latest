package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Tyx {

    @Test
    public void geTest() {

        given().when().get("https://dummy-json.mock.beeceptor.com/continents")
                .then().statusCode(200);



        given().when().get("https://dummy-json.mock.beeceptor.com/continents")
                .then().assertThat().
                statusCode(200).body("", hasSize(7));






        given().when().get("https://dummy-json.mock.beeceptor.com/continents")
                .then().assertThat().
                statusCode(200).body("population", hasItems(579750000, 43155000));





        given().when().get("https://dummy-json.mock.beeceptor.com/continents")
                .then().assertThat().
                statusCode(200).body("population", hasItem(579750000));







    }
}



