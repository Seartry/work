package ssm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class IOTest {

	public static void main(String[] args) throws IOException {
		accessFile();
	}
	//File的基本方法
	public static void createFile() {
		File file = new File("C:\\Users\\y\\Desktop\\IO");
		//判断文件或者目录是否存在
		System.out.println(file.exists());
		if(!file.exists()) {
			file.mkdir();//创建文件夹
		}else {
			file.delete();//删除
		}
		
		File file2 = new File("C:\\Users\\y\\Desktop\\IO\\newfile.txt");
		if(!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			file2.delete();
		}
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getName());
		System.out.println(file2.getParent());
		System.out.println(file2.getParentFile().getAbsolutePath());
	}
	/**
	 * 列出指定目录下（包括在目录）的所有文件
	 * @param file
	 * @throws IOException
	 */
	public static void listDriectory(File dir) throws IOException{
		if(!dir.exists()) {
			throw new IllegalArgumentException("目录"+dir+"不存在;");
		}
		if(!dir.isDirectory()) {
			throw new IllegalArgumentException(dir+"不是目录");
		}
		/**
		//返回的路径
		String[] filenames = dir.list();
		for(String string:filenames) {
			System.err.println(string+"\\"+string);
		}
		**/
//		System.out.println("-----------------------");
		File[] files = dir.listFiles();
		if(files != null && files.length > 0) {
			for(File file:files) {
				if(file.isDirectory()) {
					listDriectory(file);
				}else {
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
	//文件内容访问类RandomAccessFile
	public static void accessFile() throws IOException {
		File demo = new File("demo");//创建一个file对象
		if(!demo.exists()) {//如果该对象所在的地方不存在该文件夹就创建
			demo.mkdir();
		}
		File file = new File(demo,"raf.txt");//创建一个file文件对象
		if(!file.exists()) {//如果不存在该文件就创建
			file.createNewFile();
		}
		//创建一个文件访问类实例，并规定堵读写的模式
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		System.out.println(raf.getFilePointer());//获取指针位置
		raf.write('A');
		System.out.println(raf.getFilePointer());
		raf.writeInt(3);
		System.out.println(raf.getFilePointer());
		String str = "中国";
		byte[] utf = str.getBytes();
		raf.write(utf);
		raf.close();
	}
	//BufferedReader
	public void testReader() throws IOException {
		File file = new File("demo\\br.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
	}
	
}
