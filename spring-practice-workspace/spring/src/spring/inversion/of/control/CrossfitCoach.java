package spring.inversion.of.control;

public class CrossfitCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Do 100 burpies";
	}
}
