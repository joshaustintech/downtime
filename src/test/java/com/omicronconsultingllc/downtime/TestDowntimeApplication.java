package com.omicronconsultingllc.downtime;

import org.springframework.boot.SpringApplication;

public class TestDowntimeApplication {

	public static void main(String[] args) {
		SpringApplication.from(DowntimeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
