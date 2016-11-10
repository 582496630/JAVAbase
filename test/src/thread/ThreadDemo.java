package thread;

import java.util.Date;

public class ThreadDemo  extends Thread {

	public static void main(String[] args) throws InterruptedException  {

		Thread thread = Thread.currentThread();
		
		System.out.println("是不是后台线程：   "+thread.isDaemon());
		System.out.println("线程名字：      "+thread.getName());
		System.out.println("线程默认优先级：    "+thread.getPriority());
		System.out.println("线程是否存活：	"+thread.isAlive());
		System.out.println("线程是否已经中断：	"+thread.isInterrupted());
		System.out.println("main ID是：	"+thread.getId());
		System.out.println("main 属于哪个线程组:		"+thread.getThreadGroup());
		System.out.println("thread.toString():	"+thread.toString());
		
		
		
		System.out.println("sleep 延迟5秒");
		System.out.println("延迟前时间：		"+System.currentTimeMillis());
		Thread.sleep(5000);
		System.out.println("延迟后时间:		"+System.currentTimeMillis());
		System.out.println("结束");
		
		@SuppressWarnings(value = { "unused" })//使用系统注解压制无用的警告
	     String data =  new String();
		
		System.out.println(new Date());
		
		
		
		
		
	}

}
