package name.bpdp.vertx.changeme.impl;

import io.vertx.core.Vertx;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.serviceproxy.ProxyHelper;
import name.bpdp.vertx.changeme.ChangemeService;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;

public class ChangemeServiceImpl implements ChangemeService {

    // A couple of factory methods to create an instance and a proxy

	public ChangemeServiceImpl() throws Exception {

		System.out.println("Starting Changeme service ...");
	
	}

    // Actual service operations here...

	public void method1 (String method1Arg, Handler<AsyncResult<Void>> resultHandler) {
		System.out.println(method1Arg + " pocessed!");
	}

}
