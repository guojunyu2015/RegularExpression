package ReguTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSpider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file_name = "E:\\�̳�\\python�̳�\\��ʱ������ҳ����\\��������ʷ����ȫ�������Ҫ��������_������_�ٶ�����.html";
		try {
			FileReader fr = new FileReader(file_name);
			BufferedReader br = new BufferedReader(fr);
			
			String line_str;
			while((line_str = br.readLine()) != null) {
				/*��鱾���Ƿ�ƥ�������ַ dfas34@qq.com*/
				Pattern p = Pattern.compile("\\w+@\\w+\\.\\w+");
				Matcher m = p.matcher(line_str);
				while(m.find()) {
					System.out.println(m.group());
				}
			}
			
			br.close();
		} catch(FileNotFoundException e) {
			System.out.println("�ļ�["+file_name+"]������");
		} catch(IOException e) {
			System.out.println("�ļ�����ʧ��");
		}
		
	}

}
