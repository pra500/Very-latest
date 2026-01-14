package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Y1 {

    //   https://api.restful-api.dev/objects

    @Test
    public void sTest()
    {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[0].id", equalTo("1"));

    }

    @Test
    public void sss1dssTest()
    {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[0].name", notNullValue());

    }

    @Test
    public void s1wwTest()
    {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[0].name", notNullValue());
    }


    @Test
    public void ssss1Test()
    {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[3].name", notNullValue());

    }
    @Test
    public void s1Test()
    {
        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[10].name", notNullValue());
    }


}
