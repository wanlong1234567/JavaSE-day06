package day06;

import java.io.File;

/**
 * 使用File创建一个目录
 * @author adminitartor
 *
 */
public class File_mkdir {
	public static void main(String[] args) {
		/*
		 * 在当前目录下创建一个目录:demo
		 */
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("目录已创建!");
		}else{
			System.out.println("目录已存在!");
		}
		
	}
}










