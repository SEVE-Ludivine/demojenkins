package com.epsi.mycal;
import java.util.Scanner;
public class Application {

  public static void main(String[] args) {
    Scanner scanner = new Scanner( System.in );
    Calculator calc = new Calculator();
    int b = 1;
    System.out.print( "Veuillez saisir un calcul (+,-,*,/,prem,pair) : " );
    String calcul = scanner.nextLine();
    System.out.print( "Veuillez saisir une valeur  " );
    int a = scanner.nextInt();
    scanner.nextLine();
    if (!calcul.equalsIgnoreCase("prem") && !calcul.equalsIgnoreCase("pair")) {
      System.out.print( "Veuillez saisir une deuxieme valeur  " );
      b = scanner.nextInt();
    }
    switch (calcul) {
      case "*":
        System.out.println(calc.mul(a,b));
        break;
      case "/":
        System.out.println(calc.div(a,b));
        break;
      case "-":
        System.out.println(calc.sub(a,b));
        break;
      case "+":
        System.out.println(calc.add(a,b));
        break;
      case "prem":
        System.out.println(calc.isPremier(a));
        break;
      case "pair":
        System.out.println(calc.nbPair(a));
        break;
    }
    
  
  }

}
