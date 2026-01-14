package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class yed {

    @Test
    public void tTest(){


        given().when().get("https://automationexercise.com/api/productsList")
                .then().assertThat().statusCode(200);



    }



    @Test
    public void tqTest(){


        given().when().get("https://automationexercise.com/api/productsList")
                .then().assertThat().statusCode(200);





    }

    @Test
    public void tq1Test(){


        given().when().post("https://automationexercise.com/api/productsList")
                .then().assertThat().statusCode(200);



    }
    @Test
    public void tq2Test(){


        given().when().get("https://automationexercise.com/api/productsList")
                .then().assertThat().statusCode(200);



    }
    @Test
    public void tq3Test(){


        given().when().get("https://automationexercise.com/api/verifyLogin")
                .then().assertThat().statusCode(200);



    }





}
