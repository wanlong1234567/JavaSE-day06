package day06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File
 * File���ڱ�ʾ�ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * ͨ��File����:
 * 1:���ʸ��ļ���Ŀ¼��������Ϣ(���֣���С���޸�ʱ���)
 * 2:�����ļ���Ŀ¼(������ɾ��)
 * 3:����һ��Ŀ¼������
 * ���ǲ��ܶ�ȡ�ļ����ݡ�
 * @author adminitartor
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File(
			"."+File.separator+"demo.txt"
		);
		
		String name = file.getName();
		System.out.println("name:"+name);
		
		long length = file.length();
		System.out.println("len:"+length);
		
		/*
		 * ��ȡ����޸�ʱ��
		 * 2017��8��29��,9:37:02
		 */
		long time = file.lastModified();
		SimpleDateFormat sdf
			= new SimpleDateFormat(
				"yyyy��M��d��,H:mm:ss"	
			);
//		Date date = new Date(time);
//		System.out.println(sdf.format(date));
		System.out.println(sdf.format(time));
		
		boolean canWrite = file.canWrite();
		boolean canRead = file.canRead();
		System.out.println("��д:"+canWrite);
		
		boolean isHidden = file.isHidden();
		System.out.println("�Ƿ�����:"+isHidden);
		
		
	}
}











