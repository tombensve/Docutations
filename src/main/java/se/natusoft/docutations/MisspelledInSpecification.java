package se.natusoft.docutations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Clarifying specification spelling problems. These days with spell-checking help this does still happen!
 */
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface MisspelledInSpecification {
    String[] value() default {};
}
