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
 * Indicates that the annotated item can be null.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.SOURCE)
@Note("All targets!")
public @interface Multiple {
    /** If you want to say something ... */
    String value() default "";
}
