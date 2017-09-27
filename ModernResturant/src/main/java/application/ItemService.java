package application;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joaki on 24.09.2017.
 */
@Path("/items/")
public class ItemService {
    private static Map<String, Item> items = new HashMap<>();
    private static boolean addable = true;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Item> getItems() {
        return items.values();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addItems(Item[] items) {
        if (addable) {
            for (Item i : items) {
                this.items.put(i.getName(), i);
            }
        }
        addable = false;
    }
}
