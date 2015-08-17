Run service provider:

vertx run name.bpdp.vertx.changeme.ChangemeServiceVerticle -cp build/libs/vertx-service-provider-template-1.0.0.jar -cluster

Then, open another terminal, and then:

vertx run name.bpdp.vertx.consumer.ConsumerVerticle -cp ../vertx-service-provider-template/build/libs/vertx-service-provider-template-1.0.0.jar:build/libs/vertx-service-consumer-template-1.0.0.jar -cluster
Starting clustering... 
No cluster-host specified so using address 192.168.1.10 
Succeeded in deploying verticle 
Wahu processed!

