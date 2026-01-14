package pac1;

import org.testng.annotations.Test;

import javax.management.MBeanAttributeInfo;

import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;
import static io.restassured.RestAssured.given;

public class ddd {


    public static void main(String[] args) {


        given().when().get("https://api.restful-api.dev/objects/7").then().
                assertThat().statusCode(200).log().all();








    }
}
