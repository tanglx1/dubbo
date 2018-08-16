import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import service.ServiceImpl;

@SpringBootApplication(scanBasePackages = {"service"})
//默认扫描次类归属包子包，maven项目最好指定java下面的包，作为扫描包
public class TestProvide {
    public static void  main(String[] str){
        ConfigurableApplicationContext context= SpringApplication.run(TestProvide.class,str);
            ServiceImpl service=context.getBean("service",ServiceImpl.class);
            service.sayHello("success provider service");
        try {
            Thread.sleep(60*60*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
