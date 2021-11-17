package edu.matkosoric.class_.design.capital.city;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class France extends EuropeanUnion {

    // does not compile - methods look the same after type erasure, but are not in override relationship
//    public Collection<String> havingCapitalCity(Collection<String> arg) {return null;}

}
