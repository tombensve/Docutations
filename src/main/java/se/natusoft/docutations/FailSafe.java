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
 * This indicates that something cannot fail or that it will always return without ever
 * throwing an exception.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface FailSafe {

    /** A description.  */
    String[] value() default {};

}
