package pac1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Hkj {


    public static void main(String[] args) {




//        hasitem/hasitems - only work with array
//        containsString - must return string





        /*

        given().when().get("https://reqres.in/api/users?page=2").


                then().assertThat().statusCode(200).body("data.first_name",

                        hasItems("Michael", "Lindsay", "Tobias")).log().all();
*/


/*
        given().when().get("https://reqres.in/api/users?page=2").


                then().assertThat().statusCode(200).body("data.first_name",

                        hasItem("Tobias"));

  */



/*

        given().when().get("https://reqres.in/api/users?page=2").


                then().assertThat().statusCode(200).body("data.email",

                        hasItems("michael.lawson@reqres.in", "george.edwards@reqres.in"));



*/





        //needdddddddddddddddddddddddddddddd


        given().when().get("https://reqres.in/api/users/2").

                then().assertThat().statusCode(200).body("_meta.upgrade_url",

                        equalTo("https://app.reqres.in/upgrade")).and().body("_meta.features", hasItem("30 Second Backend Templates"));





        given().when().get("https://reqres.in/api/users/2").

                then().assertThat().statusCode(200).body("_meta.upgrade_url",

                        equalTo("https://app.reqres.in/upgrade")).and()
                .body("_meta.features", hasItems("Data Persistence","Real-time Analytics"));







        given().when().get("https://reqres.in/api/users/2").

                then().assertThat().statusCode(200).body("_meta.upgrade_url",

                        equalTo("https://app.reqres.in/upgrade")).and()
                .body("support.url", containsString("https://contentcaddy"));

























//equalTo(1));

    }
}
