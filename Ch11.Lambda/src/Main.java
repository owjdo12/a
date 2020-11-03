import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Main {
	public static void main(String[] args) {
	      String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", 
	              "Jupiter", "Saturn", "Uranus", "Neptune" };
	        System.out.println(Arrays.toString(planets));
	        System.out.println("Sorted in dictionary order:");
	        Arrays.sort(planets);
	        System.out.println(Arrays.toString(planets));
	        System.out.println("Sorted by length:");
	       Arrays.sort(planets, (first, second) -> 
	        	first.length() - second.length());
	        System.out.println(Arrays.toString(planets));
	              
	        Timer t = new Timer(1000, event ->
	           System.out.println("The time is " + new Date()));
	        t.start();    
	           
	  	  JOptionPane.showMessageDialog(null, "Quit program?");
		  System.exit(0);     
	}
}

/*
 * 1. (매개변수) -> {함수몸체}
 * 2. () -> {함수몸체)				=> 매개변수가 하나일 경우 생략가능
 * 3. (매개변수) -> 함수몸체			=> 함수 몸체가 단일 실행문이면 괄호생략 가능
 * 4. (매개변수) -> {return 0;}
 */
