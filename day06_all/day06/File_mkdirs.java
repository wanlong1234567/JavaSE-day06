package day06;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
 * @author adminitartor
 *
 */
public class File_mkdirs {
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰĿ¼�´���Ŀ¼:a/b/c/d/e/f
		 */
		File dir = new File(
			"a"+File.separator+
			"b"+File.separator+
			"c"+File.separator+
			"d"+File.separator+
			"e"+File.separator+"f"
		);
		if(!dir.exists()){
			dir.mkdirs();
			System.out.println("Ŀ¼�Ѵ���!");
		}else{
			System.out.println("��Ŀ¼�Ѵ���!");
		}
	}
}










