package minpakke;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author nilstes
 */
@Path("/search/")
public class SearchService {

    @GET 
    @Path("/{query}") 
    @Produces(MediaType.TEXT_PLAIN) 
    public String findSomething(@PathParam("query") String query) { 
        return DB.find(query); 
    }   
}
