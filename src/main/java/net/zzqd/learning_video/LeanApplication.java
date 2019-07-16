package net.zzqd.learning_video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="net.zzqd")
public class LeanApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LeanApplication.class, args);
	}
}
