package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class T1 {

    @Test
    public void test1() {


        given().when().get("https://dummy-json.mock.beeceptor.com/posts").then().statusCode(200);
    }
}
