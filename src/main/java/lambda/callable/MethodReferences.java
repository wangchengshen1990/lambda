package main.java.lambda.callable;

import java.util.function.Consumer;

/**
 * @author wcs
 * @ClassName MethodReferences
 * @description
 * @date 2020/8/3 21:50
 */
public class MethodReferences {
    static void hello(String name){ // [3]
        System.out.println(name);
    }
    static  class Description{
        String about;

        public Description(String about) {
            this.about = about;
        }
        void help(String msg){ // [4]
            System.out.println(about + " " + msg);
        }
    }
    static class Helper {
        static void assist(String msg) { // [5]
            System.out.println(msg);
        }
    }
/**
 * [1] 我们从单一方法接口开始（同样，你很快就会了解到这一点的重要性）。
 * [2] show() 的签名（参数类型和返回类型）符合 Callable 的 call() 的签名。
 * [3] hello() 也符合 call() 的签名。
 * [4] help() 也符合，它是静态内部类中的非静态方法。
 * [5] assist() 是静态内部类中的静态方法。
 * [6] 我们将 Describe 对象的方法引用赋值给 Callable ，它没有 show() 方法，而是 call() 方法。 但是，Java 似乎接受用这个看似奇怪的赋值，因为方法引用符合 Callable 的 call() 方法的签名。
 * [7] 我们现在可以通过调用 call() 来调用 show()，因为 Java 将 call() 映射到 show()。
 * [8] 这是一个静态方法引用。
 * [9] 这是 [6] 的另一个版本：对已实例化对象的方法的引用，有时称为绑定方法引用。
 * [10] 最后，获取静态内部类中静态方法的引用与 [8] 中通过外部类引用相似。
 * 上例只是简短的介绍，我们很快就能看到方法引用的所有不同形式。
 * 总结： 方法引用就相当与将接口实现一遍，方法的参数 和 返回值与接口保持一样(静态方法时)；
 *       非静态类的非静态方法或者静态内部类的普通方法需要先有对象（new对象）
 * */
    public static void main(String[] args) {
//        Callable c1 = (String arg1)-> new Describe().show(arg1);
//        c1.call("11111");
        Describe describe = new Describe();
        // [6]
        Callable c = describe::show;
        // [7]
        c.call("call()");
        // [8]
        c=MethodReferences::hello;
        c.call("Bob");
        // [9]
        c=new Description("valuable")::help;
        c.call("information");
        // [10]
        c =Helper::assist;
        c.call("Help!");
    }
}