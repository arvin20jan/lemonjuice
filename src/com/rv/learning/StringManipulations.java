package com.rv.learning;

import java.util.HashMap;

public class StringManipulations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringManipulations obj1 = new StringManipulations();
		obj1.firstNonRepChar("stress");		
		obj1.firstNonRepChar("teeter");

	}
	public void countEachChar(String s){
	 HashMap<Character,Integer> count = new HashMap<Character, Integer>();
	 for(int i = 0;i<s.length();i++){
		 char c = s.charAt(i);
		 if(count.containsKey(c)){
			 count.put(c, count.get(c) + 1);
		 }else{
			 count.put(c, 1);
		 }
	 }
	}
	public void firstNonRepCharUsingHashMap(String s){
		
	}
    public void firstNonRepChar(String s){
    	char[] cs = s.toCharArray();
    	int i=1;
    	int count =0,keyIndex= -1 ;
    	for(;i<cs.length;i++){
    		count = s.length() - s.replaceAll(String.valueOf(cs[i]), "").length();
    		if(count>=2){
    			continue;
    		}else{
    			keyIndex = i;
    			break;
    		}
    	}
    	if(keyIndex>0)
    		System.out.println(cs[keyIndex]);
    	else
    		System.out.println("NOT found");
    }
}
