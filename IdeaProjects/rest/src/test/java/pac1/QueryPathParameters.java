package pac1;

import static io.restassured.RestAssured.given;

public class QueryPathParameters {

    public static void main(String[] args) {

        {

            //path params:

            //       https://reqres.in/api/users/2{
            given().pathParam("id", 2).when().get("https://reqres.in/api/users/{id}")

                    .then().assertThat().statusCode(200);



            //query params:

            //   https://reqres.in/api/users?page=2

            given().queryParam("page", 2).

                    when().get("https://reqres.in/api/users")
                    .then().statusCode(200).log().all();










//path:
          //  given().























        }

    }
}
