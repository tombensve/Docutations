package se.natusoft.docutations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Clarifying specification spelling problems. These days with spell-checking help this does still happen!
 */
@DOC_Documentative
@Retention(RetentionPolicy.SOURCE)
@DOC_Note("All targets!")
public @interface DOC_MisspelledInSpecification {
    String[] value() default {};
}
