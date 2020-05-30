package club.banyuan.iocdemo;

import club.banyuan.iocdemo.service.BusinessService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocDemoApplication {

	public static void main(String[] args) {
	 	ApplicationContext context = SpringApplication.run(IocDemoApplication.class, args);
	 	BusinessService service =  context.getBean(club.banyuan.iocdemo.service.BusinessService.class);
		service.doSomeService();
	}

}
