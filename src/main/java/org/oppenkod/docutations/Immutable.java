package org.oppenkod.docutations;

import java.lang.annotation.*;

/**
 * This can seem to overlap @NotModified a bit, but this means that the annotated item is
 * not possible to modify, while @NotModified means it won't be modified even if it is possible
 * to do so by the method call for example.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.FIELD})
public @interface Immutable {
    /** If you want to say something ... */
    String value() default "";
}
