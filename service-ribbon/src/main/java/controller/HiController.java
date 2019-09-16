package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;

import javax.annotation.Resource;

/**
 * @ClassName HiController
 * @Description TODO
 * @Author zmd
 * @Date 2019/9/16 11:29
 * Version 1.0
 **/
@RestController
public class HiController {

    @Resource
    private HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }

}
