package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

import service.GreeterService;

@Service
@Qualifier("greeterServiceImpl")
public class GreeterServiceImpl  implements GreeterService{
    @Autowired
    private MessageChannel helloWorldChannel;

    @Override
    public void greet(String name) {
        helloWorldChannel.send(MessageBuilder.withPayload(name).build());        
    }

}
