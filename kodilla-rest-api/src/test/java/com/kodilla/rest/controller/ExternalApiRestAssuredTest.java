package com.kodilla.rest.controller;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class ExternalApiRestAssuredTest {

    @Test
    void testGetPostShouldReturnStatus200AndValidateResponse() {
        given().  // [1]
                header("Content-Type", "application/json").
                when().
                get("https://jsonplaceholder.typicode.com/posts/1").  // [2]
                then().
                assertThat().
                statusCode(200).  //  [3]
                body("userId", equalTo(1)).  //  [4]
                body("id", equalTo(1)).
                body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")).
                body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")).
                log().all();  // [5]
    }

    @Test
    public void testPutPost() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        String jsonBody = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .put("/posts/1");
        response.then().statusCode(200);
        String responseBody = response.asString();
        System.out.println(responseBody);
    }

    @Test
    public void testAddPost() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        String jsonBody = "{ \"title\": \"Woo\", \"body\": \"hoo\", \"userId\": 1 }";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .post("/posts");

        response.then().statusCode(201);

        String responseBody = response.asString();
        System.out.println(responseBody);
    }
}