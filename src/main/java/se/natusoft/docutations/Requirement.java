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
 * This references the development requirement that the annotated code belongs to.
 *
 * Kind of similar to Specification.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface Requirement {

    /** Some reference to the requirement. */
    String ref() default "";

    /** URL to requirement description on the web.. */
    String url() default "";
}
