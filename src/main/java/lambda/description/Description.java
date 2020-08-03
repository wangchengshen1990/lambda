package main.java.lambda.description;


/**
 * Lambda 表达式是使用最小可能语法编写的函数定义：
 * Lambda 表达式产生函数，而不是类。 在 JVM（Java Virtual Machine，Java 虚拟机）上，
 * 一切都是一个类，因此在幕后执行各种操作使 Lambda 看起来像函数
 * Lambda 语法尽可能少，这正是为了使 Lambda 易于编写和使用。
 * */
/**
 * @author wcs
 * @ClassName Description
 * @description
 * @date 2020/8/3 21:07
 */
public interface Description {
    /**
     * brief
     * @return
     */
    String brief();
}
interface Body {
    /**
     * one Arg
     * @param head
     * @return
     */
    String detailed(String head);
}

interface Multi {
    /**
     * twoArgs
     * @param head
     * @param d
     * @return
     */
    String twoArg(String head, Double d);
}
