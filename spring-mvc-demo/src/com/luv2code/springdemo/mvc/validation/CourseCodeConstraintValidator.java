package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String[] coursePrefixes;

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefixes = theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

        boolean result = false;

        if (theCode != null) {

            // loop through course prefixes and check if the code matches
            for (String prefix : coursePrefixes) {
                result = theCode.startsWith(prefix);
                // if theCode matches a prefix then break
                if (result)
                    break;
            }
        } else {
            return true;
        }

        return result;
    }
}
