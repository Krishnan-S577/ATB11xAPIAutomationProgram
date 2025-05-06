package com.testingacademy.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Lab02_RA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pin code!");
        String pin_code = sc.next();

        // Gherkins Syntax
        // Given() -> Pre Req. - URL, Headers, Auth, Body....
        // When() -> HTTP method? - GET/POST/PUT/PATCH, DELETE...
        // Then() -> Validation -> 200 oK, firstname == PRAMOD

        // Full URL - https://api.zippopotam.us/IN/560016
        // base URI - https://api.zippopotam.us
        // bath Path - /IN/560016

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                 .basePath("/IN/" + pin_code)
                .when()
                 .get()
                .then()
                 .log().all().statusCode(200);
    }
}
