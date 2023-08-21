package nam.fpt.mediamarketing;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
//import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.IOException;

//@SpringBootApplication
public class MediaMarketingApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(MediaMarketingApplication.class, args);
//	}
public static void main(String[] args) {
	HttpClient httpClient = HttpClients.createDefault();
	HttpGet httpGet = new HttpGet("https://api.dongvanfb.net/user/balance?apikey=36458879248967a36");

	try {
		HttpResponse response = httpClient.execute(httpGet);
		String responseBody = EntityUtils.toString(response.getEntity());

		System.out.println("API Response: " + responseBody);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
