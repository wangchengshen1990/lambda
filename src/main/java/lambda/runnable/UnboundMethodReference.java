package main.java.lambda.runnable;

/**
 * @author wcs
 * @ClassName UnboundMethodReference
 * @description 未绑定的实例引用
 * @date 2020/8/3 23:18
 */
public class UnboundMethodReference {
    public static void main(String[] args) {
        // [1]
        MakeString ms = X::f;
        //非静态方法引用，未绑定的方法引用
        TransformX sp = Y::f;
        Y y = new Y();
        System.out.println(sp.transform(y));
        // 同等效果
        System.out.println(y.f());
    }
}
class X {
    static String f() { return "X::f()"; }
}
class Y {
     String f() { return "X::f()"; }
}
interface MakeString {
    String make();
}
interface TransformX {
    String transform(Y y);
}