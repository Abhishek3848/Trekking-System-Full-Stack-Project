//package com.app;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class P27OrderserviceApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(P27OrderserviceApplication.class, args);
//	}
//
//}


//package com.app;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class P27EventserviceApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(P27EventserviceApplication.class, args);
//	}
//
//}
//

package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//@SpringBootApplication

@EnableJpaAuditing
@EnableEncryptableProperties
@EnableDiscoveryClient
public class P27OrderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(P27OrderserviceApplication.class, args);
	}
	
	

}
