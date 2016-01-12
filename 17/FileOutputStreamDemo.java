/*************************************************************************
    > File Name: FileOutputStreamDemo.java
    > Author: Derek Zhu
    > E-mail: 1and1get2@gmail.com 
    > Created Time: Fri 20 Jul 2012 12:25:00 NZST
    > 
 ************************************************************************/
// to write byte to a file
// constructors:
//	(String filePath)
//	(File fileObject)
//	(String filePath, boolean append)

import java.io.*;

class FileOutputStreamDemo{
	public static void main(String args[]) throws Exception{
		String source = "Now is the time for all good men to come to the \n" +
			" aid of their country and pay their due taxes.";
		byte buf[] = source.getBytes();
		OutputStream f0 = new FileOutputStream("file1.txt");
		for (int i = 0; i < buf.length; i +=2){
			f0.write(buf[i]);
		}
		f0.close();

		OutputStream f1 = new FileOutputStream("file2.txt");
		f1.write(buf);
		f1.close();

		OutputStream f2 = new FileOutputStream("file3.txt");
		f2.write(buf, buf.length * 3 / 4, buf.length / 4);
		f2.close();
	}
}
