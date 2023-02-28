package com.Rajeswari2000.thirukural.athigaramSearch;

public interface AthigaramSearchViewCallback {

	void invalidSelection();

	void errorMessage();


	void athigaramMenu();

	void goBack();

	void showAllKuralInAthigaram(String athigaramName, Long[] number, String[] line1, String[] line2,
			String[] tamilExplanation, String[] translation, String[] englishTranslation);

}
