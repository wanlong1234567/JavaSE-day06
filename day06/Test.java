package day06;

import java.io.File;
/**
 * ����ˮ��1��Ǯ������1ƿ��ˮ��2����ƿ���Ի�
 * һƿ��ˮ��3��ƿ�ǿ��Ի�һƿ��ˮ����:20��Ǯ
 * �����򵽶���ƿ��ˮ?
 * 
 * ��дһ�δ��룬���1+2+3+4+....100
 * ����������
 * ����δ����в��ó���for,while�ؼ���
 * 
 * 
 * �����ڲ����õ�ǰ�����������Ϊ�ݹ����
 * �ݹ�����ĳ�δ���ִ�й�������Ҫ��������
 * �����ظ�ִ��ʱʹ�á�
 * 
 * �ݹ������Ҫע�⣬����Ҫ�з�֧�����жϣ�����
 * 100%���У���������ѭ����
 * �ݹ�Ӧ���������⣬�ݹ����Խ���ڴ�����Լ��
 * ����ִ���ٶ�����
 * 
 * 
 * 
 * ��д��������������File��ʾ���ļ���Ŀ¼ɾ��
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("a");
		deleteFile(dir);
	}
	public static void deleteFile(File file){
		if(file.isDirectory()){
			//�ֽ���Ŀ¼���
			File[] subs = file.listFiles();
			for(File sub : subs){
				deleteFile(sub);
			}
			
		}
		file.delete();
	}
}





