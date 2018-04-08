package day06;

import java.io.File;
import java.io.FileFilter;

/**
 * File�ṩ��һ�����ص�listFiles������������
 * һ�����������÷���ֻ�ὫFile��ʾ��Ŀ¼������
 * �ù�����Ҫ�������ء�
 * @author adminitartor
 *
 */
public class File_listFiles2 {
	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼�е�"�ļ�"
		 */
		File dir = new File(".");
		
		FileFilter filter = new FileFilter(){
			/**
			 * �����������������Ϊ����file����
			 * ����Ҫ��ʱaccept����Ӧ������true
			 */
			public boolean accept(File file){
				return file.isFile();
			}
			
		};
		
		File[] subs = dir.listFiles(filter);
		for(File sub : subs){
			System.out.println(sub.getName());
		}
		
	}
}





