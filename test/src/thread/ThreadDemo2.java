package thread;

import java.util.Date;



public class ThreadDemo2 extends Thread{


		private String name;
	    public ThreadDemo2(String name) {
	       this.name=name;
	    }
		public void run() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println(name + "运行  :  " + i);
	            try {
	                sleep((int) Math.random() * 10);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
		}       

		public static void main(String[] args) {
			ThreadDemo2 mTh1=new ThreadDemo2("A");
			ThreadDemo2 mTh2=new ThreadDemo2("B");
			mTh1.start();
			mTh2.start();

		}

	
	}


