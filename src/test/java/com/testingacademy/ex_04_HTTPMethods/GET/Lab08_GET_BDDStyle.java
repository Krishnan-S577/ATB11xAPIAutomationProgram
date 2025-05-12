package com.testingacademy.ex_04_HTTPMethods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab08_GET_BDDStyle {

    @Test
    public void test_PositiveTC(){
        String pincode = "560013";

        RestAssured.given()
                   .baseUri("https://api.zippopotam.us")
                   .basePath("/IN/" + pincode)
                .when()
                   .log().all().get()
                .then()
                    .log().all().statusCode(200);

    }
}
