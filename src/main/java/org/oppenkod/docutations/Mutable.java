package org.oppenkod.docutations;

import java.lang.annotation.*;

/**
 * This can seem to overlap @Modified a bit, but this means that the annotated item is
 * possible to modify, while @Modified means it will be modified by the method call for example.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.FIELD})
public @interface Mutable {
    /** If you want to say something ... */
    String value() default "";
}
