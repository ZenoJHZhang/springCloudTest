package com.zjh.springcloudeurekaclientb.service;

import com.zjh.springcloudeurekaclientb.fallback.FallbackClassService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/4 12:31
 */
@FeignClient(value = "clientA",fallback = FallbackClassService.class)
public interface ClassService {
    @GetMapping(value = "/getStudentClassById")
    String getStudentClassById(@RequestParam int id);
}
