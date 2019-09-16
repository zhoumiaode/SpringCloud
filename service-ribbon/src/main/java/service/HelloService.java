package service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author zmd
 * @Date 2019/9/16 11:26
 * Version 1.0
 **/

@Service
public class HelloService {

    @Resource
    private RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
