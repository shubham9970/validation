package com.springvalidation.SpringValidation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class ValidationAPIUnitTest  {
 
	 @Test
	    public void testMemberWithNoValues() {
	        Member member = new Member();

	        // validate the input
	        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	        Validator validator = factory.getValidator();
	       
	        Set<ConstraintViolation<Member>> violations = validator.validate(member);
	        System.out.println(violations);
	        Assert.assertEquals(violations.size(), 0);
	    }
}
