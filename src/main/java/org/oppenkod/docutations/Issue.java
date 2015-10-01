package org.oppenkod.docutations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This documents an issue.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface Issue {
    /** The id of the issue. */
    String id();

    /** A description.  */
    String[] description() default {};

    /** The priority of the issue. */
    String priority() default "";

    /** The state of the issue. */
    String state() default "";

    /** An url or some reference to the issue tracker where the issue can be found. */
    String url() default "";

    /** Reference to other info. */
    String see() default "";
}
