package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;


public class fvf {

    @Test(priority = 0)
    public void fsFGsdddTest()
    {


        given().when().get("https://api.restful-api.dev/objects")
                .then().statusCode(200).body("[0].id", equalTo("1"));
    }


    @Test(priority = 0)
    public void fsFGTest()
    {



        given().when().get("https://api.restful-api.dev/objects")
                .then().statusCode(200).body("[0].name", containsString("Google Pixel"));


    }


    @Test(priority = 1)
    public void fFwwGTest()
    {


        given().when().get("https://api.restful-api.dev/objects")
                .then().statusCode(200).body("[1].name", notNullValue());
    }
    @Test(priority = 2)
    public void fFwwwGTest()
    {


        given().when().get("https://api.restful-api.dev/objects")
                .then().statusCode(200).body("[1].name", containsString("Mini"));
    }@Test(priority = 3)
    public void fFG55Test()
    {

        given().when().get("https://api.restful-api.dev/objects")
                .then().statusCode(200).body("[1].data", equalTo(null));
    }@Test(priority = 4)
    public void fFG33Test()
    {


        given().when().get("https://api.restful-api.dev/objects")
                .then().statusCode(200).body("[2].data.color", equalTo("Cloudy White"));
    }




}
