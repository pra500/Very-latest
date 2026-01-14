package pac1;
import org.hamcrest.Matchers.*;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.equalTo;

public class geeee {
    public static void main(String[] args) {


        //get
       int t= given().when().get("https://reqres.in/").then().assertThat().statusCode(200).hashCode();
        System.out.println(t);




        //get
        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200);
                      //  .body("data.year", equalTo("2019"));



    }
}
