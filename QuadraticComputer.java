import java.util.Scanner;

public class QuadraticComputer {
	private Scanner kb;

	public QuadraticComputer() {
		this.kb = new Scanner(System.in);
	}

	public static void main(String[] args) {
		QuadraticComputer qc = new QuadraticComputer();
		double userInput[] = qc.getUserInput();
		double answers[] = qc.calculateSolutions(userInput);
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] != Double.NaN) System.out.printf("%d: %f\n", i + 1, answers[i]);
		}
	}

	private double[] calculateSolutions(double[] abc) {
		double x[] = {
			((-1 * abc[1]) + Math.sqrt((abc[1] * abc[1]) - 4 * abc[0] * abc[2])) / (2 * abc[0]),
			((-1 * abc[1]) - Math.sqrt((abc[1] * abc[1]) - 4 * abc[0] * abc[2])) / (2 * abc[0])
		};
		return x;
	}

	private double[] getUserInput() {
		System.out.println("Computing answers to the equation Ax^2 + Bx + C = 0");
		double results[] = new double[3];

		System.out.print("A: ");
		results[0] = kb.nextDouble();
		System.out.print("B: ");
		results[1] = kb.nextDouble();
		System.out.print("C: ");
		results[2] = kb.nextDouble();
		System.out.println();

		return results;
	}
}

