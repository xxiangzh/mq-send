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

    public boolean sendMsg(String msg) {
        Message<String> message = MessageBuilder.withPayload(msg).build();
        return sendChannel.scoreOutput().send(message);
    }

    public boolean sendMsg2(String msg) {
        Message<String> message = MessageBuilder.withPayload(msg).build();
        return messageChannel.send(message);
    }

    public boolean sendList(String msg){
        List<String> m = Lists.newArrayList(msg+1, msg+2, msg+3);
        Message<List<String>> message = MessageBuilder.withPayload(m).build();
        return sendChannel.scoreOutput().send(message);
    }

}