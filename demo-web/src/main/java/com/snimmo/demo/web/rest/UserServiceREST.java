package com.snimmo.demo.web.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.snimmo.demo.web.model.User;
import com.snimmo.demo.web.service.UserService;

@Path("/users")
@RequestScoped
public class UserServiceREST {

    @Inject
    private Logger log;

    @Inject
    private UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> findAllUsers() {
    	log.fine("");
        return userService.findAll();
    }

    @GET
    @Path("/{id:[0-9][0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public User findById(@PathParam("id") long id) {
    	log.fine(id + "");
        return userService.findById(id);
    }

}
