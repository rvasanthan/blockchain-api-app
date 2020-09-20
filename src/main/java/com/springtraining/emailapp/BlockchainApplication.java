package com.springtraining.emailapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class BlockchainApplication { //implements CommandLineRunner {

	/*@Autowired
	EmailInfoRepository repository;*/

	public static void main(String[] args) {
		SpringApplication.run(BlockchainApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		List<EmailInfo> lists = repository.findByFirstName("Vasanthan");
		for(EmailInfo emailInfo : lists) {
			System.out.println(emailInfo.getFirstName());
			System.out.println(emailInfo.getLastName());
			System.out.println(emailInfo.getEmail());

		}
	}*/

}
