package TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import BasePackage.TestBase;

public class LoginTestCase extends TestBase{
 
  public LoginTestCase() throws IOException {
		super();
		
  }
  @Test
  public void logintest() {
	  initialization();
  }
  
  @Test
  public void office(){
	  system.out.println("Office Code")
}
}
