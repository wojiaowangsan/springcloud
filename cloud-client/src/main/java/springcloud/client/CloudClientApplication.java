package springcloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
    }
}

