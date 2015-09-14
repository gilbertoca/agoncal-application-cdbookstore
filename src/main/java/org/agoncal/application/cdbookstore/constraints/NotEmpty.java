package org.agoncal.application.cdbookstore.constraints;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

@Constraint(validatedBy = {})
@ReportAsSingleViolation
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER,
         ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR })
@Documented
public @interface NotEmpty
{

   String message() default "Invalid value";

   Class<?>[]groups() default {};

   Class<? extends Payload>[]payload() default {};

   @Retention(RetentionPolicy.RUNTIME)
   @Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER,
            ElementType.TYPE, ElementType.ANNOTATION_TYPE,
            ElementType.CONSTRUCTOR })
   public @interface List
   {
      NotEmpty[]value();
   }
}