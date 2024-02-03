package com.example.JPAAOP.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Retain annotation at runtime
@Retention(RetentionPolicy.RUNTIME)
// @Target - determines where to put this annotation
@Target(ElementType.METHOD)
public @interface LogExecutionTime {
}
