package org.oppenkod.docutations.review;

import org.oppenkod.docutations.Documentative;

import java.lang.annotation.*;

/**
 * This is used on annotations that are review annotations. The idea is that an annotation processor
 * can check for annotations annotated with this to extract review information.
 */
@Documented
@Documentative
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.ANNOTATION_TYPE})
public @interface ReviewAnnotation {}
