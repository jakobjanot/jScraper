/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.janot.jscraper;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author jaj
 */
@Path("/flightticketscraper")
public class FlightTicketScrapersResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FlightTicketScrapersResource
     */
    public FlightTicketScrapersResource() {
    }

    /**
     * Retrieves representation of an instance of dk.janot.jscraper.FlightTicketScrapersResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * POST method for creating an instance of FlightTicketScraperResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response postJson(String content) {
        //TODO
        return Response.created(context.getAbsolutePath()).build();
    }

    /**
     * Sub-resource locator method for {id}
     */
    @Path("{id}")
    public FlightTicketScraperResource getFlightTicketScraperResource(@PathParam("id") String id) {
        return FlightTicketScraperResource.getInstance(id);
    }
}
