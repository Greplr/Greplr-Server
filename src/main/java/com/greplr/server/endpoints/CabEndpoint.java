package com.greplr.server.endpoints;

import org.jboss.resteasy.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by championswimmer on 11/4/16.
 */
@Path("/cabs")
@Produces("application/json")
public class CabEndpoint {
    private static final Logger logger = Logger.getLogger(CabEndpoint.class);


    @GET
    public Response getCabs(
            @QueryParam("lat") long lat,
            @QueryParam("lng") long lng
    ) {

        return Response.status(Response.Status.OK).entity("{ \"jo\": \"jojo\" }").build();
    }
}
