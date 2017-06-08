package nl.black.settings;

/**
 * Created by mzwart on 8-6-2017.
 */
public class Difficulty {

	private double baseDifficulty = 1;
	private double workoutEffect = 1;
	private double colonistInterval;
	private double colonistEfficiency = 1;

	public double getBaseDifficulty() {
		return baseDifficulty;
	}

	public void setBaseDifficulty(double baseDifficulty) {
		this.baseDifficulty = baseDifficulty;
	}

	public double getWorkoutEffect() {
		return workoutEffect;
	}

	public void setWorkoutEffect(double workoutEffect) {
		this.workoutEffect = workoutEffect;
	}

	public double getColonistInterval() {
		return colonistInterval;
	}

	public void setColonistInterval(double colonistInterval) {
		this.colonistInterval = colonistInterval;
	}

	public double getColonistEfficiency() {
		return colonistEfficiency;
	}

	public void setColonistEfficiency(double colonistEfficiency) {
		this.colonistEfficiency = colonistEfficiency;
	}
}
