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
 * Synonym for @Issue.
 */
@Documented
@DOC_Documentative
@Retention(RetentionPolicy.SOURCE)
@DOC_Note("All targets!")
@DOC_Synonymous("@Issue")
public @interface DOC_Bug {
    /** The id of the issue. */
    String id();

    /** A description.  */
    String[] description() default {};

    /** The priority of the issue. */
    String priority() default "";

    /** The state of the issue. */
    String state() default "";

    /** An url or some reference to the issue tracker where the issue can be found. */
    String url() default "";

    /** Reference to other info. */
    String see() default "";
}
