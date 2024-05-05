/*
 *
 * PROJECT
 *     Name
 *         Docutations
 *
 *     Code Version
 *         2.7
 *
 *     Description
 *         Provides code documentative annotations.
 *
 * COPYRIGHTS
 *     Copyright (C) 2015 by Natusoft AB All rights reserved.
 *
 * LICENSE
 *     ASF 2.0 (Open Source)
 *
 *
 * AUTHORS
 *     tommy ()
 *         Changes:
 *         2015-10-24: Created!
 *
 */
package se.natusoft.docutations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This indicates a specification that the code adheres to.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.SOURCE)
@Note("All targets!")
public @interface Specification {

    /** The version value. */
    String name() default "";

    /** The version of the specification. */
    String version() default "";

    /** URL to specification on web. */
    String url() default "";
}
