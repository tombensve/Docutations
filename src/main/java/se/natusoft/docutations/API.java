/* 
 * 
 * PROJECT
 *     Name
 *         Docutations
 *     
 *     Description
 *         Provides code documentation annotations.
 *         
 * COPYRIGHTS
 *     Copyright (C) 2015 by Tommy Bengt Svensson All rights reserved.
 *     
 * LICENSE
 *     Apache 2.0 (Open Source)
 *     
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *     
 *       http://www.apache.org/licenses/LICENSE-2.0
 *     
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
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
 * This annotation is intended as alternative to slash-star comments for code.
 * It can be used for both types and methods. My intention with this is to be able to
 * make an annotation processor that generates markdown.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.SOURCE)
@Note("All targets!")
public @interface API {

    CodeType type() default CodeType.None;

    String name() default "";

    String extend() default "";

    String[] traits();

    String[] implement() default "";

    String[] description() default {};

    Param[] params() default {};

    String returns() default "";
}
