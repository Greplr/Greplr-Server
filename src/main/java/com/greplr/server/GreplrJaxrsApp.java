package com.greplr.server;

import com.greplr.server.endpoints.CabEndpoint;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by championswimmer on 11/4/16.
 */
@ApplicationPath("/api/v1")
public class GreplrJaxrsApp extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> endpoints = new HashSet<>();

        endpoints.add(CabEndpoint.class);

        return endpoints;
    }
}
