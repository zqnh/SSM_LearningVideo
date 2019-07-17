package net.zzqd.elearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.zzqd.elearning.mapper")
public class LeanApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LeanApplication.class, args);
	}
}
