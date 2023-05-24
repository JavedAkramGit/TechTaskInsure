package API.Auto;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.module.jsv.JsonSchemaValidator;
 

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;



public class ApiTests {

	
	public String get_url = "https://reqres.in/api/users";
	public String get_url_byid = "https://reqres.in/api/users/{id}";
	
	public String post_url = "https://reqres.in/api/users";
	
	
	@Test(priority=1)
	public void check_get()
	{
		int page=2;
		int id=10;
		given().queryParam("page", page).when().get(get_url).then().statusCode(200)
		.body("page", equalTo(page)).log().all();
		
		given().pathParam("id", id).when().get(get_url_byid).then().body("data.first_name", equalTo("Byron")).log().all();
		
	}
	
	
	@Test(priority=2)
	public void check_post()
	{
		
	HashMap hm = new HashMap();
		
	hm.put("name", "BA");
	hm.put("job", "BA");
	
	given().contentType(ContentType.JSON).accept(ContentType.JSON).body(hm).when().post(post_url)
	.then().statusCode(201).body("id",greaterThan(0)).body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema.json"));;
	
	
		
	}
	
	
}
