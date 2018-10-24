package xzh.sender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 定义接口
 * @author 向振华
 * @date 2018/10/24 13:51
 */
public interface SendChannel {

    String SCORE_OUPUT = "mqScoreOutput";

    @Output(SendChannel.SCORE_OUPUT)
    MessageChannel scoreOutput();
}
