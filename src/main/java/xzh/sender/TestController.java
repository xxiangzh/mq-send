package xzh.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * @author 向振华
 * @date 2018/10/24 13:57
 */
@Controller
public class TestController {
    @Autowired
    private SendServer sendServer;

    @GetMapping("/test")
    @ResponseBody
    public String home() {
//        sendServer.send1();
//        sendServer.send2();
        sendServer.send3();
        return "success"+new Random().nextInt();
    }
}
