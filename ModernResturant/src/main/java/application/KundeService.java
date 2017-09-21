package application;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joaki on 12.09.2017.
 */
@Path("/kunder/")
public class KundeService {
    private static Map<String,Kunde> kunder = new HashMap<>();

    @GET
    @Path("/{kundeId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Kunde getKunde(@PathParam("kundeId") String kundeId) throws javax.ws.rs.NotFoundException {
        if (kunder.get(kundeId) != null)  return kunder.get(kundeId);
        else throw new javax.ws.rs.NotFoundException("ID not found");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Kunde> getKunder() {
        return kunder.values();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addKunde(Kunde kunde) {
        kunder.put(kunde.getId(), kunde);
    }

    @DELETE
    @Path("/{kundeId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteKunde(@PathParam("kundeId") String kundeId) {
        if (kunder.get(kundeId) != null) {
            kunder.remove(kundeId);
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateKunde(Kunde kunde) throws javax.ws.rs.NotFoundException{
        if (kunder.get(kunde.getId()) != null) {
            kunder.get(kunde.getId()).setNavn(kunde.getNavn());
        }
        else throw new javax.ws.rs.NotFoundException("ID not found");
    }
}
