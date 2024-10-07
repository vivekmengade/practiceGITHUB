package com.block;

public class Vote{
    public String Age(int AGE) {
    	if(18>AGE) {
    		return "Not Eligible For vote";
    	}else {
    		return "Eligible for vote";
    	}
    }
}
