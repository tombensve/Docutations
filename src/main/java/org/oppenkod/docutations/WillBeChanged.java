package org.oppenkod.docutations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Informs that the annotated object will be changed in the future.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface WillBeChanged {
    /** When will the change occur? Ex: "next release.", "next year". */
    String in();

    /** The reason for the change. */
    String because() default "";

    /** A description of the change. */
    String[] description() default "";
}
