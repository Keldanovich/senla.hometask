package hometask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
	
	public static void main ( String [] arg) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("������� ���-�� ��������");
		n = Integer.parseInt(reader.readLine());
		int count = 0;
		  for (int i = 1; i <= n; i++){
		    for (int j = 1; j <= i; j++){
		    if ((i%j) == 0)
		     count++;
		    }
		    if (count <= 2)
		      System.out.println(i);
		      count = 0;
		   }
	
	 
		/*(System.out.println("������� ���-�� ��������");
		n = Integer.parseInt(reader.readLine());
		int [] mas = new int[n];
			for (int i = 0; i < n; i++)
		{
			System.out.print("������� ��������");
			mas[i]= Integer.parseInt(reader.readLine());
			if (mas[i]==1 || mas[i]==2 || mas[i]==3) {System.out.println("�����������");}
			for(int d=2; d*d<=mas[i]; d++){
			if(mas[i]%d==0) { System.out.println("���������"); break;}else
			{System.out.println("�����������");break;}
	}
	}*/
	}
} 
