package com.testingacademy.ex_04_HTTPMethods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab13_PATCH_NonBDDStyle {

    ValidatableResponse vr;
    Response response;
    RequestSpecification r;


    @Test
    public void test_patch_non_bdd() {
        String token = "540888dacf8f581";
        String bookingid = "2456";

        String payloadPatch ="{\n" +
                "    \"firstname\" : \"Krishnan\",\n" +
                "    \"lastname\" : \"Dazzy\"\n" +
                "}";
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);

        r.body(payloadPatch).log().all();

        response = r.when().log().all().patch();

        vr = response.then().log().all().statusCode(200);

    }
}
