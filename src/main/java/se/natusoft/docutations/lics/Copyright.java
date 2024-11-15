package se.natusoft.docutations.lics;

import se.natusoft.docutations.Documentative;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Documentative
@Retention(RetentionPolicy.RUNTIME)
public @interface Copyright {

    String year();

    String by();
}
