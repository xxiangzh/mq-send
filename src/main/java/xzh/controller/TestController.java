package xzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xzh.sender.SendServer;

/**
 * @author 向振华
 * @date 2018/10/24 13:57
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private SendServer sendServer;

    @GetMapping("/sendMsg")
    @ResponseBody
    public Boolean sendMsg(String msg){
        return sendServer.sendMsg(msg);
    }

    @GetMapping("/sendList")
    @ResponseBody
    public Boolean sendList(String msg){
        return sendServer.sendList(msg);
    }
}
