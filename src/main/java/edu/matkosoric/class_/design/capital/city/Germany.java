package edu.matkosoric.class_.design.capital.city;

import java.util.Collection;
import java.util.stream.Stream;

public class Germany extends EuropeanUnion{

    // compiles
    // does not overload parent method
    public <T> Collection<T> havingCapitalCity(Stream<T> arg) {return null;}

}
