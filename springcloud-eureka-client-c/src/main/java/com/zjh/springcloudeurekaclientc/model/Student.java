package com.zjh.springcloudeurekaclientc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/3 14:04
 */
@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private int age;
    private String port;
}
