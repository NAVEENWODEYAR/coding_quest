package com.collectors.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import lombok.SneakyThrows;

/**
 * @author Naveen K Wodeyar
 * @date 11-Jul-2024
 */
public class ThreadEx extends Thread {
	
	private static Lock lock = new ReentrantLock();

	public void run() {
		lock.lock();
		Thread.currentThread();
		System.out.println(Thread.holdsLock(lock));
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
