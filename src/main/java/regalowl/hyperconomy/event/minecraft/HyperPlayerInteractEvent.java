package regalowl.hyperconomy.event.minecraft;


import regalowl.hyperconomy.account.HyperPlayer;
import regalowl.databukkit.event.Event;

public class HyperPlayerInteractEvent extends Event {

		private HyperPlayer hp;
		
		public HyperPlayerInteractEvent(HyperPlayer hp) {
			this.hp = hp;
		}

		public HyperPlayer getHyperPlayer() {
			return hp;
		}
	
}