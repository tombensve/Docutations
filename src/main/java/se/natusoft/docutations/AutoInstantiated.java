/*
 *
 * PROJECT
 *     Name
 *         Docutations
 *     
 *     Code Version
 *         2.6
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
 * This annotation is used to indicate that a class is auto instantiated which an IDE cannot determine
 * and might mark it as unused.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Target( ElementType.TYPE )
public @interface AutoInstantiated {
    String[] value() default {};
}
