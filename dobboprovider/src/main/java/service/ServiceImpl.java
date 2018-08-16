package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import serviceInteface.ServiceTest;

@Service("service")
public class ServiceImpl implements ServiceTest {
    public String sayHello(String message) {
        System.out.println(message);
        return message;
    }
}
