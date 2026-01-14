package pac1;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Ygggg {

    @Test
    public void YgTest(){


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().
                statusCode(200).body("[0].id", equalTo("1"));

    }


    @Test
    public void YgfsffTest(){



        given().when().get("https://api.restful-api.dev/objects").then().assertThat().
                statusCode(200).body("[1].id", notNullValue());
    }
    @Test
    public void YgfffTest(){


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().
                statusCode(200).body("[1].name", containsString("Apple iPhone 12 Mini, 256GB, Blue"));
    }

    @Test
    public void YffgTest(){



        given().when().get("https://api.restful-api.dev/objects").then().assertThat().
                statusCode(200).body("[2].id", equalTo("3"));



    }
    @Test
    public void YgdfTest(){



        given().when().get("https://api.restful-api.dev/objects").then().assertThat().
                statusCode(200).body("[7].id", notNullValue());

    }
    @Test
    public void YgdddTest(){




        given().when().get("https://api.restful-api.dev/objects").then().assertThat().
                statusCode(200).body("[8].id", notNullValue());

    }







}
