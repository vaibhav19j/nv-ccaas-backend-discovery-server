package com.jci.nv.cemm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NvCcaasBackendGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NvCcaasBackendGatewayApplication.class, args);
	}

}
