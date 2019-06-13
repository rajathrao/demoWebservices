package demowebserviceMarch2019;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DemoPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

RestAssured.baseURI="https://reqres.in";
		
		given().		body("{"+
				  "\"email\": \"sydney@fife\","+
				
				"}")
		.when()
		.post("/api/register")
		.then()
		.assertThat().statusCode(400);
}

	}


