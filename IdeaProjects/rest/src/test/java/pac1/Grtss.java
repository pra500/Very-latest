package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

public class Grtss {

   @Test
    public void getee() {

       given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).
               body("data.id", equalTo(2));
   }




    @Test
    public void getee1() {

        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).
                body("data.id", equalTo(2)).and().body("support.text"
                        , equalTo("Tired of writing endless social media content? Let Content Caddy generate it for you."));
    }

    @Test
    public void getee2() {

        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).
                body("data.id", equalTo(2)).and().body("data.email"
                        , equalTo("janet.weaver@reqres.in"));

    }

    @Test
    public void getee3() {

        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).
                body("data.id", equalTo(2)).and().body("_meta.powered_by"
                        , notNullValue());
    }

    @Test
    public void getee4() {


        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).
                body("data.id", equalTo(2)).and().body("_meta.powered_by"
                        , containsString("De"));

    }  @Test
    public void getee5() {


        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).
                body("data.id", equalTo(2)).and().body("_meta.powered_by"
                        , containsString("Dep"));

    }  @Test
    public void getee6() {


        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).
                body("data.id", equalTo(2)).and().body("_meta.powered_by"
                        , containsString("Depl"));
    }
    @Test
    public void getee7() {
        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).
                body("data.id", equalTo(2)).and().body("_meta.powered_by"
                        , notNullValue());

    }  @Test
    public void getee8() {

        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).
                body("data.id", equalTo(2)).and().body("_meta.docs_url"
                        , notNullValue());
    }  @Test
    public void getee9() {


        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).
                body("data.id", equalTo(2)).and().body("_meta.docs_url"
                        , containsString("ht"));
    }  @Test
    public void getee10() {


        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).
                body("data.id", equalTo(2)).and().body("_meta.docs_url"
                        , containsString("h"));
    }





















        


    }