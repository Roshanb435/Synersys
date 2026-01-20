package samplesoapapplication;
import jakarta.xml.ws.Endpoint;
public class Driver {

	public static void main(String[] args) {
		String url="http://localhost:8080/activity?wsdl";
		Endpoint.publish(url,new Activitycc());
		System.out.println("!!!! ccc !!!!");
	
		

	}

}
