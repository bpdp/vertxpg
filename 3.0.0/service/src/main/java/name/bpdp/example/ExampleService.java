package name.bpdp.example;

import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.ProxyIgnore;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import name.bpdp.example.impl.ExampleServiceImpl;
import io.vertx.serviceproxy.ProxyHelper;

/**
 * @author <a href="http://bpdp.name">Bambang Purnomosidi</a>
 */
@VertxGen
@ProxyGen
public interface ExampleService {

  /**
   * Create a service locally
   *
   * @param vertx  the Vert.x instance
   * @param config  the configuration
   * @return the service
   */
  static ExampleService create(Vertx vertx, JsonObject config) {
    return new ExampleServiceImpl(vertx, config);
  }

  /**
   * Create an event bus proxy to a service which lives somewhere on the network and is listening on the specified
   * event bus address
   *
   * @param vertx  the Vert.x instance
   * @param address  the address on the event bus where the service is listening
   * @return
   */
  static ExampleService createEventBusProxy(Vertx vertx, String address) {
    return ProxyHelper.createProxy(ExampleService.class, vertx, address);
  }

  /**
   * Start the service
   */
  @ProxyIgnore
  public void start() throws Exception;

  /**
   * Stop the service
   */
  @ProxyIgnore
  public void stop();
}
