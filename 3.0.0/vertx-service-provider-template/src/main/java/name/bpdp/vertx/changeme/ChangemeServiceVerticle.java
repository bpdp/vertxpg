package name.bpdp.vertx.changeme;

import io.vertx.core.AbstractVerticle;
import io.vertx.serviceproxy.ProxyHelper;

import io.vertx.core.*;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import name.bpdp.vertx.changeme.impl.ChangemeServiceImpl;

/**
 * A verticle that starts an instance of a Changeme service
 *
 */
public class ChangemeServiceVerticle extends AbstractVerticle {

	ChangemeService service;

    @Override
    public void start() throws Exception {
		service = new ChangemeServiceImpl();
		ProxyHelper.registerService(ChangemeService.class, vertx, service, "vertx.changeme");
	}

}
