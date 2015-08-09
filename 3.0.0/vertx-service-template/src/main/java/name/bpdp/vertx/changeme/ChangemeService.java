package name.bpdp.vertx.changeme;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import io.vertx.core.Vertx;
import io.vertx.serviceproxy.ProxyHelper;

import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.ProxyIgnore;
import io.vertx.codegen.annotations.VertxGen;

import name.bpdp.vertx.changeme.impl.ChangemeServiceImpl;

@ProxyGen
public interface ChangemeService {

	static ChangemeService create(JsonObject config) {
		try {
			return new ChangemeServiceImpl();
		} catch (Exception e) {
			return null; 
		}
	}

    static ChangemeService createProxy(Vertx vertx, String address) {
      return ProxyHelper.createProxy(ChangemeService.class, vertx, address);
    }

    // Actual service operations here...
    void method1 (String method1Arg);
}
