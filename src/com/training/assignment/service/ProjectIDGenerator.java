package com.training.assignment.service;

public class ProjectIDGenerator {
	  private static int id = 1;

	    /**
	     * A static method that increments the id used as employee identifier.
	     *
	     * @return
	     */
	    public static int generateID() {
	        return id++;
	    }

}
