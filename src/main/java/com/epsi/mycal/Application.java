package com.epsi.mycal;

import java.util.Scanner;

public class Application {
/**
 *  On lance la calculatrice.
 * @param args un tableau.
 */
  public static void main(String[] args) {
    Scanner scanner = new Scanner( System.in );
    Calculator calc = new Calculator();
    int valueB = 1;
    System.out.print( "Veuillez saisir un calcul (+,-,*,/,prem,pair) : " );
    String calcul = scanner.nextLine();
    System.out.print( "Veuillez saisir une valeur  " );
    int valueA = scanner.nextInt();
    scanner.nextLine();
    if (!calcul.equalsIgnoreCase("prem") && !calcul.equalsIgnoreCase("pair")) {
      System.out.print( "Veuillez saisir une deuxieme valeur  " );
      valueB = scanner.nextInt();
    }
    switch (calcul) {
      case "*":
        System.out.println(calc.mul(valueA,valueB));
        break;
      case "/":
        System.out.println(calc.div(valueA,valueB));
        break;
      case "-":
        System.out.println(calc.sub(valueA,valueB));
        break;
      case "+":
        System.out.println(calc.add(valueA,valueB));
        break;
      case "prem":
        System.out.println(calc.isPremier(valueA));
        break;
      case "pair":
        System.out.println(calc.nbPair(valueA));
        break;
      default:
        break;
    }
    
  
  }

}
