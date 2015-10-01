package org.oppenkod.docutations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This indicates that the item annotated with this is a workaround.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface Workaround {
    /** If you want to say something ... */
    String value() default "";
}
