enum TrafficLight {

	Red(30), Yellow(45), Green(25);

	private final int duration;

	TrafficLight(int i) {
		this.duration = i;
	}

	public int getDuration() {
		return duration;
	}
}

public class TrafficLights {

	public static void main(String[] args) {
		for (TrafficLight l : TrafficLight.values()) {
			System.out.print(l);
			System.out.println("\t" + l.getDuration());
		}
	}

}
