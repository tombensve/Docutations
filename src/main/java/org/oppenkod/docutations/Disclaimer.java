package org.oppenkod.docutations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * As a consultant I've unfortunately have been in situations where I've been forced to code I can't stand up for, that
 * in some cases are simply wrong, and you don't want your name associated with it, but it is obey or resign. It feels a
 * little better to put in a disclaimer explaining the situation in the code.
 * <p/>
 * One example:
 * <p/>
 * A customer used PMD, right off, without configuring it with their coding preferences. PMD has rules that collides with
 * each other (the rules are meant to be filtered to your preferences). This was run automatically on a push to gerrit,
 * making it impossible to push up code that does not pass all PMD rules. That created some really messy code in some
 * cases.
 * <p/>
 * I did the following disclaimer due to this once:
 * <ul>
 * "Oh thee holy pattern matcher, you are never ever wrong, and I always thee obey. You beat human intelligence any day,
 * which is why you have the final say!"
 * </ul>
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Disclaimer("All targets!")
public @interface Disclaimer {
    String[] value() default {};
}
