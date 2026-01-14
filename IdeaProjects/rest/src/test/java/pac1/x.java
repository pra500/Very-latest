package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class x {

    @Test
    public void tesbtTest(){


        given().header("Content-Type", "application/json")
                .when().get("https://dummy-json.mock.beeceptor.com/todos")

                .then().assertThat().statusCode(200);


    }
}

