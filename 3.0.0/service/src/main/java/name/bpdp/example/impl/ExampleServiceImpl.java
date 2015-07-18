package name.bpdp.example.impl;

import io.vertx.core.*;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.impl.LoggerFactory;
import name.bpdp.example.ExampleService;

/**
 * @author <a href="http://bpdp.name">bpdp</a>
 */
public class ExampleServiceImpl implements ExampleService {

	private static final Logger log = LoggerFactory.getLogger(ExampleService.class);

	private final Vertx vertx;
	private final JsonObject config;

	public ExampleServiceImpl(Vertx vertx, JsonObject config) {
		this.vertx = vertx;
		this.config = config;
	}

	@Override
	public void start() throws Exception {

		System.out.println("I start the service ...");
  
	}

	@Override
 	public void stop() {

		System.out.println("I stop the service ...");
	
	}

}
