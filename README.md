## 2020322094 张传扬 计G202
# JAVA第四次实验：
# 1.实验内容
+ 1.设计学生类    
+ 2.采用交互式方式实例化某学生；
+ 3.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件1中。
+ 4.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
+ 5.允许提供输入参数，统计古诗中某个字或词出现的次数
+ 6.输入的文本来源于文本文件1读取，把处理好的结果写入到文本文件2
+ 7.考虑操作中可能出现的异常，在程序中设计异常处理程序

# 2.实验方法
·首先创建一个Student类，其中包括学生姓名，学号，性别，年龄班级。
```
		String name;							//学生的姓名	
		int num;							    //学生的学号
		String sex;							    //学生的性别
		int age;								//学生的年龄
		String grade;							//学生的班级
  ```
  
·然后写test类，test类中写了读取1文件重新写入2文件中，并且规格化以下文本内容。
```
try (FileReader fInputStream = new FileReader("C:\\homework\\1.txt");//读文件
		   FileWriter fOutputStream  = new FileWriter("C:\\homework\\2.txt")){//重新写入文件
		   StringBuffer st=new StringBuffer();
		
		  char[] ch=new char[14];//设置有14个字符
		  while ((fInputStream.read(ch)) !=-1) {
		    st.append(ch, 0,7);
		    st.append("，");
		    st.append(ch, 7, 7);
		    st.append("。"+"\n");
		  }

```
·通过字节数组和while循环获得想要输出的字节个数。

```
byte[] data = null;
		byte[] buffer = new byte[(int) files.length()];

		while ((len=fis.read(buffer))!=-1){
		    bos.write(buffer,0,len);
		}

		data = bos.toByteArray();
		String str = new String(data);

		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入你要查找的字或词：");
		char o = sc.next().charAt(0);
		char[] ch =str.toCharArray();
		for(int i=0;i<ch.length;i++){
		    if(o==ch[i]){
		        count++;
		    }

		}
```
# 3.实验目的
+ · 掌握字符串String及其方法的使用
+ · 掌握文件的读取/写入方法
+ · 掌握异常处理结构



# 4.实验感想
+ 1.掌握如何使用while循环，for循环，if语句，学会如何使用文本输入及获取
+ 2.掌握Scanner的用法
+ 3.了解异常的使用方法
+ 4.实验时有很多代码报错，还需要参考课本和度娘，还是运用不够熟练以后会加强复习多敲代码
+ 5.再一次对JAVA这门课程产生了浓厚的兴趣
