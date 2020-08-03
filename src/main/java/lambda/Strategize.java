package main.java.lambda;

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
                //[4] 方法的引用
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
