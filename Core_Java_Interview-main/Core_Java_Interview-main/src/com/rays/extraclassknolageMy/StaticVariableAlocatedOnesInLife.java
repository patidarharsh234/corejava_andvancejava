package com.rays.extraclassknolageMy;

public class StaticVariableAlocatedOnesInLife {
	    // static variable
	    static int count = 0; // memory is allocated only once

	    StaticVariableAlocatedOnesInLife() {
	        count++;  // Increments the static count variable
	        System.out.println("Count: " + count);
	    }
	}

