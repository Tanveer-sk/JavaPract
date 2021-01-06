package pract1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Test1 {
  @Test
  public void f() {
	  
	  System.out.println("test");
	  
	  RestAssured.baseURI="";
	  }
}
