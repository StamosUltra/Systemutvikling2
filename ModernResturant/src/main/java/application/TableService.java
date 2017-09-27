package application;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joaki on 21.09.2017.
 */
@Path("/tables/")
public class TableService {
    private static Map<String, Table> tables = new HashMap<>();
    private static boolean addable = true;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Table> getTables(){
        return tables.values();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addTables(Table[] tables){
        if (addable) {
            for (Table t : tables) {
                this.tables.put(t.getTableId(), t);
            }
        }
        addable = false;
    }

    @GET
    @Path("/{seats}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Table> isEnoughSeats(@PathParam("seats")int guests) {
        Collection<Table> tabs = tables.values();
        Map<String, Table> returnTables = new HashMap<>();

        for (Table t : tabs) {
            int s = t.getSeats();
            if (s >= guests){
                returnTables.put(t.getTableId(), t);
            }
        }
        return returnTables.values();
    }
}
