package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class posss {

    @Test
    public void tesdddtTest(){



        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
                .then().assertThat().statusCode(200).
                body("[0].company",notNullValue()).and().body("[0].zip",notNullValue());

















    }
}
