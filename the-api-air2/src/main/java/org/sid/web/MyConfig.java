package org.sid.web;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	public ResourceConfig getJersey() {
		ResourceConfig config = new ResourceConfig();
		config.register(MagasinRestService.class);
		return config;
	}
}
