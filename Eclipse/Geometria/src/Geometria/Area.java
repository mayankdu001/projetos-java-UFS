package Geometria;

public class Area {

	public static double AreaCalc(double base) {
		double area;
		area = base * base;
		return area;
	}

	public static double AreaCalc(double base, double altura) {
		double area;
		area = base * altura;
		return area;
	}

	public static double AreaCalc(double baseMenor, double baseMaior,
			double altura) {
		double area;
		area = (baseMenor + baseMaior) * altura / 2;
		return area;
	}

	public static double PerimetroCal(double lado) {
		double perimetro;
		perimetro = lado * 4;
		return perimetro;
	}

	public static double PerimetroCal(double ladoMaior, double ladoMenor) {
		double perimetro = (ladoMaior * 2) + (ladoMenor * 2);
		return perimetro;
	}

}