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
		String file_name = "E:\\教程\\python教程\\临时保存网页内容\\【福利】史上最全琅琊榜，需要请留邮箱_琅琊榜吧_百度贴吧.html";
		try {
			FileReader fr = new FileReader(file_name);
			BufferedReader br = new BufferedReader(fr);
			
			String line_str;
			while((line_str = br.readLine()) != null) {
				/*检查本行是否匹配邮箱地址 dfas34@qq.com*/
				Pattern p = Pattern.compile("\\w+@\\w+\\.\\w+");
				Matcher m = p.matcher(line_str);
				while(m.find()) {
					System.out.println(m.group());
				}
			}
			
			br.close();
		} catch(FileNotFoundException e) {
			System.out.println("文件["+file_name+"]不存在");
		} catch(IOException e) {
			System.out.println("文件操作失败");
		}
		
	}

}
