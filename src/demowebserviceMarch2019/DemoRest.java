package demowebserviceMarch2019;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DemoRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

RestAssured.baseURI="http://api.openweathermap.org";
		
		given().
		       param("q","London,uk").
		       param("APPID","bf2b6e71538b3fc624c7fbb25852e361").
		       when().
		       get("/data/2.5/weather").
		       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		       body("main.humidity",equalTo(59));
		    		   //hIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
		 //      header("Server","scaffolding on HTTPServer2");
		       
		       
		       
		       /*header("dfd","fsdfds").
		       cookie("dsfs","csder").
		       body()*/
		//Status code of the response
		//Content type 
		//Body
		//Header responses
	
}

	}


