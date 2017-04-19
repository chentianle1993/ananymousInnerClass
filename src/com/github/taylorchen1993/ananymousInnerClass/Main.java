/**
 * 
 */
package com.github.taylorchen1993.ananymousInnerClass;

/**
 * @author TaylorChen
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FatherClass overwriteObj=new FatherClass(){
			public void printLog(){
				System.out.println("This is anonymousInnerClass");
			}
		};
		overwriteObj.printLog();
		

	}

}
