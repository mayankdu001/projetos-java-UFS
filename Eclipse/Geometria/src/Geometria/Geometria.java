package Geometria;

import java.util.Scanner;

public class Geometria {

    public static void main(String[] args) {
        Area objFig = new Area();
        double base;
        double altura;
        double baseMenor;
        double baseMaior;
        double lado;
        double ladoMaior;
        double ladoMenor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("===PARA O QUADRADO===");
        System.out.print("Inforem base do quadrado: ");
        base = entrada.nextDouble();

        System.out.println("Ã�rea do Quadrado: " + objFig.AreaCalc(base));

        System.out.println("===PARA O RETÃ‚NGULO===");
        System.out.print("Inforem base do retangulo: ");
        base = entrada.nextDouble();
        System.out.print("Inforem altura do retÃ¢ngulo: ");
        altura = entrada.nextDouble();

        System.out.println("Ã�rea do Retangulo: " + objFig.AreaCalc(base, altura));

        System.out.println("===PARA O TRAPÃ‰ZIO===");
        System.out.print("Inforem base menor do trapÃ©zio: ");
        baseMenor = entrada.nextDouble();
        System.out.print("Inforem base maior do trapÃ©zio: ");
        baseMaior = entrada.nextDouble();
        System.out.print("Inforem altura do trapÃ©zio: ");
        altura = entrada.nextDouble();

        System.out.println("Ã�rea do Retangulo: " + objFig.AreaCalc(baseMenor, baseMaior, altura));
        
        
        System.out.println("informe o lado do quadrado");
        lado = entrada.nextDouble();
        System.out.println("perimetro de um quadrado: "+ objFig.PerimetroCal(lado));
        
        
        System.out.println("informe o maior lado do retangulo");
        ladoMaior = entrada.nextDouble();
        System.out.println("informe o menor lado do retangulo");
        ladoMenor = entrada.nextDouble();
        
        
        
        System.out.println("perimetro do retangulo: " + objFig.PerimetroCal(ladoMaior, ladoMenor));
        
        
    }
}