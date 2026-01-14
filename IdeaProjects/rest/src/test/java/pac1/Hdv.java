package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Hdv {

    @Test
    public void hdvTest()
    {

        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().assertThat().statusCode(200);
    }
}
