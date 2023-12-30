package se.natusoft.docutations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Clarifying specification spelling problems. These days with spell-checking help this does still happen!
 */
@DT_Documentative
@Retention(RetentionPolicy.SOURCE)
@DT_Note("All targets!")
public @interface DT_MisspelledInSpecification {
    String[] value() default {};
}
