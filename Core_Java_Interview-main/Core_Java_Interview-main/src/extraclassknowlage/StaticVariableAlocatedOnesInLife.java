package extraclassknowlage;

public class StaticVariableAlocatedOnesInLife {
	    // static variable
	    static int count = 0; // memory is allocated only once
	    int count1=0;

	    StaticVariableAlocatedOnesInLife() {
	        count++;  // Increments the static count variable
	        count1++;
	        System.out.println("Count: " + count);
	        System.out.println("Count1: " + count1);
	    }
	}

