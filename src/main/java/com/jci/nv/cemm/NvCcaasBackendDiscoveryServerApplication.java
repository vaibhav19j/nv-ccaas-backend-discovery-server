package com.jci.nv.cemm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NvCcaasBackendDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NvCcaasBackendDiscoveryServerApplication.class, args);
	}

}
