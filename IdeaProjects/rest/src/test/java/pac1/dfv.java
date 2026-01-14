package pac1;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.assertj.core.condition.Not;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static  org.hamcrest.Matchers.*;

public class dfv {



    @Test
    public void test1Test(){

        given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments").then().assertThat()
                .statusCode(200).body("[0].id", equalTo(1));



    }

    @Test
    public void testdcTest(){
        given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments").then().assertThat()
                .statusCode(200).body("[0].name", containsString("id labore ex et quam"));

    }
    @Test
    public void testsdvTest(){

        given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments").then().assertThat()
                .statusCode(200).body("[0].email", containsString("Eliseo@gar"));


    }
    @Test
    public void dffTest()
    {

        given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments").then().assertThat()
                .statusCode(200).body("", hasSize(5));


    }
    @Test
    public void test133Test(){

        given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments").then().assertThat()
                .statusCode(200).body("[3].name", notNullValue());

    }
    @Test
    public void test16Test(){

        given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments").then().assertThat()
                .statusCode(200).body("[3].name", notNullValue());

    }













}
