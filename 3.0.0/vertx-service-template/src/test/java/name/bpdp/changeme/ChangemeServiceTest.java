package name.bpdp.vertx.changeme;

import io.vertx.codetrans.annotations.CodeTranslate;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestOptions;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.eventbus.DeliveryOptions;

import name.bpdp.vertx.changeme.ChangemeServiceVerticle;

@RunWith(VertxUnitRunner.class)
public class ChangemeServiceTest {

	Vertx vertx = Vertx.vertx();

	@Before
	public void before(TestContext context) {

		JsonObject config = new JsonObject().put("address", "vertx.changeme");
		DeploymentOptions depOptions = new DeploymentOptions().setConfig(config);

		vertx.deployVerticle("service:name.bpdp.vertx.changeme.changeme-service", depOptions, res -> {
			if (res.succeeded()) {
				System.out.println("Start service - succeed");
			} else {
				System.out.println("Start service - failed");
			}
		});


	}

	@After
	public void after(TestContext context) {
		vertx.close();
	}

	@Test
	public void testMethod1(TestContext context) {

       // Create a proxy
        ChangemeService service = ChangemeService.createProxy(vertx, "vertx.changeme");

        // Save some data in the database - this time using the proxy
        service.method1("uhui", res2 -> {
            assertTrue(res2.succeeded());
        });
	}

}
