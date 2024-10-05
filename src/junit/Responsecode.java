package junit;


import java.net.HttpURLConnection;

import java.net.URI;


import org.junit.Test;

public class Responsecode {
	String link="https://www.facebook.com";
	
	@Test
	public void test() throws Exception
	{
		URI ob=new URI(link);
		HttpURLConnection c=(HttpURLConnection)ob.toURL().openConnection();
		System.out.println(c.getResponseCode());
	}

}
