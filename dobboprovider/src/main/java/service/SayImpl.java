package service;

import com.alibaba.dubbo.config.annotation.Service;
import serviceInteface.Say;

@Service
public class SayImpl implements Say {
    @Override
    public void speak() {
        System.out.println("i can speak something");
    }
}
