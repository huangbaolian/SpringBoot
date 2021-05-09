package com.hbl.sBoot.controller;

import com.hbl.sBoot.exception.UserNotExistException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Api(tags={"Hello测试接口"})
@RestController
//@Controller
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ApiOperation(value = "查询一个student")
    @ResponseBody
    @GetMapping("/query")
    public Map<String,Object> map(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from student");
        return maps.get(0);
    }
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user){
        Logger logger = LoggerFactory.getLogger(HelloController.class);
        logger.info("this is slf4j");
        if (user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "Hello World";
    }
    //查出一些数据在页面
    @RequestMapping("/success")
    public String success(Map<String,Object> maps){
        maps.put("hello","<h1>你好</h1>");
        maps.put("users", Arrays.asList("aaa","bbb","xccc"));
        //classpath:/templates//success.html
        return "success";
    }

}
