package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class FFDD {

    @Test(priority = 1)
    public void tetTest() {


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200);


    }

    @Test(priority = 2)
    public void tesddddtTest() {


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[0].id", equalTo("1"));


    }

    @Test(priority = 3)
    public void testTest() {


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[0].name", containsString("Google Pixel 6 Pro"));


    }

    @Test(priority = 4)
    public void tet333Test() {


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[0].id", notNullValue());



    }

    @Test(priority = 5)
    public void tet44Test() {



        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[0].data.color", containsString("Cloudy"));


    }

    @Test(priority = 6)
    public void tet77Test() {



        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[0].data.capacity", notNullValue());

    }

    @Test(priority = 7)
    public void tet999Test() {


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode
                (200).body("[10].name", equalTo("Apple iPad Mini 5th Gen"));

    }


    @Test(priority = 8)
    public void tet99999Test() {


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("", hasSize(greaterThan(10)));


    }

    @Test(priority = 9)
    public void tet333dsdTest() {



        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("", hasSize(lessThan(20)));


    }

    @Test(priority = 10)
    public void tet0000Test() {



        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("", hasSize(lessThanOrEqualTo(13)));

    }


}
