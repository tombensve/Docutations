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
 * This annotation indicates that a class is dependency injected which means that setters or private fields
 * are not always provided with a value in a way an IDE can see.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Target( ElementType.TYPE )
public @interface DependencyInjected {
    String[] value() default {};
}
