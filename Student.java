import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Student {
		Student stu1 = new Student();
		public static void main(String args[])throws IOException{
			FileInputStream inp=new FileInputStream("C:\\a.txt");
			byte[] b=new byte[1024];
			int length=inp.read(b);
			String s=new String(b,0,length);
			int i=1;
			char[] char_chg=s.toCharArray();
			for(char hz:char_chg){
				System.out.print(hz);
				if(i%7==0&&i%14!=0)
					System.out.print(",");
				
				if(i%14==0)
					System.out.println(".");
				i++;
		}
			inp.close();
			FileOutputStream hz=new FileOutputStream("C:\\b.txt");
			byte[] b2= s.getBytes();
			hz.write(b2);
			System.out.println("–¥»Î≥…π¶");
			hz.close();
}
}