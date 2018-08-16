package consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import serviceInteface.Say;

@Service
public class config {
    @Reference(interfaceName="serviceInteface.Say")
    Say say;

    public void invoke(){
        say.speak();
    }
}
