package day06;

import java.io.File;

/**
 * ʹ��File����һ��Ŀ¼
 * @author adminitartor
 *
 */
public class File_mkdir {
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰĿ¼�´���һ��Ŀ¼:demo
		 */
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("Ŀ¼�Ѵ���!");
		}else{
			System.out.println("Ŀ¼�Ѵ���!");
		}
		
	}
}










