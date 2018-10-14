package at.htl.vehicle.model;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

@Path("vehicle")
public class VehicleEndpoint {

    @GET
    @Path("{id}")
    public Vehicle find(@PathParam("id") long id) {
        return new Vehicle("Mercedes "  + id, "A-Class");
    }

    @GET
    public List<Vehicle> findAll() {
        List<Vehicle> all = new ArrayList<Vehicle> ();
        all.add(find(42));
        return all;
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") long id){
        System.out.println("Deleted " + id);
    }

    @POST
    public void save(Vehicle vehicle){
        System.out.println("Vehicle " + vehicle);
    }
}
