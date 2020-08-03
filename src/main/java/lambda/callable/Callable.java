package main.java.lambda.callable;

/**
 * @author wcs
 * @ClassName Callable
 * @description 方法引用
 * @date 2020/8/3 21:49
 */
public interface Callable {
    void call(String s); // [1]
}

class Describe{
    void show(String msg ){ // [2]
        System.out.println(msg);
    }
}