package minpakke;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author nilstes
 */
@Path("/temperatures/") 
public class TemperatureService {
    
    @GET 
    @Produces(MediaType.APPLICATION_JSON) 
    public List<TemperatureSeries> getTemperatures() { 
        List<TemperatureSeries> temp = new ArrayList<TemperatureSeries>();
        temp.add(new TemperatureSeries("Trondheim siste 12 mnd", new double[] {
            13.8, 11.0, 5.9, 2.5, 2.5, -2.3, 3.7, 3.4, 5.7, 9.5, 12.0, 19.1}));
        temp.add(new TemperatureSeries("Trondheim Normalt", new double[] {
            12.5, 9.0, 5.5, 0.5, -2.0, -3.0, -2.5, 0.0, 3.0, 9.0, 12.0, 13.0}));   
        return temp;
    }   
}
