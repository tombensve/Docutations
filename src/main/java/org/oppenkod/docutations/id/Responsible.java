package org.oppenkod.docutations.id;

import org.oppenkod.docutations.Documentative;
import org.oppenkod.docutations.Note;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Points out a responsible person.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface Responsible {
    String name() default "";
    String email() default "";
    Developer[] developer() default {};
    TeamLeader[] teamLeader() default {};
    Architect[] architect() default {};
    ProjectLeader[] projectLeader() default {};
}
