package opgave3Teater;

public class TheaterFloor {
	int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
			{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

	/**
	 * Hvis plads seat på række row er ledig reserveres pladsen og prisen på pladsen
	 * returneres. Der returneres 0 hvis pladsen er optaget.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */

	public int buySeat(int row, int seat) {
		row = row -1;
		seat = seat -1;
		int price = seats[row][seat];
		seats[row][seat] = 0;
		return price;
	}

	/**
	 * følgende er definetioner af metoder,  hvis man lver kommentar og følger en bestemt
	 * standard til en bestemt metode
	 * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
	 * prisen returneres. Der returneres 0, hvis der ikke er nogen pladser ledige
	 * til den pågældende pris.
	 *
	 * @param row
	 * @param seat
	 * @param price
	 * @return
	 */
	public int buySeat(int price) {
		for(int i = 0; i < seats.length; i++){
			for(int j = 0; j < seats[i].length; j++){
				if(price == seats[i][j]){
					seats[i][j] = 0;
					return price;
				}
			}
		}
		// TODO
		return 0;

	}

	public void printTheaterFloor() {
		// TODO
		String string = "Sæde " + "    1    2    3    4    5    6    7    8    9     10";
		System.out.println(string);
		System.out.println("--------------------------------------------------------");

		for (int row = 0; row < seats.length; row++) {
			for (int col = 0; col < seats[row].length; col++) {
				if(col == 0) {
					System.out.print("Række "+ (row + 1) + ": " + seats[row][col] + ",  ");
				}
				else if(col == seats[row].length-1) {
					if(col == seats[row].length -1){
						System.out.print(seats[row][col] + ":   KR ");
					}
					else {
						System.out.print(seats[row][col] + " ");
					}
				}
				else {
					System.out.print(seats[row][col] + ",  ");
				}
			}
			System.out.println();
		}
	}
}
