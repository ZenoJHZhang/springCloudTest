package com.zjh.thread;

import java.util.concurrent.*;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/4 13:43
 */
public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue<>(),new ThreadPoolExecutor.DiscardPolicy());
        for (int i = 0; i <10 ; i++) {
            threadPoolExecutor.execute(() -> System.out.println(new Test().call()));
        }
    }
}
