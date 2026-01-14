package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;



public class yf {


    @Test
    public void tHHTest() {

        given().when().get("https://fake-json-api.mock.beeceptor.com/companies")
                .then().assertThat()
                .statusCode(200).body("[0].id", equalTo(1));


    }

    @Test
    public void tHHxxTest() {


        given().when().get("https://fake-json-api.mock.beeceptor.com/companies")
                .then().assertThat().assertThat()
                .statusCode(200).body("[1].name", equalTo("Turcotte, Ankunding and Koss"));

    }
    @Test
    public void tHzcvdvHTest() {


        given().when().get("https://fake-json-api.mock.beeceptor.com/companies")
                .then().assertThat().assertThat()
                .statusCode(200).body("[1].country", equalTo("Namibia"));


    }
}