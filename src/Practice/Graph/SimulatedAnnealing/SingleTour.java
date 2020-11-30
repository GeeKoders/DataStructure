package Practice.Graph.SimulatedAnnealing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleTour {
	
	public List<City> tour = new ArrayList<>() ;
	
	private int distance = 0 ;
	
	// It dont want to end up with a null point exception
	public SingleTour(){
		for(int i=0; i< Repository.getNumberOfCities(); i++){
			tour.add(null) ;
		}
	}
	
	public SingleTour(List<City> tour){
		
		List<City> currentTour = new ArrayList<>() ;
		
		for(int i=0; i<tour.size(); i++){
			currentTour.add(null) ;
		}
		
		for (int i = 0; i < tour.size(); i++){
			currentTour.set(i, tour.get(i)) ;
		}

		this.tour = currentTour ;
	}
	
	public double getDistance(){
		
		if(distance == 0){
			
			int tourDistance = 0 ;
			
			for(int cityIndex=0; cityIndex < getTourSize(); cityIndex++){
				City fromCity = getCity(cityIndex) ;
				City desinationCity ;
				
				if(cityIndex+1 < getTourSize()){
					desinationCity = getCity(cityIndex+1) ;
				}else{
					desinationCity = getCity(0) ;
				}
				
				tourDistance += fromCity.distanceTo(desinationCity) ;
				
			}
			
			this.distance = tourDistance ;
			
		}
		
		return distance ;
	}
	
	public List<City> getTour(){
		return this.tour ;
	}
	
	public void generateIndividual(){
		
		for(int cityIndex=0; cityIndex < Repository.getNumberOfCities(); cityIndex++){
			setCity(cityIndex, Repository.getCity(cityIndex)) ;
		}
		
		Collections.shuffle(tour) ;
		
	}

	public void setCity(int cityIndex, City city) {
		this.tour.set(cityIndex, city) ;
		this.distance = 0 ;
	}
	
	public City getCity(int tourPosition){
		return tour.get(tourPosition) ;
	}
	
	public int getTourSize(){
		return this.tour.size() ;
	}

	@Override
	public String toString() {
		String s = "" ;
		
		for(int i=0; i<getTourSize(); i++){
			s += getCity(i) + " -> " ;
		}
		return s ;
	}
	
}
