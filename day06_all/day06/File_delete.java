package day06;

import java.io.File;

/**
 * ʹ��Fileɾ��һ���ļ�
 * @author adminitartor
 *
 */
public class File_delete {
	public static void main(String[] args) {
		/*
		 * ɾ��test.txt�ļ�
		 */
		File file = new File("text.txt");
		if(file.exists()){
			file.delete();
			System.out.println("�ļ���ɾ��!");
		}else{
			System.out.println("�ļ�������!");
		}
	}
}







