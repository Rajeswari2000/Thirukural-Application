package com.Rajeswari2000.thirukural.athigaramSearch;
import com.Rajeswari2000.thirukural.dto.*;
import java.util.*;

import com.Rajeswari2000.thirukural.Repository.ThirukuralRepository;

public class AthigaramSearchModel implements AthigaramSearchModelCallBack {

	private AthigaramSearchModelControllerCallBack athigaramSearchController;
	public AthigaramSearchModel(AthigaramSearchModelControllerCallBack athigaramSearchController) {
		this.athigaramSearchController = athigaramSearchController;
	}
	
	public void searchKuralAthigaram(int number) {
		
		List list = new ArrayList();
	
		list = ThirukuralRepository.getInstance().thirukuralAthigaramName(number);
		if(list.isEmpty()) {
			
			athigaramSearchController.processFailure();
		}
		else {
			List<Thirukural>tenThirukural =ThirukuralRepository.getInstance().getAllThirukuralFromAthigaram((long)list.get(1)-1);
			
			athigaramSearchController.kuralAthigaramList(tenThirukural,list);
		}
	}
}
