package root;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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

	@Path(value="/players")
	@GET
	@Produces("text/plain")
	public String getPlayers() {
		return "Sandor, Arya and Claude";
	}

	@POST
	@Consumes("text/plain")
	@Produces("text/plain")
	public String battle(String playerName) {
		return "You won!"; // "You lose :(";
	}
}
