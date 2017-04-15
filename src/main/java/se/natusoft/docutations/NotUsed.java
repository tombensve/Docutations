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
 *         2016-03-25: Created!
 *
 */
package se.natusoft.docutations;

import java.lang.annotation.*;

/**
 * This says that the annotated item is not used. For example an unused, but required parameter in
 * an interface implementation.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD,
        ElementType.PACKAGE, ElementType.PARAMETER})
public @interface NotUsed {}
