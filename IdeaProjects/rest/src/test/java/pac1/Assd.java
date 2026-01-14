package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Assd {

    /*

    @Test
    public void nnTest()
    {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat()
                .statusCode(200).body("[0].name", equalTo("Google Pixel 6 Pro"));

    }

    @Test
    public void nn3Test() {

        given().when().get("https://jsonplaceholder.typicode.com/users").then().assertThat()
                .statusCode(200).body("[0].address.street", notNullValue());

    }


    @Test
    public void nn33Test() {
        given().when().get("https://reqres.in/api/users/2").then().assertThat()
                .statusCode(200).body("_meta.features", hasItem("30 Second Backend Templates"));

    }

    @Test
    public void nn4Test() {

        given().when().get("https://reqres.in/api/users/2").then().assertThat()
                .statusCode(200).body("_meta.features", hasItems("30 Second Backend Templates"
                        , "Custom API Endpoints", "Data Persistence"));


    }


    @Test
    public void nn5Test() {
        given().when().get("https://reqres.in/api/users/2").then().assertThat()
                .statusCode(200).body("_meta.features", hasSize(4));


    }


    @Test
    public void nnw5Test() {
        given().when().get("https://reqres.in/api/users/2").then().assertThat()
                .statusCode(200).body("_meta.docs_url", containsString("https://reqres.in"));


    }


    @Test
    public void nnwss5Test() {
        given().when().get("https://reqres.in/api/users/2").then().assertThat()
                .statusCode(200).body("support.url",
                        containsString("https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral"));


    }


    @Test
    public void nnwsws5Test() {
        given().when().get("https://reqres.in/api/users/2").then().assertThat()
                .statusCode(200).body("_meta.features[1]",
                        containsString("Custom API Endpoints"));


    }

*/

    @Test
    public void nnwsws51Test() {
        given().when().get("https://reqres.in/api/users/2").then().assertThat()
                .statusCode(200).body("data.email",
                        containsString("janet.weaver@reqres.in"));



    }







    @Test
    public void nnwswss53Test() {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10").then().assertThat()
                .statusCode(200).body("[0].name",
                        containsString("Apple iPhone 12 Pro Max"));


    }





    @Test
    public void nnwsddwss53Test() {
        given().when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10").then().assertThat()
                .statusCode(200).body("[1].name",
                        containsString("Samsung Galaxy Z Fold2"));


    }






}
