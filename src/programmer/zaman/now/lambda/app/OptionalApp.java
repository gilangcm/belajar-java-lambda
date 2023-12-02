package programmer.zaman.now.lambda.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {


        sayHello("gils");

        String name = null;

        sayHello(name);

    }

    public static void sayHello(String name) {

//        menggunakan method reference hanya 1 baris
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(value -> System.out.println("Hello " + value),
//                        () -> System.out.println("Hello")
//                );

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("Teman");
        System.out.println("hello " + upperName);

//        menggunakan lambda
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
//        optionalNameUpper.ifPresent(value -> System.out.println("Hello " + value));

//        menggunakan if cek null
//        if ( name != null){
//            String upperName = name.toUpperCase();
//            System.out.println("Hello " + upperName);
//        }
    }

}
