package application;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joaki on 24.09.2017.
 */
@Path("/reservations/")
public class ReservationService {
    private static Map<String, Reservation> reservations= new HashMap<>();

    @GET
    @Path("/{reservationId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Reservation getReservation(@PathParam("reservationId") String reservationId) {
        return reservations.get(reservationId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Reservation> getReservations() {
        return reservations.values();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addReservation(Reservation reservation) {
        int tableId = reservation.getTableId();
        long from = reservation.getFrom();
        long to = reservation.getTo();
        String ifFailure = "tableId: " + tableId + " from: " + from + " to: " + to;
        Collection<Reservation> reservations = this.reservations.values();
        /*
        if(reservations.isEmpty()){
            this.reservations.put(reservation.getReservationId(), reservation);
            return Response.status(200).entity("Added").build();
        }
        */
        for (Reservation res : reservations) {
            int resTable = res.getTableId();
            long resFrom = res.getFrom();
            long resTo = res.getTo();
            ifFailure += " resTable: " + resTable + " " + " resFrom: " + resFrom + " resTo: " + resTo; // For debuging
            if (tableId != resTable) break;
            if (from<=resFrom && to>resFrom) return Response.status(400).entity(ifFailure).build();
            if (from>=resFrom && from<resTo) return Response.status(400).entity(ifFailure).build();
        }
        this.reservations.put(reservation.getReservationId(), reservation);
        return Response.status(200).entity("Added").build();
    }
}
