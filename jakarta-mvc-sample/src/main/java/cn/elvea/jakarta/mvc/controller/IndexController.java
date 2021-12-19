package cn.elvea.jakarta.mvc.controller;

import cn.elvea.jakarta.mvc.service.UserService;
import jakarta.inject.Inject;
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

    @Inject
    UserService userService;

    @GET
    public String hello() {
        userService.test();
        return "index.jsp";
    }

    @GET
    @Path("json")
    public Response json() {
        return Response.ok().type(MediaType.APPLICATION_JSON).entity("Hello World.").build();
    }

}
