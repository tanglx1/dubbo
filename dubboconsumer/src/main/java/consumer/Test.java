package consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import serviceInteface.ServiceTest;

@ImportResource("classpath:order-center-hsf-consumer.xml")
@SpringBootApplication(scanBasePackages = {"consumer"})
public class Test {
    public static void main(String[] s){
        ConfigurableApplicationContext context= SpringApplication.run(Test.class,s);
        ServiceTest service=context.getBean("serviceTest",ServiceTest.class);
        service.sayHello("sdf");

        config config1=context.getBean("config", config.class);
        config1.invoke();
        try {
            Thread.sleep(60*60*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
