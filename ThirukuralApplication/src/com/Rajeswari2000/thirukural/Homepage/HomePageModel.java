package com.Rajeswari2000.thirukural.Homepage;

import java.util.Scanner;

import com.Rajeswari2000.thirukural.Repository.ThirukuralRepository;

public class HomePageModel implements HomePageModelCallBack{
	
	private HomePageModelControllerCallBack  homePageController;
	
	public HomePageModel(HomePageModelControllerCallBack homePageController) {
		this.homePageController = homePageController;
	}

	
	public void getSpecialities() {
		Scanner scanner = ThirukuralRepository.getInstance().getSpecialities();
		
		if(scanner==null)homePageController.errorMessage();
		else homePageController.printSpecialities(scanner);
		
	}


	public void getHistory() {
		Scanner scanner = ThirukuralRepository.getInstance().getHistory();
		if(scanner==null)homePageController.errorMessage();
		else homePageController.printHistory(scanner);
		
	}

}
