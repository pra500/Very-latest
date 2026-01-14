package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Iox {



    @Test
    public void iosxTest(){

        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().assertThat().statusCode(200)
                .body("[0].id", equalTo(1));

    }

    @Test
    public void iosssxxxTest(){


        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().assertThat().statusCode(200)
                .body("[4].userId", equalTo(5));


    }


    @Test
    public void ioseessxTest(){


given().when().get("https://dummy-json.mock.beeceptor.com/posts").then().assertThat().
        statusCode(200).body("[0].title",  equalTo("Introduction to Artificial Intelligence"))
        .and().body("[0].body",  equalTo("Learn the basics of Artificial Intelligence and its applications in various industries."));


    }


}
