package com.zjh.springcloudeurekaclientc.controller;

import com.zjh.springcloudeurekaclientc.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/3 14:04
 */
@RestController
public class AppController {

    @Value("${server.port}")
    private String port;

    private static List<Student> studentList = new LinkedList<>();

    private  List<Student> generateStudentList() {
        Student student1 = new Student(1,"zjh", 24,null);
        Student student2 = new Student(2,"aaa", 25,null);
        Student student3 = new Student(3,"bbb", 26,null);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        return studentList;
    }

    @RequestMapping("/getStudent")
    public Student getStudent(String name) {
        List<Student> defaultOne = new LinkedList<>();
        defaultOne.add(new Student(0,"default",100,null));
        List<Student> studentList = generateStudentList();
        Student student = Optional.of(studentList.stream().filter(t -> t.getName().equals(name)).collect(Collectors.toList())).
                orElse(defaultOne).get(0);
        student.setPort(port);
        return student;
    }
}
