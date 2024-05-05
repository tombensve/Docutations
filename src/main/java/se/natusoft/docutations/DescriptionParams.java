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
 *     Tommy Svensson
 *
 */
package se.natusoft.docutations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This annotation means that the annotated item is for documentation purposes only. That is, there is no functionality
 * associated with the annotation.
 * <p>
 * It is on purpose that the annotation can be used anywhere, though some might be less useful that others.
 * I was originally only thinking annotations, but then I started thinking that someone might find it useful in
 * other places too, so why limit. I do sometimes create local variables only for documentative purposes.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Note("All targets!")
public @interface DescriptionParams {

    String[] value();
    Param[] params();
}
