package com.zjh.springcloudeurekaclientb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/3 14:04
 */
@Data
@AllArgsConstructor
public class Student  {
    private String name;
    private int age;
    private String port;
}
