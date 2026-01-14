package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;


public class TSV {
/*
    public static void main(String[] args) {

        //1:

        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)

                .body("page", equalTo(2)).and().body("per_page", equalTo(6));


        //2:

        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)

                .body("page", equalTo(2)).and().body("data", hasSize(6));


        //3:


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)

                .body("page", equalTo(2)).and().body("data.id", hasItem(7));


        //4:

        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)

                .body("page", equalTo(2)).and().body("data.id", hasItems(7, 9));


        //5:


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)

                .body("page", equalTo(2)).and().body("_meta.features", hasItem("30 Second Backend Templates"));


//6:

        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)

                .body("page", equalTo(2)).and().body("_meta.features", hasItems("30 Second Backend Templates",

                        "Data Persistence"));


        //7:


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)

                .body("page", equalTo(2)).and().body("data.email", hasItems("michael.lawson@reqres.in",

                        "tobias.funke@reqres.in"));


        //8:


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)

                .body("page", equalTo(2)).and().body("data.email", hasItem("michael.lawson@reqres.in"));


        //9:


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)

                .body("page", equalTo(2)).and().body("data[1].email", equalTo("lindsay.ferguson@reqres.in"));


        //10:


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)

                .body("page", equalTo(2)).and().body("data[1].last_name", equalTo("Ferguson"));


*/




    @Test
    public void egeggeTest()
    {

        //   https://fake-json-api.mock.beeceptor.com/users


        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then()
                .assertThat().statusCode(200)
                .body("id", hasItems(1, 6));


        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then()
                .assertThat().statusCode(200)
                .body("id", hasItems(1, 6));


        //hasitem , hasitems, hassize without name






        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then()
                .assertThat().statusCode(200)
                .body("id", hasItems(1, 6));


        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then()
                .assertThat().statusCode(200)
                .body("id", hasItems(1, 6));



        //  https://api.restful-api.dev/objects




        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then()
                .assertThat().statusCode(200)
                .body("id", hasItems(1, 6));




        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then()
                .assertThat().statusCode(200)
                .body("id", hasItems(1, 6));














    }



    }










