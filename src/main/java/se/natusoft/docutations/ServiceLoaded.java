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
 *         2016-03-25: Created!
 *
 */
package se.natusoft.docutations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This indicates that the annotated object is service loaded.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface ServiceLoaded {

    String comment() default "";
}
