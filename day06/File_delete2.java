package day06;

import java.io.File;

/**
 * 使用File删除一个目录
 * @author adminitartor
 *
 */
public class File_delete2 {
	public static void main(String[] args) {
		/*
		 * 删除当前目录下的demo目录
		 * 
		 * 使用File的delete方法删除目录时要求
		 * 该目录必须是一个空目录
		 */
		File dir = new File("demo");
		if(dir.exists()){
			dir.delete();
			System.out.println("目录已删除!");
		}else{
			System.out.println("该目录不存在!");
		}
	}
}





