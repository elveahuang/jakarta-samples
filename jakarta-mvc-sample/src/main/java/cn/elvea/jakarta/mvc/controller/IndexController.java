package cn.elvea.jakarta.mvc.controller;

import jakarta.mvc.Controller;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * IndexController
 *
 * @author elvea
 */
@Path("/")
@Controller
public class IndexController {

    @GET
    public String hello() {
        return "index.jsp";
    }

    @GET
    @Path("json")
    public Response json() {
        return Response.ok().type(MediaType.APPLICATION_JSON).entity("Hello World.").build();
    }

}
