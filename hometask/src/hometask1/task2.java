package hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
	public static void main ( String [] arg) throws NumberFormatException, IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int n;
	n = Integer.parseInt(reader.readLine());
	System.out.println("�������� ���");
	int a = 1, b = 1;
    System.out.print(a + " " + b);
    int fib = 2, i = 2;
    while (i < n) {
        fib = a + b;
        a = b;
        b = fib;
        System.out.print(" " + fib);
        i++;
	
	
	
	}
	
}}
