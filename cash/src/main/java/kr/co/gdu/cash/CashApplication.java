package kr.co.gdu.cash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class CashApplication {
	public static void main(String[] args) {
		SpringApplication.run(CashApplication.class, args);
	}
}
