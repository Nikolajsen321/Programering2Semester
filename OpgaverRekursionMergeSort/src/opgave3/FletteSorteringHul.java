package opgave3;

import java.util.ArrayList;

public class FletteSorteringHul {

	// den metode der saetter fletningen i gang
	public void fletteSort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	// den rekursive metode der implementere del-loes og kombiner skabelonen
	private void mergesort(ArrayList<Integer> list, int l, int h) {
		if (l < h) { // bliver ved til l = h altså der kun er en tilbage og så derefter
			// går den jo videre til næste side til sidst merge
			int m = (l + h) / 2;
			mergesort(list, l, m); // Opdeler fra l <= midten
			mergesort(list, m + 1, h); //Opdeler fra midten +1 <= h
			merge(list, l, m, h);
			/*
			Når man har få opdelt til man fx når en list med hvor der kun skal være 1 tal tilbage
			så begynder den at forsætte fordi betingelsen l < h ikke vil gælde længere
			det vil resultere i alle rekursion begynder "retunere altså kører færdig i dette tilfælde"
			og så stopper

			 */
		}
	}

	// kombiner er realiseret ved fletteskabelonen
	private void merge(ArrayList<Integer> list, int low, int middle, int high) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int counter1 = low;
		int counter2 = middle+1;

		while (counter1 <= middle && counter2 <= high){
			if(list.get(counter1) < list.get(counter2)){
				temp.add(list.get(counter1));
				counter1++;
//				for(int i = 0; i < temp.size(); i++){
//					list.set(i,temp.get(i));
//				}
//				temp.add(list.get(low));<
			}
			else {
				temp.add(list.get(counter2));
				counter2++;

//				for(int i = counter2; i < temp.size(); i++){
//					list.set(i,temp.get(i));
//				}
			}

		}
		while (counter1 <= middle){
			temp.add(list.get(counter1));
			counter1++;


		}

		while (counter2 <= high){
			temp.add(list.get(counter2));
			counter2++	;


		}
		for(int i = 0; i < temp.size(); i++){
			list.set(i +low,temp.get(i));
		}


	}

}
