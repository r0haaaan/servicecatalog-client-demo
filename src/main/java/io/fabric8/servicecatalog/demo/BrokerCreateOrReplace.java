package io.fabric8.servicecatalog.demo;

import io.fabric8.servicecatalog.api.model.ServiceBroker;
import io.fabric8.servicecatalog.api.model.ServiceBrokerBuilder;
import io.fabric8.servicecatalog.client.DefaultServiceCatalogClient;
import io.fabric8.servicecatalog.client.ServiceCatalogClient;

public class BrokerCreateOrReplace {
    public static void main(String[] args) {
        try (ServiceCatalogClient client = new DefaultServiceCatalogClient()) {
            ServiceBroker serviceBroker = new ServiceBrokerBuilder()
                    .withNewMetadata().withName("broker1").endMetadata()
                    .withNewSpec()
                    .withUrl("http://bestdatabase.example.com")
                    .endSpec()
                    .build();

            client.serviceBrokers().inNamespace("myproject").createOrReplace(serviceBroker);
        }
    }
}
