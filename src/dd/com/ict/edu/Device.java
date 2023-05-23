package dd.com.ict.edu;

public abstract class Device {

	private String name ;
	private int vol ;
	static final int dv = 3;
	static final int minv = 0;
	static final int maxv = 10;
	
	public Device() {
		name = "음향장치";
		vol = 3;
	}
	
	public Device(String name) {
		this.name = name;
		vol = 3;
	}
	
	
	public void up(){
		if(vol < maxv)
			vol++;
	}
	
	public void down() {
		if(vol>minv)
			vol--;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}
	
	
}
