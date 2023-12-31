package com.box.l10n.mojito.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.slf4j.event.Level;

/**
 * Annotation to put on methods to log its execution time.
 *
 * @author jaurambault
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface StopWatch {

  Level level() default Level.DEBUG;
}
