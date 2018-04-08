package day06;

import java.io.File;

/**
 * 使用File删除一个文件
 * @author adminitartor
 *
 */
public class File_delete {
	public static void main(String[] args) {
		/*
		 * 删除test.txt文件
		 */
		File file = new File("text.txt");
		if(file.exists()){
			file.delete();
			System.out.println("文件已删除!");
		}else{
			System.out.println("文件不存在!");
		}
	}
}







