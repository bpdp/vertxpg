package name.bpdp.example;

import io.vertx.core.AbstractVerticle;
import io.vertx.serviceproxy.ProxyHelper;

import name.bpdp.example.ExampleService;

/**
 * @author <a href="http://bpdp.name">bpdp</a>
 */
public class ExampleServiceVerticle extends AbstractVerticle {

	protected ExampleService service;
	
	@Override
	public void start() throws Exception {

		service = ExampleService.create(vertx, config());

		// And register it on the event bus against the configured address
		String address = config().getString("address");
		if (address == null) {
			throw new IllegalStateException("address field must be specified in config for service verticle");
		}
		ProxyHelper.registerService(ExampleService.class, vertx, service, address);

		// Start it
		service.start();
	}

	@Override
	public void stop() throws Exception {
		if (service != null) {
			service.stop();
		}
	}
}
