package test20220801;

import java.util.Scanner;

class Triangle {
	double p1, p2, p3;

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public void setP3(double p3) {
		this.p3 = p3;
	}

	public double add(Triangle tr) {
		double r = this.p1 + this.p2 + this.p3;
		return r / 3;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();

		x.setP1(sc.nextDouble());
		y.setP1(sc.nextDouble());
		x.setP2(sc.nextDouble());
		y.setP2(sc.nextDouble());
		x.setP3(sc.nextDouble());
		y.setP3(sc.nextDouble());
		sc.close();

		System.out.printf("(%.1f, %.1f)", x.add(x), y.add(y));

	}

}