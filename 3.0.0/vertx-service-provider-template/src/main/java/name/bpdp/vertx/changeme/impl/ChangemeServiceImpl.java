package name.bpdp.vertx.changeme.impl;

import io.vertx.core.Vertx;
import io.vertx.core.Future;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.serviceproxy.ProxyHelper;
import name.bpdp.vertx.changeme.ChangemeService;

public class ChangemeServiceImpl implements ChangemeService {

    // Actual service operations here...
    @Override
	public void method1(String method1Arg, Handler<AsyncResult<String>> resultHandler) {
		resultHandler.handle(Future.succeededFuture(method1Arg + " processed!"));
	}

}
