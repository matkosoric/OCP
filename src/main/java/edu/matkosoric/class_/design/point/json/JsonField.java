package edu.matkosoric.class_.design.point.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// #TAG1

@Target(ElementType.FIELD)
@interface JsonField {
    String name() default "";

    enum Type {
        INT, STRING, BOOLEAN
    }

    Type type();
}
