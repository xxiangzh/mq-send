package xzh.sender;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 注入可以发送消息的bean
 * @author 向振华
 * @date 2018/10/24 13:52
 */
@Service
public class SendServer {

    @Autowired
    private SendChannel sendChannel;

    @Autowired
    @Qualifier("mqScoreOutput")
    private MessageChannel messageChannel;

    public void send1() {
        Message<String> message = MessageBuilder.withPayload("send1").build();
        sendChannel.scoreOutput().send(message);
        System.out.println("发送消息send1");
    }

    public void send2() {
        Message<String> message = MessageBuilder.withPayload("send2").build();
        messageChannel.send(message);
        System.out.println("发送消息send2");
    }

    public void send3(){
        List<String> m = Lists.newArrayList("消息1","消息2","消息3","消息4");
        Message<List<String>> message = MessageBuilder.withPayload(m).build();
        sendChannel.scoreOutput().send(message);
        System.out.println("发送消息send3");
    }

}