package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class teel
{

    @Test
            public void eeeTest() {

        given().when().get("https://dummy-json.mock.beeceptor.com/posts").then().assertThat().statusCode(200);

    }



    @Test
    public void eeddeTest() {

        given().when().get("https://dummy-json.mock.beeceptor.com/posts").then().assertThat().statusCode(200);


    }

}
