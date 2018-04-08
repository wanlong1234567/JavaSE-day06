package day06;

import java.io.File;

/**
 * ʹ��File��ȡһ��Ŀ¼�е���������
 * @author adminitartor
 *
 */
public class File_listFiles {
	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼�е���������
		 */
		File dir = new File(".");
		/*
		 * �ж�File��ʾ�����ļ�����Ŀ¼
		 * boolean isFile()
		 * boolean isDirectory()
		 */
		if(dir.isDirectory()){
			/*
			 * File[] listFiles()
			 * ��ȡ��ǰFile��ʾ��Ŀ¼�е���������
			 * ���ص�������ÿ��Ԫ��Ϊ��Ŀ¼�е�һ��
			 * ���
			 */
			File[] subs = dir.listFiles();
			for(File sub : subs){
				if(sub.isFile()){
					System.out.print("�ļ�:");
				}
				if(sub.isDirectory()){
					System.out.print("Ŀ¼:");
				}
				System.out.println(sub.getName());
			}
		}
		
	}
}










