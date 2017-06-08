package nl.black.colony;

/**
 * Created by mzwart on 8-6-2017.
 */
public class Colony {

	private int colonists = 1;
	private String name;
	private double livingSpace = 5;
	private double worldKnowledge = 1;
	private Upgrades upgrades;
	private double foodProduction = 5;
	private double offensiveValue = 5;
	private double defensiveValue = 5;

	public Colony(String name) {
		this.name = name;
	}

	public int getColonists() {
		return colonists;
	}

	public void setColonists(int colonists) {
		this.colonists = colonists;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLivingSpace() {
		return livingSpace;
	}

	public void setLivingSpace(double livingSpace) {
		this.livingSpace = livingSpace;
	}

	public double getWorldKnowledge() {
		return worldKnowledge;
	}

	public void setWorldKnowledge(double worldKnowledge) {
		this.worldKnowledge = worldKnowledge;
	}

	public Upgrades getUpgrades() {
		return upgrades;
	}

	public void setUpgrades(Upgrades upgrades) {
		this.upgrades = upgrades;
	}

	public double getFoodProduction() {
		return foodProduction;
	}

	public void setFoodProduction(double foodProduction) {
		this.foodProduction = foodProduction;
	}

	public double getOffensiveValue() {
		return offensiveValue;
	}

	public void setOffensiveValue(double offensiveValue) {
		this.offensiveValue = offensiveValue;
	}

	public double getDefensiveValue() {
		return defensiveValue;
	}

	public void setDefensiveValue(double defensiveValue) {
		this.defensiveValue = defensiveValue;
	}
}
