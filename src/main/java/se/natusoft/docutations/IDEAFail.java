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
 *         2018-04-30: Created!
 *         
 */
package se.natusoft.docutations;

import java.lang.annotation.*;

/**
 * Indicates that IDEA has failed again and screams loud at something that isn't wrong!
 *
 * I've gotten rather tired of reporting these things to JetBrains. The last time I did that for Groovy
 * code, they came back with "Don't use @CompileStatic and @TypeChecked!". For those that don't know Groovy
 * those annotations are not just metadata but affects how the compiler compiles and validates the code.
 * They are a functional feature of Groovy. A company like JetBrains with an IDE that they claim fully
 * supports Groovy should know better than giving an idiot response like that. I'm starting to think
 * that much of their competence have fled the company.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.SOURCE)
@Note("All targets!")
public @interface IDEAFail {
    /** If you want to say something ... */
    String value() default "";
}
