package com.rays.oop.shellowclonig_notcopyotherclassrefres;

public class ShelloCllowningPerson implements Cloneable {
	
	public  String name;
	public   ShelloClloningAddress address;

	    public ShelloCllowningPerson(String name, ShelloClloningAddress address) {
	        this.name = name;
	        this.address = address;
	    }

	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone(); // shallow cloning
	    }

}
