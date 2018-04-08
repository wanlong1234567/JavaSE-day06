package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ͨ�����ÿ��ʵ�ʶ�д�������������ٶ�д����
 * ���ﵽ��дЧ�ʵ���ߡ�
 * @author adminitartor
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
			= new RandomAccessFile(
				"movie.mp4","r"	
			);
		
		RandomAccessFile desc
			= new RandomAccessFile(
				"movie_cp2.mp4","rw"	
			);
		
		/*
		 * int read(byte[] data)
		 * һ���Դ��ļ��ж�ȡ�����ֽ������ܳ��ȵ�
		 * �ֽ����������뵽�������У�����ֵΪʵ��
		 * ��ȡ�����ֽ�����������ֵΪ-1�����ʾ
		 * ����û�ж�ȡ���κ��ֽ�(�ļ�ĩβ��ȡ)
		 */
		
		byte[] buf = new byte[1024*10];//10k
		int len = -1;
		
		long start = System.currentTimeMillis();
		while((len = src.read(buf))!=-1){
			/*
			 * void write(byte[] date)
			 * ���������ֽ������������ֽ�һ����д��
			 * 
			 * void write(byte[] data,int offset,int len)
			 * �������ֽ�������±�offset����ʼ������len��
			 * �ֽ�һ����д��
			 */
			desc.write(buf,0,len);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("�������!��ʱ:"+(end-start)+"ms");
		src.close();
		desc.close();
	}
}




