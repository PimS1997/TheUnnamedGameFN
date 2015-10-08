package com.tugfn.essentials;

public class GameThread implements Runnable{
	
	protected boolean running;
	protected Thread thread;
	protected String threadName;

	@Override
	public void run() {

	}
	
	public void start(){
	
		if(thread == null){
			thread = new Thread(this);
			thread.setDaemon(true);
			thread.start();
		}
		running = true;
		threadName = this.getClass().getSimpleName();
	}
	public void sleep(int amount){
		try {
			Thread.sleep(amount);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getThreadName() {
		return threadName;
	}

}
