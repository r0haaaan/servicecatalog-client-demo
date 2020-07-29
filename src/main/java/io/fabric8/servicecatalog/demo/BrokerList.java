package io.fabric8.servicecatalog.demo;

import io.fabric8.servicecatalog.api.model.ServiceBrokerList;
import io.fabric8.servicecatalog.client.DefaultServiceCatalogClient;
import io.fabric8.servicecatalog.client.ServiceCatalogClient;

public class BrokerList {
    public static void main(String[] args) {
        try (ServiceCatalogClient client = new DefaultServiceCatalogClient()) {
            ServiceBrokerList serviceBrokerList = client.serviceBrokers().inAnyNamespace().list();

            System.out.println(serviceBrokerList.getItems().size() + " items found");
        }
    }
}
