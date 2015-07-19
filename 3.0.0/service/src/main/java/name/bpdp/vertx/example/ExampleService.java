package name.bpdp.vertx.example;

import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.ProxyIgnore;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import name.bpdp.vertx.example.impl.ExampleServiceImpl;
import io.vertx.serviceproxy.ProxyHelper;

/*
 * See https://github.com/vert-x3/vertx-service-proxy
 */


/**
 * @author <a href="http://bpdp.name">Bambang Purnomosidi</a>
 */
@ProxyGen
public interface ExampleService {

    /**
     * Create a service locally
     * 
     * @param vertx  the Vert.x instance
     * @return the service
     */
    static ExampleService create(Vertx vertx) {
        return new ExampleServiceImpl(vertx);
    }

    /**
     * Create a proxy for service
     * 
     * @param vertx  the Vert.x instance
     * @param address  the address on the event bus where the service is listening
     * @return proxy to the service
     */
    static ExampleService createProxy(Vertx vertx, String address) {
        return new ExampleServiceVertxEBProxy(vertx, address);    
    }
 
    /* Actual service operation
     */   
    void processMessage(String theMessage);

}
