package com.greplr.server;

import io.undertow.Undertow;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

/**
 * Created by championswimmer on 11/4/16.
 */
public class GreplrServer {

    public static void main(String[] args) {
        UndertowJaxrsServer jt = new UndertowJaxrsServer();
        GreplrJaxrsApp ga = new GreplrJaxrsApp();

        jt.deploy(ga);

        jt.start(
                Undertow.builder()
                        .addHttpListener(9000, "localhost")
        );

    }
}
