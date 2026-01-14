package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ddddd {





    @Test
    public void geTest()
    {
//        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
//                .then().assertThat().statusCode(200).body("[0].id", equalTo(1));\


        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200).body("[0].id", equalTo("1"));
    }




    @Test
    public void gseTest()
    {
//        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
//                .then().assertThat().statusCode(200).body("username", hasItem("Estefania_Schuppe75"));

        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200).body("[0].data.color", equalTo("Cloudy White"));



        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200).body("name", hasItem("Google Pixel 6 Pro"));

    }
    @Test
    public void gsseTest()
   {
//        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
//                .then().assertThat().statusCode(200)
//                .body("username", hasItems("Estefania_Schuppe75", "Davon.Kuhn", "Benny_Gibson"));


    given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200).body("name", hasItems("Apple iPhone 12 Mini, 256GB, Blue", "Apple iPhone 11, 64GB", "Apple iPad Air"));



    }














}





