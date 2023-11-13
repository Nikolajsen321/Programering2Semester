import java.util.ArrayList;
import java.util.List;

public class Ex2 {

	// opgave 3


	public static void main(String[] args) {
		List<Runner> runners = new ArrayList<>();
		runners.addAll(List.of(
				new Runner("Ib", 30),
				new Runner("Per", 50),
				new Runner("Ole", 27),
				new Runner("Ulla", 40),
				new Runner("Jens", 35),
				new Runner("Hans", 28)));
		System.out.println(runners);
		System.out.println();

		runners.forEach(runner -> System.out.println(runner.getName() +" " + runner.getLapTime()));

		runners.forEach(runner -> {
			if (runner.getLapTime() < 30) {
				System.out.println("Name: " + runner.getName() + ". Laptime: " + runner.getLapTime());
			}
		});

		runners.sort((p1,p2) ->p1.getLapTime() - p2.getLapTime());
		runners.forEach(runner -> System.out.println(runner));


	}
}



