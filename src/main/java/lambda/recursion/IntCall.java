package main.java.lambda.recursion;

/**
 * @author wcs
 * @ClassName IntCall
 * @description 递归
 * @date 2020/8/3 21:35
 */
public interface IntCall {
    /**
     * 计算值
     * @param arg
     * @return
     */
    int call(int arg);
}
/**
 * 注意：递归方法必须是 实例变量 或  静态变量，否则会出现编译时错误。
 *  这里，fact 是一个静态变量。 注意使用三元 if-else。
 *  递归函数将一直调用自己，直到 i == 0。所有递归函数都有“停止条件”，
 *  否则将无限递归并产生异常
 * */
class RecursiveFactorial {
    static IntCall fact;
    public static void main(String[] args) {
        fact = n->n==0?1:n*fact.call(n-1);
        for (int i = 0; i <=10; i++) {
            System.out.println(fact.call(i));
        }
    }
}