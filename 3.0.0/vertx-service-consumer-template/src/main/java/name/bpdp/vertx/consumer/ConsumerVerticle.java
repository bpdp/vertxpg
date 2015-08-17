package name.bpdp.vertx.consumer;

import io.vertx.core.AbstractVerticle;
import name.bpdp.vertx.changeme.ChangemeService;

public class ConsumerVerticle extends AbstractVerticle {

  @Override
  public void start() throws Exception {

      ChangemeService service = ChangemeService.createProxy(vertx, "vertx.changeme");

      service.method1("Wahu", (r) -> {

      if (r.succeeded()) {
        System.out.println(r.result());
      } else {
        System.out.println(r.cause());
      }
    });
  }
}
