/* 
 * 
 * PROJECT
 *     Name
 *         Docutations
 *     
 *     Code Version
 *         1.2
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
 * I've seem code that uses final on method parameters. I assume that they actually mean that those parameters
 * are not modified by the method. In reality the parameter is inhibited to be reset to another instance within
 * the method. It does not stop the contents of an object to be modified by calling methods on it. It only
 * guarantees that you will have access to the original passed parameter within the whole method.
 * <p>
 * I don't feel using final to mean unmodified is clear enough, so I've created @Modified and @NotModified
 * annotations to document this behavior instead.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
public @interface NotModified {
    /** If you want to say something ... */
    String value() default "";
}
