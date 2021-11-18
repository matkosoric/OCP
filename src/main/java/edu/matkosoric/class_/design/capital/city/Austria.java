package edu.matkosoric.class_.design.capital.city;

import java.util.Collection;

public class Austria extends EuropeanUnion {

    // compiles
    // does not overload parent method because of name difference
    public <T> Collection<T> havingCapitalCity2(Collection<T> arg) {
        return null;
    }

}
