package se.natusoft.docutations;

import java.lang.annotation.*;

/**
 * Tell the code reader to just ignore whatever is annotated. Works well in conjunction with @IDEAFail.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface JustIgnore {
    /** If you want to say something ... */
    String value() default "";
}
