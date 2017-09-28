package ReguTest;
import java.util.regex.*;

public class FuncMatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "int APS_Transmit_Check()";
		System.out.println(str.matches(""));
		String str1 = "1#define";
		System.out.println(str1.matches("#.*"));
	}
}
