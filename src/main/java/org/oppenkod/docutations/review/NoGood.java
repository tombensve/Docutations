package org.oppenkod.docutations.review;

import org.oppenkod.docutations.Documentative;
import org.oppenkod.docutations.Note;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This is a negative review comment.
 */
@Documented
@Documentative
@ReviewAnnotation
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface NoGood {
    String[] value() default {};
}
