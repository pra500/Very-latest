package pac1;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Dxd {

    @Test
    public void gewsswTest() {


        //    https://reqres.in/api/users?page=2
        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data[0].id", equalTo(7));

    }


    @Test
    public void gezcTest() {
        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data[0].id", notNullValue());


    }

    @Test
    public void ge1Test() {
        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data[0].email", notNullValue());


    }

    @Test
    public void ge2Test() {


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data", hasSize(greaterThan(3)));


    }

    @Test
    public void ge3Test() {


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data[2].id", equalTo(9));


    }

    @Test
    public void ge4Test() {


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data[2].email", containsString("tobias.funke@reqres.in"));


    }

    @Test
    public void ge5Test() {


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data.id", hasItems(8, 9));

    }

    @Test
    public void ge6Test() {


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data.id", hasItem(8));


    }

    @Test
    public void ge7Test() {


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data", hasSize(lessThanOrEqualTo(20)));


    }

    @Test
    public void ge8Test() {
        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data", hasSize(lessThan(20)));

    }

    @Test
    public void ge9Test() {

        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data", hasSize(lessThan(20)));


    }

    @Test
    public void ge10Test() {
        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200)
                .body("data.email", containsString("anet"));


    }


    @Test
    public void ge10TestTest() {
        given().when().get("https://dummy-json.mock.beeceptor.com/continents").then().assertThat().statusCode(200)
                .body("", hasSize(7));
    }


    @Test
    public void ge10TesssssstTest() {
        given().when().get("https://reqres.in/api/unknown").then().assertThat().statusCode(200)
                .body("data", hasSize(6));
    }


    @Test
    public void ge1ss0TestTest() {
        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data", hasSize(6));

    }

    @Test
    public void ge1scfvdf440TestTest() {
        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("_meta.features", hasSize(4));


    }


}



