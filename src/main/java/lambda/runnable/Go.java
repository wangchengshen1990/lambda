package main.java.lambda.runnable;

/**
 * @author wcs
 * @ClassName Runnable
 * @description
 * @date 2020/8/3 22:08
 */
public class Go {
    /**
     * Runnable 接口自 1.0 版以来一直在 Java 中，因此不需要导入。
     * 它也符合特殊的单方法接口格式：它的方法 run() 不带参数，也没有返回值。
     * 因此，我们可以使用 Lambda 表达式和方法引用作为 Runnable
     */
    static void go() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("GO:go()");
    }
}

class RunnableMethodReference {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Anonymous");
            }
        }).start();
        new Thread(
                () -> {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("lambda");
                }
        ).start();
        new Thread(
                Go::go
        ).start();
    }
}
