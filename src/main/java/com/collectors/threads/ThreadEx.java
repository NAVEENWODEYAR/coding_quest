package com.collectors.threads;

import lombok.SneakyThrows;

/**
 * @author Naveen K Wodeyar
 * @date 11-Jul-2024
 */
public class ThreadEx extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName()+"\n");
	}
	
	@SneakyThrows
	public static void main(String[] args) {
		ThreadEx thread = new ThreadEx();
		Thread thread1 = new ThreadEx();
				thread.start();
				thread.join();
				thread1.start();

	}
}
