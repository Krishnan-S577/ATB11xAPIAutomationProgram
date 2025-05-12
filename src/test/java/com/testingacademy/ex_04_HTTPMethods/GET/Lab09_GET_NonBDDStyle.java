package com.testingacademy.ex_04_HTTPMethods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab09_GET_NonBDDStyle {


    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_GET_NonBDD(){
        String pincode = "560013";

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        response = r.when().log().all().get();
        System.out.println(response.asString());

        vr = response.then().log().all().statusCode(200);
    }
}
