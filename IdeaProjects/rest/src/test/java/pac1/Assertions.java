package pac1;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;


    public class Assertions {
    public static void main(String[] args) {

        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("[1].id", equalTo("2"));



                given().when().get("https://api.restful-api.dev/objects")
                        .then().assertThat().statusCode(200)
                        .body("[0].data.capacity", equalTo("128 GB"))
                                .body("[0].name", equalTo("Google Pixel 6 Pro"));



        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("[0].data.capacity", containsString("GB"));



        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("[4].name", containsString("Z"));



        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("id", contains(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));



        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200)
                .body("name", hasItems("Google Pixel 6 Pro", "Apple iPhone 12 Mini, 256GB, Blue","Apple iPhone 12 Pro Max","Apple iPhone 11, 64GB","Samsung Galaxy Z Fold2",
                        "Apple AirPods","Apple MacBook Pro 16","Apple Watch Series 8","Beats Studio3 Wireless","Apple iPad Mini 5th Gen"));




        given()
                .when().get("https://reqres.in/api/users?page=2")
                .then().statusCode(200).body("data.size()",equalTo(6));


        given().when().post("https://dummy-json.mock.beeceptor.com/posts")
                .then().statusCode(200).body("", equalTo(10));



















    }
}
