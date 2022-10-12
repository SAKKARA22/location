package org.network;

public class WireLess {
	private void modamName() {
		System.out.println("Modam name = vi network");
	}
public static void main(String[] args) {
	Wifi w = new Wifi();
	w.wifiName();
	
		MobileData m= new MobileData();
		m.dataName();
		
		Lan l = new  Lan();
		l.lanName();
		
		WireLess i = new WireLess();
		i.modamName();
}
}
