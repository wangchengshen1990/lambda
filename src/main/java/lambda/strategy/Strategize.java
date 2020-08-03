package main.java.lambda.strategy;

/**
 * @author wcs
 * @ClassName Strategize
 * @description
 * @date 2020/8/3 20:45
 */
public class Strategize {
    Strategy strategy;
    String msg;

    Strategize(String msg) {
        // [1]
        strategy = new Soft();
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                // [2]
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                //[3] lambda表达式
                msg1 ->msg1.substring(0,5),
                //[4] Java 8 的方法引用，它以 :: 为特征。
                // :: 的左边是类或对象的名称， :: 的右边是方法的名称，
                // 但是没有参数列表。
                Unrelated::twice
        };
        Strategize s = new Strategize("Hello there");
        s.communicate();
        for(Strategy newStrategy : strategies) {
            // [5]
            s.changeStrategy(newStrategy);
            // [6]
            s.communicate();
        }
    }
}
