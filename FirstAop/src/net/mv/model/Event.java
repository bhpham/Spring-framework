package net.mv.model;

public class Event {

		public void playConcert() {
			System.out.println("Band warms up");
			System.out.println("Band plays music");
			this.randomSleep();
		}
		
		public void playComedyShow(){ 
			System.out.println("Host introduces the comedians");
			System.out.println("Comedian performs");
			//throw new IllegalArgumentException();
			this.randomSleep();
		}
		
		private void randomSleep() {
			try {
				Thread.sleep((long) (3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
}
