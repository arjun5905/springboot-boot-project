package com.example.DBoperations.testAnnotations;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.DBoperations.testEmployeeAge;

public class testAge {

		@ParameterizedTest
		@ValueSource (ints = {16,17,18,19,20})
		public void testAge(int a) {
			testEmployeeAge age = new testEmployeeAge();
			age.checkAge(a);
		}

	}

