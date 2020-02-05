package com.zjh.springcloudeurekaclientb.fallback;

import com.zjh.springcloudeurekaclientb.service.ClassService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/5 12:13
 */
@Component
public class FallbackClassService implements ClassService {
    @ResponseBody
    @Override
    public String getStudentClassById(int id) {
        return "errorFeign";
    }
}
