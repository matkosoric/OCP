package edu.matkosoric.class_.design.capital.city;

public class France extends EuropeanUnion {

    // does not compile - methods look the same after type erasure, but are not in override relationship
//    public Collection<String> havingCapitalCity(Collection<String> arg) {return null;}

}
