/*
 *
 * PROJECT
 *     Name
 *         Docutations
 *     
 *     Code Version
 *         1.1
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
 * This is an alternative/addition to @Override when used to point out implementation of interface and
 * also provides what interface is being implemented.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
public @interface Implements {
    Class[] api();
}
