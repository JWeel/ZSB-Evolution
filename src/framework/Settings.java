package framework;

public class Settings {
	static private Settings instance = null;
	
	public float fillRate;
	public float mutationRate;
	public float crossoverRate;
	public float matingEnergyCost;
	
	public float eatingEnergyGain;
	public float veryHungryThreshold;
	
	public float startEnergyRate; 
	public float moveStrengthModifier;
	
	public boolean allowCannibalism;
	public boolean equality;
	
	public int iterationRestAmount;
	public int cellTypesAmount;

	
	// initial settings. change them here while testing the game to fit your own preferences
	// or make a case in the method below
	public Settings() {
		fillRate = 0.25f;
		mutationRate = 0.1f;
		crossoverRate = 0.5f;
		matingEnergyCost = 0.25f;
		eatingEnergyGain = 0.5f;
		veryHungryThreshold = 0.5f;
		startEnergyRate = 0.5f;
		allowCannibalism = false;
		moveStrengthModifier = 0.5f;
		iterationRestAmount = 1;
		cellTypesAmount = 1;
		equality = false;

	}

	// set your own initial settings here
	public void newSettings(char c){
		switch (c) {
			case 'j': setSettings(0.2f, 0.05f, 0.9f, 0.16f, 0.65f, 0.29f, 1.0f, true, 0.3f, 30,9,false); break;
			case 'r': setSettings(0.4f, 0.00f, 0.81f, 0.3f, 0.75f, 0.29f, 0.7f, false, 0.5f, 100,5,false); break;
			case 'm': setSettings(0.4f, 0.089f, 0.53f, 0.21f, 2.0f, 0.29f, 0.7f, false, 1.47f, 50,7,false); break;
			case 'k': setSettings(0.65f, 0.11f, 0.45f, 0.25f, 1.85f, 0.29f, 0.85f, false, 1.4f, 75,4,false);break;
			case 'f': setSettings(0.03f, 0.11f,0.45f,0.25f,0.0f,0.29f,0.85f,false, 1.4f, 75, 2,false); break;
			case 'e': setSettings(0.25f,0.15f,0.9f,0.34f,0.9f,0.5f,1.0f,false,0.5f,20,9,true);break;
		}
	}
	
	// change all settings

	public void setSettings (float fR, float mR, float cR, float mEC, float eEG, float vHT, float sER, boolean aC, float mSM, int iRA, int cTA, boolean eq){

		fillRate = fR;
		mutationRate = mR;
		crossoverRate = cR;
		matingEnergyCost = mEC;
		eatingEnergyGain = eEG;
		veryHungryThreshold = vHT;
		startEnergyRate = sER;
		allowCannibalism = aC;
		moveStrengthModifier = mSM;
		iterationRestAmount = iRA;
		cellTypesAmount = cTA;
		equality = eq;

	}
	
	public static Settings getInstance() {
		if (Settings.instance == null) {
			Settings.instance = new Settings();
		}
		return Settings.instance;
	}
}
