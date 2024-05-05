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
 * Indicates that annotated object is a data model, implying value properties.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.SOURCE)
@Note("All targets!")
public @interface DataModel {

    /** The version value. */
    String name() default "";

    /** The version of the specification. */
    String version() default "";

    /** A description of the model. */
    String[] desc();

}
