package xzh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 * @author 向振华
 * @date 2018/10/24 13:57
 */
@RestController
public class HomeController {

    @ResponseBody
    @RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
    public String home() {
        return "success";
    }

}
