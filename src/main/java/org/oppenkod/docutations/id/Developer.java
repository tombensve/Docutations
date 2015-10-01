package org.oppenkod.docutations.id;

import org.oppenkod.docutations.Documentative;
import org.oppenkod.docutations.Note;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface Developer {
    String name();
    String email() default "";
    String comment() default "";
}
