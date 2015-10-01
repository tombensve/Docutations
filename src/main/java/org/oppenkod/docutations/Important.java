package org.oppenkod.docutations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This annotation indicates that something is important.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Important("All targets!")
public @interface Important {
    String[] value() default {};
}
