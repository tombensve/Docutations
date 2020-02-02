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
 *         2018-04-30: Created!
 *         
 */
package se.natusoft.docutations;

import java.lang.annotation.*;

/**
 * Tell the code reader to just ignore whatever is annotated. Works well in conjunction with @IDEAFail.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface JustIgnore {
    /** If you want to say something ... */
    String value() default "";
}
