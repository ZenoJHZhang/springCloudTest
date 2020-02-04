package com.zjh.springcloudeurekaclientb.model;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/3 16:17
 */
//@Component
public class Test implements BeanNameAware , BeanFactoryAware , ApplicationContextAware, BeanPostProcessor, DisposableBean {
    private String name;

    @Override
    public void setBeanName(String s) {
        System.out.println("##############setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("##############setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("##############applicationContext");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("#############postProcessBeforeInitialization");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("#############postProcessAfterInitialization");
        return null;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("##############destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("beanSetName");
        this.name = name;
    }
}
