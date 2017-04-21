/*
 *
 * PROJECT
 *     Name
 *         Docutations
 *     
 *     Code Version
 *         2.1
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
 * Indicates that the annotated item should not be null.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.FIELD})
public @interface Nullable {
    /** If you want to say something ... */
    String value() default "";
}
