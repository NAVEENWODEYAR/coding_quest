package com.collectors.interview;
/**
 * @author Naveen K Wodeyar
 * @date 18/07/2024
 */
public class SingleTonCls {

	private static SingleTonCls instance = null;
	
	private SingleTonCls() {}
	
	public synchronized static SingleTonCls getInstance() {
		if(instance == null) {
			instance = new SingleTonCls();
		}
		else{
			return null;
		}
		return instance;
	}
	
	
	public static void main(String[] args) {
		SingleTonCls s1 = SingleTonCls.getInstance();
		SingleTonCls s2 = SingleTonCls.getInstance();
		
		System.out.println(s1.hashCode()+"="+s2.hashCode());
	}

}
