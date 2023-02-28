package com.Rajeswari2000.thirukural.Homepage;

import java.util.Scanner;

public interface HomePageViewCallBack {

	void numberSearch();

	void athigaramSearch();

	void specialitiesSearch();

	void historySearch();

	void invalidOptions();

	void printError();

	void printKuralSpecialities(Scanner scanner);

	void printKuralHistory(Scanner scanner);

	void printThankyou();

}
