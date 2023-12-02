package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase; // bisa begini juga

        System.out.println(predicateIsLowerCase.test("gils"));
        System.out.println(predicateIsLowerCase.test("Diva"));


        // Method reference parameter
//        Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase; //method nya harus yang tidak ada param

        System.out.println(functionUpper.apply("gils"));
    }

    public void run(){

        Predicate<String> predicateIsLowerCase = this::isLowerCase; // kalau object nya sama


        System.out.println(predicateIsLowerCase.test("gils"));
        System.out.println(predicateIsLowerCase.test("Diva"));
    }

    public void run2(){

        MethodReferenceApp app = new MethodReferenceApp();

        Predicate<String> predicateIsLowerCase = app::isLowerCase; // kalau object nya beda, tinggal panggil objectnya


        System.out.println(predicateIsLowerCase.test("gils"));
        System.out.println(predicateIsLowerCase.test("Diva"));
    }

    public boolean isLowerCase (String value){

        for ( var c : value.toCharArray()       ) {
            if (!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
