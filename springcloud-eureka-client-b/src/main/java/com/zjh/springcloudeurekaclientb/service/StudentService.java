package com.zjh.springcloudeurekaclientb.service;

import com.alibaba.fastjson.JSONObject;
import com.zjh.springcloudeurekaclientb.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/3 14:32
 */
@FeignClient(value = "clientC")
public interface StudentService {
    @RequestMapping(value = "getStudent")
    JSONObject getStudent(@RequestParam String name);
}
