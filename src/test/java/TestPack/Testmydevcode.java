package TestPack;
import org.testng.Assert;
import org.testng.annotations.Test;

import frontend.webpageone;

public class Testmydevcode {

	@Test
	public void test_wpone(){
		webpageone obj = new webpageone();
		if(obj.syso()){
			Assert.assertTrue(true);
		}
		
	}
}
