package nl.black.colony;

import nl.black.settings.Difficulty;

/**
 * Created by mzwart on 8-6-2017.
 */
public class ColonyWrapper {

	private Colony colony;
	private Difficulty difficulty;
	private double enemyValue;

	public ColonyWrapper(Colony colony, Difficulty difficulty) {
		this.colony = colony;
		this.difficulty = difficulty;
	}

	public Colony getColony() {
		return colony;
	}

	public void setColony(Colony colony) {
		this.colony = colony;
	}

	public double getLivingSpaceValue() {
		return colony.getLivingSpace() * colony.getUpgrades().getLivingSpace();
	}

	public double getFoodProductionValue() {
		double baseProduction = colony.getFoodProduction();
		double colonistsEffort = (colony.getColonists() / 10) * difficulty.getColonistEfficiency();
		double upgradeModifier = colony.getUpgrades().getFoodProduction();
		return (baseProduction + colonistsEffort) * upgradeModifier;
	}

	public double getFoodConsumptionValue() {
		int baseConsumption = colony.getColonists();
		double upgradeModifier = colony.getUpgrades().getFoodConsumption();
		return (double) baseConsumption / upgradeModifier;
	}

	public double getDefensiveValue() {
		double baseValue = colony.getDefensiveValue();
		double colonistEffort = (colony.getColonists() / 20) * difficulty.getColonistEfficiency();
		double upgradeModifier = colony.getUpgrades().getDefence();
		double foodRationModifier = getFoodModifier() < 0.5 ? getFoodModifier() * 2 : 1;
		return (baseValue + colonistEffort) * upgradeModifier * foodRationModifier;
	}

	public double getOffensiveValue() {
		double baseValue = colony.getOffensiveValue();
		double colonistEffort = (colony.getColonists() / 20) * difficulty.getColonistEfficiency();
		double upgradeModifier = colony.getUpgrades().getOffense();
		return (baseValue + colonistEffort) * upgradeModifier;
	}

	private double getFoodModifier(){
		return getFoodProductionValue() < getFoodConsumptionValue() ? getFoodProductionValue() / getFoodConsumptionValue() : 1;
	}

	private double getLivingspaceModifier(){
		return getLivingSpaceValue() < colony.getColonists() ? getLivingSpaceValue() / colony.getColonists() : 1;
	}

	private double getDefenseModifier(){
		return getDefensiveValue() < enemyValue ? getDefensiveValue() / enemyValue : 1;
	}

	public int getHappiness() {
		double livingSpaceValue = getLivingspaceModifier() * 100;
		double foodValue = getFoodModifier() * 100;
		double defenseValue = getDefenseModifier() * 100;
		return (int)(livingSpaceValue + foodValue + defenseValue) / 3;
	}
}
