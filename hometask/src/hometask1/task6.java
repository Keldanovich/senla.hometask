package hometask1;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class task6 {
		public static void main (String[] args) throws IOException {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		    String s=reader.readLine();
		    s = s.replaceAll("[^A-Za-z�-��-�]", "");
		    if (s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase()))
		        System.out.println("��������� " + s);
		    else
		        System.out.println("�� ��������� " + s);
		}
	}

