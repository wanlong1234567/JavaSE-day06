package day06;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File����һ�����ļ�
 * @author adminitartor
 *
 */
public class File_createNewFile {
	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰĿ¼�´����ļ�:test.txt
		 * ��д·��Ĭ�Ͼ��ǵ�ǰĿ¼
		 */
		File file = new File("text.txt");
		/*
		 * boolean exists()
		 * �жϵ�ǰFile��ʾ���ļ���Ŀ¼�Ƿ��Ѿ�����
		 */
		if(!file.exists()){
			file.createNewFile();
			System.out.println("�ļ��������!");
		}else{
			System.out.println("���ļ��Ѵ���!");
		}
		
	}
}









