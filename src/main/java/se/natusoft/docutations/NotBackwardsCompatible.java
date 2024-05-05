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

import java.lang.annotation.*;

/**
 * This annotation indicates that the annotated item is not backwards compatible.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.SOURCE)
@Note("All targets!")
public @interface NotBackwardsCompatible {

    String description() default "";
    String since() default "";
}
