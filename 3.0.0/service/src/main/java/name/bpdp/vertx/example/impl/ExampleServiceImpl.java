package name.bpdp.vertx.example.impl;

import io.vertx.core.*;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import name.bpdp.vertx.example.ExampleService;

/**
 * @author <a href="http://bpdp.name">bpdp</a>
 */
public class ExampleServiceImpl implements ExampleService {

	private static final Logger log = LoggerFactory.getLogger(ExampleService.class);

	private final Vertx vertx;

	public ExampleServiceImpl(Vertx vertx) {
		this.vertx = vertx;
	}

	public void processMessage(String theMessage) {

        String res = theMessage + " has been processed!";

        System.out.println(res);

	}

}
