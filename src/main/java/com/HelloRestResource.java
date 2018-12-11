package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/hello")
public class HelloRestResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHello() {
        String json = "{\"Hello\" : \"world!\"}";
        ResponseBuilder builder = Response.ok(json);
        return builder.build();
    }

}
