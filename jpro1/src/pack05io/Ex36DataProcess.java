package pack05io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex36DataProcess {

	public static void main(String[] args) throws Exception {
		// 이진데이터 처리

		Ex36BinaryData binaryData = new Ex36BinaryData();

		// 저장
		System.out.println("----- 저장 -----");
		File f = new File("c:/work/iotest3.dat");
//		File dir = new File("c:/work/");
//		File file = new File(dir, "iotest3.dat");

		FileOutputStream fo = new FileOutputStream(f);
		BufferedOutputStream bo = new BufferedOutputStream(fo, 1024);
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		
		oo.writeObject(binaryData);
		oo.close();
		bo.close();
		fo.close();
		
		System.out.println("save complete\n");
		
		// 읽기
		System.out.println("----- 읽기 -----");
		File f2 = new File("c:/work/iotest3.dat");
		FileInputStream fi = new FileInputStream(f2);
		BufferedInputStream bi = new BufferedInputStream(fi, 1024);
		ObjectInputStream oi = new ObjectInputStream(bi);
		
		Object obj = oi.readObject();
		Ex36BinaryData data = (Ex36BinaryData)obj; // casting
		System.out.println(data.a);
		System.out.println(data.b);
		System.out.println(data.ss1);
		System.out.println(data.ss2);
		
		oi.close();
		bi.close();
		fi.close();
	}

}
