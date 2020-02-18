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
 * Indicates that the annotated item is concurrent with other stuff.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Note("All targets!")
public @interface Concurrent {
    enum Type {
        MAIN_THREAD,
        SERVICE_THREAD,
        THREAD_POOL,
        OTHER
    }

    /** If you want to say something ... */
    Concurrent.Type value() default Type.OTHER;

    String description() default "";
}
