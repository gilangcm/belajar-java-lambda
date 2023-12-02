package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {



//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "gils";
//            }
//        };
//
//        System.out.println(simpleAction1.action("gilang"));
//
//        SimpleAction simpleAction2 = (String name) -> {
//            return "diva";
//        };
//
//        System.out.println(simpleAction2.action("gilang"));

        SimpleAction simpleAction1 = (String name) -> {
            return "hello " + name;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "hello " + name;
        };

        SimpleAction simpleAction3 = (String value) -> "hello " + value;
        SimpleAction simpleAction4 = (value) -> "hello " + value;
        SimpleAction simpleAction5 = name -> "hello " + name; // kalo hanya satu param bisa tanpa kurung
    }
}
