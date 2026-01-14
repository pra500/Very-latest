package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class yteh

{
    @Test
    public void yTest()
    {

        given().when().get("https://api.restful-api.dev/objects/7").then().
                assertThat().statusCode(200);

    }


}
