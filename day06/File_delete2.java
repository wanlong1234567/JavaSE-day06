package day06;

import java.io.File;

/**
 * ʹ��Fileɾ��һ��Ŀ¼
 * @author adminitartor
 *
 */
public class File_delete2 {
	public static void main(String[] args) {
		/*
		 * ɾ����ǰĿ¼�µ�demoĿ¼
		 * 
		 * ʹ��File��delete����ɾ��Ŀ¼ʱҪ��
		 * ��Ŀ¼������һ����Ŀ¼
		 */
		File dir = new File("demo");
		if(dir.exists()){
			dir.delete();
			System.out.println("Ŀ¼��ɾ��!");
		}else{
			System.out.println("��Ŀ¼������!");
		}
	}
}





