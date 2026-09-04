package api_gateway;

import java.net.URI;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

@Configuration
public class LoadBalancerConfig {

    @Bean
    ServiceInstanceListSupplier productServiceInstances() {

        List<ServiceInstance> instances = List.of(
            new SimpleServiceInstance(
                "product-1",
                "product-service",
                URI.create("http://localhost:8081")
            ),
            new SimpleServiceInstance(
                "product-2",
                "product-service",
                URI.create("http://localhost:8083")
            )
        );

        return new ServiceInstanceListSupplier() {
            @Override
            public String getServiceId() {
            return "product-service";
            }

            @Override
            public Flux<List<ServiceInstance>> get() {
            return Flux.just(instances);
            }
        };
    }

    static class SimpleServiceInstance implements ServiceInstance {

        private final String instanceId;
        private final String serviceId;
        private final URI uri;

        SimpleServiceInstance(
                String instanceId,
                String serviceId,
                URI uri) {

            this.instanceId = instanceId;
            this.serviceId = serviceId;
            this.uri = uri;
        }

        @Override
        public String getInstanceId() {
            return instanceId;
        }

        @Override
        public String getServiceId() {
            return serviceId;
        }

        @Override
        public String getHost() {
            return uri.getHost();
        }

        @Override
        public int getPort() {
            return uri.getPort();
        }

        @Override
        public boolean isSecure() {
            return uri.getScheme().equalsIgnoreCase("https");
        }

        @Override
        public URI getUri() {
            return uri;
        }

        @Override
        public String getScheme() {
            return uri.getScheme();
        }

        @Override
        public Map<String, String> getMetadata() {
            return Map.of();
        }
    }
}