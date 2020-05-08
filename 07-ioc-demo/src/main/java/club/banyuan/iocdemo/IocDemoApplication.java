package club.banyuan.iocdemo;

import club.banyuan.iocdemo.service.BusinessService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocDemoApplication.class, args);
		BusinessService service = new BusinessService();
		service.doSomeService();
	}

}
