package hometask1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


	

public class task3 {
		public static void main ( String [] arg) throws NumberFormatException, IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите координаты точек отрезков ax1,ay1,ax2,ay2,bx1,by1,bx2,by2");
		float ax1,ay1,ax2,ay2,bx1,by1,bx2,by2;
		float dot1,dot2,dot3,dot4;
		ax1= Float.parseFloat(reader.readLine());
		ay1= Float.parseFloat(reader.readLine());
		ax2= Float.parseFloat(reader.readLine());
		ay2= Float.parseFloat(reader.readLine());
		bx1= Float.parseFloat(reader.readLine());
		by1= Float.parseFloat(reader.readLine());
		bx2= Float.parseFloat(reader.readLine());
		by2= Float.parseFloat(reader.readLine());
		dot1=(bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
		dot2=(bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
		dot3=(ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
		dot4=(ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);
		float s,s1;
		s=dot1*dot2;
		s1=dot3*dot4;
		if ((s<0)&(s1<0)) {System.out.println("Пересекаются");}else
		{System.out.println("Непересекаются");}

	}
}