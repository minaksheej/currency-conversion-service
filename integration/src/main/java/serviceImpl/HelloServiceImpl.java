package serviceImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import service.HelloService;

@Service
@Qualifier(value="helloServiceImpl")
public class HelloServiceImpl implements HelloService {
     
    @Override
    public void hello(String name) {
        System.out.println("hello "+name);        
    }

}
