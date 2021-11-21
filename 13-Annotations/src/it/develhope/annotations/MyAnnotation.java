package it.develhope.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    boolean isInProgress();

}
