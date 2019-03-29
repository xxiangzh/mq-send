package xzh.sender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 定义发送通道
 * @author 向振华
 * @date 2018/10/24 13:51
 */
public interface SendChannel {

    String SCORE_OUTPUT = "mqScoreOutput";

    @Output(SendChannel.SCORE_OUTPUT)
    MessageChannel scoreOutput();
}
