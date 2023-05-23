package day15.com.ict.edu5;

public class Main {
 public static void main(String[] args) {
	Terran terran = new Terran();
	terran.setName("마린");
	terran.setFly(false);
	terran.setEnergy(40);
	
	Protoss protoss = new Protoss("질럿", 80, false);
	
	Zerg zerg = new Zerg("뮤탈", 120, true);
	
	terran.decEnergy();
	zerg.decEnergy();
	protoss.decEnergy();
	
	System.out.println("terran 에너지 : " + terran.getEnergy());
	System.out.println("protoss 에너지 : " + protoss.getEnergy());
	System.out.println("zerg 에너지 : " + zerg.getEnergy());
	
	terran.decEnergy();
	terran.decEnergy();
	
	System.out.println("terran 에너지 : " + terran.getEnergy());
	System.out.println("protoss 에너지 : " + protoss.getEnergy());
	System.out.println("zerg 에너지 : " + zerg.getEnergy());
}
}
