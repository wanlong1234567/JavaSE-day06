package day06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * ר��������д�ļ�
 * RAF��д�ļ��ǻ����ļ�ָ����еģ���:RAF������
 * �ļ�ָ��ָ����ļ�λ�ý��ж�д�ֽڡ����Ҷ�д��
 * ָ����Զ����Ƶ���һ���ֽ�λ�á�
 * 
 * @author adminitartor
 *
 */
public class RandomAccessFile_write {
	public static void main(String[] args) throws IOException {
		/*
		 * ��raf.dat�ļ���д���ֽ�
		 * 
		 * ����RAFʱ��Ҫָ������Ȩ�ޡ�
		 * Ȩ�޳��õ���:
		 * r:ֻ��ģʽ�����ļ����ݽ���ȡ
		 * rw:��дģʽ
		 * ��RAF�������ļ������ڣ���ôRAF��rwģʽ
		 * ʱ�����Զ������ļ�����������������Ϊr
		 * ģʽ�����׳��ļ������ڵ��쳣��
		 */
		RandomAccessFile raf
			= new RandomAccessFile(
				"raf.dat","rw"	
			);
		/*
		 * void write(int d)
		 * ���ļ���д��1���ֽڣ�д���Ǹ�����intֵ
		 * ��Ӧ��2���ƵĵͰ�λ��
		 *                            vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 */
		raf.write(1);
		
		System.out.println("д�����!");
		raf.close();
	}
}









