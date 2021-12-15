package edu.matkosoric.streams.widget;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.util.List;
import java.util.stream.Stream;

public class WidgetExecution {


    public static void main(String[] args) {

        List widgets = List.of(new Widget("Basic Widget", 19.55),
                new Widget("Enhanced Widget", 35.00),
                new Widget("Luxury Edition Widget", 55.45)
        );

        Stream widgetStream = widgets.stream();

//        widgetStream.filter(a -> a.getPrice() > 20.00)                // does not compile
//                .forEach(System.out::println);

        widgetStream.filter(a -> ((Widget) a).getPrice() > 20.00)        // compiles with Widget casting
                .forEach(System.out::println);

//        List<Widget> widgetStream2 = widgets.stream();                // does not compile

//        widgetStream.filter((Widget a) -> a.getPrice() > 20.00)       // does not compile
//                .forEach(System.out::println);

        Stream<Widget> widgetStream3 = widgets.stream();                // compiles with provided type
        widgetStream3.filter(a -> a.getPrice() > 20.00)
                .forEach(System.out::println);
    }
}
