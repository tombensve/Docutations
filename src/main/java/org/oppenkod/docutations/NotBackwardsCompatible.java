package org.oppenkod.docutations;

import java.lang.annotation.*;

/**
 * This annotation indicates that the annotated item should never be null.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
public @interface NotBackwardsCompatible {

    String description() default "";
    String since() default "";
}
