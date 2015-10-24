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
 * This annotation means that the annotated item is for documentation purposes only. That is, there is no functionality
 * associated with the annotation.
 * <p>
 * It is on purpose that the annotation can be used anywhere, though some might be less useful that others.
 * I was originally only thinking annotations, but then I started thinking that someone might find it useful in
 * other places too, so why limit. I do sometimes create local variables only for documentative purposes.
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.LOCAL_VARIABLE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD,
        ElementType.ANNOTATION_TYPE, ElementType.PACKAGE, ElementType.TYPE})
public @interface Documentative {
    /** If you want to say something ... */
    String value() default "";
}
