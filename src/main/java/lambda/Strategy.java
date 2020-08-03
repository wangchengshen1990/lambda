package main.java.lambda;


/***
 * 如果我们希望方法在调用时行为不同，该怎么做呢？
 * 结论是：只要能将代码传递给方法，我们就可以控制它的行为
 * 下面我们用传统形式和 Java 8 的方法引用、Lambda 表达式分别演示
 * */
/**
 * @author wcs
 * @ClassName Strategy
 * @description jdk7与jdk8的对比
 * @date 2020/8/3 20:38
 */
public interface Strategy {
    /**
     * 返回 msg
     * @param msg
     * @return
     */
    String approach(String msg);
}

class Soft implements Strategy{
    @Override
    public String approach(String msg) {
        return msg.toLowerCase()+"?";
    }
}
class Unrelated {
    static  String twice(String msg){
        return msg+"  "+msg;
    }

}