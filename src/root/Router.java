package root;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value="/")
public class Router {
	public Router() {}
	
	@GET
	@Produces("text/plain")
	public String get() {
		return "Welcome to the Arena!";
	}
}
