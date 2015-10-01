package org.oppenkod.docutations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This annotation is used for special notes.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface Note {
    String[] value() default {};
}
