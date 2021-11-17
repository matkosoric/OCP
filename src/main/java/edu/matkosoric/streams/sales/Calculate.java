package edu.matkosoric.streams.sales;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Calculate {

    // taks: get a list of sales for each customer in ascending order

    public static void main(String[] args) {

        // create data
        List<Sale> tList = Arrays.asList(new Sale("Mick", Arrays.asList(new Book("Neuromancer", 23.3),
                                                                                new Book("Kindred", 21.12),
                                                                                new Book("Consider Phlebas", 25.54),
                                                                                new Book("Jurassic Park", 24.89))),
                                        new Sale("Rick", Arrays.asList(new Book("Foundation", 23.3),
                                                                                new Book("The Stars My Destination", 21.12),
                                                                                new Book("Solaris", 25.54),
                                                                                new Book("Dune", 24.89))),
                                        new Sale("Nick", Arrays.asList(new Book("The Moon is a Harsh Mistress", 23.3),
                                                                                new Book("Ice", 21.12),
                                                                                new Book("The Left Hand of Darkness", 25.54),
                                                                                new Book("A Scanner Darkly", 24.89)))
        );



        Map<String, List<Sale>> totalByUser2 =
        tList.stream()
                .collect(groupingBy(
                        Sale::getCustomer
                        ))
//                .flatMap(sale -> sale.getItems().stream())
////                .map(a -> a.getPrice())
//                .collect(Collectors.toList());

                        ;

        System.out.println(totalByUser2);





//        List<String> totalByUser = tList.stream()
//                .collect(flatMapping(t -> t.getItems().stream(),
//                        groupingBy(Sale::getCustomer,
//                                summingDouble(Book::getPrice))))
//                .entrySet().stream()
//                .sorted(Comparator.comparing(Map.Entry::getValue))
//                .collect(mapping(e -> e.getKey() + ":" + e.getValue(), toList()));


//        List<String> totalByUser = tList.stream()
//                .collect(groupingBy(Sale::getCustomer,
//                        flatMapping(t -> t.getItems().stream(),
//                                summingDouble(Book::getPrice))))
////                .entrySet().stream()
//                .sorted(Comparator.comparing(Map.Entry::getValue))
//                .collect(mapping(e -> e.getKey() + ":" + e.getValue(), toList()));





////////////////////////////////////////////////////
//        List<String> totalByUser = tList.stream()
//                .collect(groupingBy(Sale::getCustomer,
//                                    flatMapping(t -> t.getItems().stream(),
//                                        summingDouble(Book::getPrice))
//                ))
//                .entrySet().stream()
//                .sorted(Comparator.comparing(Map.Entry::getValue))
//                .collect(mapping(e -> e.getKey() + ":" + e.getValue(), toList()));

//
//        Map<String, Double> totalByUser2 = tList.stream()
//                .collect(groupingBy(Sale::getCustomer,
//                        flatMapping(t -> t.getItems().stream(),
//                                summingDouble(Book::getPrice))
//                ));
//
//        System.out.println(totalByUser2);







//        https://www.baeldung.com/java9-stream-collectors

//        Map<String, List<String>> authorComments2 = blogs.stream()
//                .collect(Collectors.groupingBy(Blog::getAuthorName,
//                        Collectors.flatMapping(blog -> blog.getComments().stream(),
//                                Collectors.toList())));


//        List<String> totalByUser = tList.stream()
//                .collect(flatMapping(t -> t.getItems().stream(),
//                        groupingBy(Sale::getCustomer,
//                            summingDouble(Book::getPrice))))
//                .entrySet().stream()
//                .sorted(Comparator.comparing(Map.Entry::getValue))
//                .collect(mapping(e -> e.getKey() + ":" + e.getValue(), toList()));
//


//        System.out.println(totalByUser);





        List<Book> kurac = Arrays.asList(new Book("Neuromancer", 23.3),
                new Book("Kindred", 21.12),
                new Book("Consider Phlebas", 25.54),
                new Book("Jurassic Park", 24.89));

        System.out.println(kurac.stream().collect(summingDouble(Book::getPrice)));



    }

}
