/* 
 * 
 * PROJECT
 *     Name
 *         Docutations
 *     
 *     Code Version
 *         2.8
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
 *         2020-12-23: Created!
 *         
 */
package se.natusoft.docutations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Alternative to @Teaching.
 */
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface Feedback {
    String[] value() default {};
}
