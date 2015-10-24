/* 
 * 
 * PROJECT
 *     Name
 *         Docutations
 *     
 *     Code Version
 *         1.0
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
 * This annotation indicates that the annotated item can be null.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
public @interface Nullable {
    /** If you want to say something ... */
    String value() default "";
}
