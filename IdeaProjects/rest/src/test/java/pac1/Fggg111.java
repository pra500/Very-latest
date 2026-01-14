package pac1;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;





public class Fggg111 {



    @Test
    public void GdfkjTest() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200);

    }


    @Test
    public void GfTest() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200)
                .body("[0].code",equalTo("AF"));

    }


    @Test
    public void GfwefTest() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200)
                .body("[1].code",equalTo("AN"));

    }


    @Test
    public void GfbndebfTest() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200)
                .body("[1].name",equalTo("Antarctica"));
    }


    @Test
    public void GwjfewjfTest() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200)
                .body("[1].population",equalTo(1000));
    }

    @Test
    public void G666Test() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200)
                .body("[2].countries", equalTo(49));

    }






    @Test
    public void G9999Test() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200)
                .body("[2].code", equalTo("AS"));

    }

    @Test
    public void G000Test() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200)
                .body("",hasSize(7));

    }

    @Test
    public void G22244Test() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200);

    }

    @Test
    public void GTest() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200);

    }

    @Test
    public void G333Test() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200);

    }

    @Test
    public void G22Test() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200);

    }

    @Test
    public void GweTest() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200);

    }

    @Test
    public void G2222Test() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200);

    }

    @Test
    public void GddTest() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200);

    }

    @Test
    public void G323Test() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().statusCode(200);

    }




}
