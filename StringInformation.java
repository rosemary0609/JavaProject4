package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class StringInformation {
 
 public static String StringInformation(String[] args){
    return null;
    // TODO Auto-generated method stub
   }
    public static void main(String[] args) {
    try {
    	System.out.println("请输入姓名、性别、专业、班级：");
      Scanner stu1=new Scanner(System.in);
      String name=stu1.next();
      String sex=stu1.next();
      String grade=stu1.next();
      String major=stu1.next();
      FileInputStream input=new FileInputStream("C:\\Users\\aaaa\\Desktop\\1.txt");
      FileOutputStream output=new FileOutputStream("C:\\Users\\aaaa\\Desktop\\2.txt");
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            writer.write("学生基本信息："+name+"  "+sex+"   "+grade+"\n");//将内容写到writer里
            char[] buff = new char[7];
            int len = reader.read(buff);
            int index = 1;
            while (len != -1)
              {
                  writer.write(buff,0,len-2);
                  if (index %2 ==0){
                      writer.write("。\n");
                  }else{
                      writer.write("，");
                  }
                  len = reader.read(buff);
                  index ++;
              }
           reader.close();
           writer.close();
           input.close();
           output.close(); 
           FileInputStream input1=new FileInputStream("C:\\Users\\aaaa\\Desktop\\2.txt");
           BufferedReader reader1=new BufferedReader(new InputStreamReader(input1));//缓冲流
           String s = reader1.readLine(); //读取行数
           System.out.println("请输入要查询的古诗关键字：");
           Scanner sc=new Scanner(System.in);//从键盘接收数据
           String str=sc.nextLine();
           char[] ch=str.toCharArray();
           int count=0;
           while (s != null) //确定行数不为空
           {            
    	boolean b=s.contains(str);//子字符串是否被包含在此字符串之中,包含输出true，否则输出false
    	String[] st=new String[s.length()-ch.length+1];   
    	if(b==true)
    	{
    		for(int i=0;i<st.length;i++)
    		{
    			st[i]= s.substring(i,i+ch.length);
    			if(st[i].equals(str))
    			{
    				count++;
       }
      }
     }
    	s = reader1.readLine(); 
          } 
           System.out.println("古诗中包含 "+str+" 字的"+" 次数为："+count+"次");//调用count，输出包含次数
      	}
    	catch(FileNotFoundException e)
    	{
    		System.out.println("找不到此文件！");
    	}
    	catch(IOException e)
    	{
    		System.out.println("输入路径有误！");
    	}
    
         }
}