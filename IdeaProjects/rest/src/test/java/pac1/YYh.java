package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class YYh {

    @Test
    public void tes333vtTest(){

        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then().assertThat().statusCode(200)
                .body("[0].id", equalTo(1));


    }

    @Test
    public void tessvtTest(){


        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then().assertThat().statusCode(200)
                .body("[0].name", notNullValue());






    }


    @Test
    public void tessssvtTest(){

        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then().assertThat().statusCode(200)
                .body("[0].name", notNullValue());
    }


    @Test
    public void tesv22tTest(){

        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then().assertThat().statusCode(200)
                .body("[0].name", notNullValue());

    }


    @Test
    public void tesv2222tTest(){

        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then().assertThat().statusCode(200)
                .body("[1].name", notNullValue());
    }






}
