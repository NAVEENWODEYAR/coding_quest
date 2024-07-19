package com.collectors.threads;

import lombok.SneakyThrows;

/**
 * @author Naveen K Wodeyar
 * @date 19-Jul-2024
 */
public class DaemonThreadEx {

	public static void main(String[] args) {

		Runnable runnable = ()->{
			for (int i = 0; i < Thread.NORM_PRIORITY; i++) {
				System.out.println(Thread.currentThread().getName()+"~"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getPriority());
			}
		};
		Thread thread = new Thread(runnable);
				thread.setDaemon(true);
				thread.start();
	}
}
