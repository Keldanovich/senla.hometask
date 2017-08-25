package hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5 {
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String s=reader.readLine();
	    s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
	    if (s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase()))
	        System.out.println("Палиндром! " + s);
	    else
	        System.out.println("Не палиндром! " + s);
	}
}
