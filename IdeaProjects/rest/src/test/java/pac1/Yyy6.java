package pac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Yyy6 {

    public static void main(String[] args) {

        given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200)
                .body("[1].id", equalTo("5"));



        given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200)
                .body("[1].name", equalTo("Samsung Galaxy Z Fold2"));


        given().when().
                get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200).body("[0].id", equalTo("3"));


        given().when().
                get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200).body("[0].name", equalTo("Apple iPhone 12 Pro Max"));


        given().when().
                get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200).body("[0].name", containsString("Apple"));


        given().when().
                get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200).body("[0].data.color", containsString("Cloudy White"));


        given().when().
                get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200).body("[0].data.capacity GB", equalTo(512));


        given().when().
                get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200).body("[1].id", equalTo(5));

        given().when().
                get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200).body("[2].id", equalTo(10));


        given().when().
                get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200).body("", hasSize(3));


        given().when().
                get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("id", hasItems("3", "5", "10"));


        given().when().
                get("https://reqres.in/api/users?page=2")
                .then().assertThat().statusCode(200)
                .body("id", hasItem("3"), "5");
    }
}






