package prgrammer.zaman.now.lambda.app;

import prgrammer.zaman.now.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Eko";
            }
        };

        System.out.println(simpleAction1.action());

        SimpleAction simpleAction2 = () -> {
            return "Eko";
        };

        System.out.println(simpleAction2.action());

    }
}
