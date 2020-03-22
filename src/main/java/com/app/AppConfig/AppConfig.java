package com.app.AppConfig;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("fc")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		packages("com.app");
	}
}
