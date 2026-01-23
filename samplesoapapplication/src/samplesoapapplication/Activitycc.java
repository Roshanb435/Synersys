package samplesoapapplication;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;


@WebService(endpointInterface="samplesoapapp.")
public class Activitycc implements Activity{

	public String welcome(String str) {
		return "roshan";
	}
	

}
