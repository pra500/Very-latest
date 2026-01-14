package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class NJ {

    @Test
    public void test1Test() {


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().
                statusCode(200).body("data[0].id", equalTo(7));

    }


    @Test
    public void testdd1Test() {


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().
                statusCode(200).body("data[2].last_name", equalTo("Funke"));


    }


    @Test
    public void testdds1Test() {
        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().
                statusCode(200).body("data[2].first_name", notNullValue());


    }

}
