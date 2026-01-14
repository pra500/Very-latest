package pac1;

import static io.restassured.RestAssured.given;

public class dvfadfd {


    //https://reqres.in/api/users?page=3

    public static
    void main(String[] args) {




        given().queryParam("page", 3).
                when().get("https://reqres.in/api/users")
                .then().assertThat().statusCode(200).log().all();








    }
}


