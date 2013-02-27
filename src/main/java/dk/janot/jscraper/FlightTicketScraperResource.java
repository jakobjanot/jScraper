/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.janot.jscraper;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;

/**
 * REST Web Service
 *
 * @author jaj
 */
public class FlightTicketScraperResource {

    private String id;

    /**
     * Creates a new instance of FlightTicketScraperResource
     */
    private FlightTicketScraperResource(String id) {
        this.id = id;
    }

    /**
     * Get instance of the FlightTicketScraperResource
     */
    public static FlightTicketScraperResource getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of FlightTicketScraperResource class.
        return new FlightTicketScraperResource(id);
    }

    /**
     * Retrieves representation of an instance of dk.janot.jscraper.FlightTicketScraperResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of FlightTicketScraperResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }

    /**
     * DELETE method for resource FlightTicketScraperResource
     */
    @DELETE
    public void delete() {
    }
}
