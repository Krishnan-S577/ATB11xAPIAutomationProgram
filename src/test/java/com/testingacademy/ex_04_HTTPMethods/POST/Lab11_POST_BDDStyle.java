package com.testingacademy.ex_04_HTTPMethods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab11_POST_BDDStyle {


    @Test
    public void test_POSTAuth(){

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(payload)
                .when()
                .log().all()
                .post()
                .then().log().all()
                .statusCode(200);

    }
}
