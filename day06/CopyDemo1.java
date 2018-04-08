package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RAF�����ļ�
 * @author adminitartor
 *
 */
public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
			= new RandomAccessFile(
				"movie.mp4","r"	
			);
		
		RandomAccessFile desc
			= new RandomAccessFile(
				"movie_cp.mp4","rw"	
			);
		
		int d = -1;//��¼ÿ�ζ�ȡ�����ֽ�
		
		long start = System.currentTimeMillis();
		while((d = src.read())!=-1 ){
			desc.write(d);
		}
		long end = System.currentTimeMillis();
	
		System.out.println("�������!��ʱ:"+(end-start)+"ms");
		src.close();
		desc.close();
		
	}
}









