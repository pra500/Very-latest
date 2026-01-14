package pac1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class SSSSSS {


    // https://api.restful-api.dev/objects

    @Test
    public void test1Test() {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[1].name",equalTo("Apple iPhone 12 Mini, 256GB, Blue"));


    }

    @Test
    public void testsss1Test() {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[2].id", equalTo("3"));

    }

    @Test
    public void tesst1Test() {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[12].data.Generation", notNullValue());

    }

    @Test
    public void tes22st1Test() {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[0].data.color", equalTo("Cloudy White"));
    }

    @Test
    public void tes44t1Test() {
        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[0].data.capacity", equalTo("128 GB"));
    }

    @Test
    public void tesddt1Test() {
        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[0].id", equalTo("1"));

    }

    @Test
    public void tessss44t1Test() {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[3].name", equalTo("Apple iPhone 11, 64GB"));

    }

    @Test
    public void testww1Test() {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[1].data", equalTo(null));
    }

    @Test
    public void test1wwTest() {


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[4].name", equalTo("Samsung Galaxy Z Fold2"));

    }

    @Test
    public void testwwww1Test() {


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[10].id", equalTo("11"));

    }


}
