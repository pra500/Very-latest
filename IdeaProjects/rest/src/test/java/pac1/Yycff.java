package pac1;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;


import static io.restassured.RestAssured.given;

public class Yycff {


    @Test
    public void geeTest()
    {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("[0].id", equalTo("3"));

    }


    @Test
    public void ge4Test()
    {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("[0].name", equalTo("Apple iPhone 12 Pro Max"));

    }



    @Test
    public void g222essweTest()
    {
    given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("", hasSize(3));

    }



    @Test
    public void ge22eTest()
    {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("name", hasItem
    ("Apple iPad Mini 5th Gen"));




    }



    @Test
    public void gswweeTest()
    {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("[0].id", equalTo("3"));

    }



    @Test
    public void ge33eTest() {

        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("[0].name", containsString("iPhone"));

    }
    @Test
    public void ge32223eTest()
    {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("name", hasItems("Apple iPad Mini 5th Gen"
                , "Samsung Galaxy Z Fold2"));

    }





    @Test
    public void g3eeTest()
    {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("[0].id", equalTo("3"));

    }


    @Test
    public void g1eeTest()
    {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("[0].id", equalTo("3"));

    }


    @Test
    public void g2eeTest()
    {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("[0].id", equalTo("3"));

    }




    @Test
    public void gesws33eTest()
    {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("[0].id", equalTo("3"));

    }




    @Test
    public void ge2233eTest()
    {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
                .then().assertThat().statusCode(200).body("[0].id", equalTo("3"));

    }












}
