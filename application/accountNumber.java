package application;
import java.io.*;
import java.net.InetAddress;
/*
 * 这里我进行存入的文件是我的账号名，自动生成的*/
public class accountNumber {
	public static int register(String account, String password, String ID) throws IOException {
		int i = 0;
		File file = new File(account);
		if (file.exists()) {
			i = 0;
		} else {
			@SuppressWarnings("resource")
			DataOutputStream output = new DataOutputStream(new FileOutputStream(file, true));
			output.writeUTF(encrypt(account,password));
			System.out.println(encrypt(account,password));
			System.out.print(password);
			//进行密码的加密
			output.writeUTF(ID);
			i = 1;
		}
		return i;
	}
	
	public static int testing(String account) {
		int i=0;
		File file = new File(account);
		if (!file.exists()) {
			i = 1;
		} 
		else i=0;
		return i;
	}
	
	public static int testing(String account, String password) throws IOException {
		int i = 0;
		File file = new File(account );
		if (!file.exists()) {
			i = 0;
		} else {
			@SuppressWarnings("resource")
			DataInputStream input = new DataInputStream(new FileInputStream(file));
			if (decrypt(input.readUTF(),password).equals(account)) {
				System.out.print(decrypt(encrypt(account,password),password));
				System.out.print(password);
				System.out.println(encrypt(account,password));
				i = 1;
			}
			else i=0;
		}
		return i;
	}
	
	public static String encrypt(String sourceString, String password) {

		char[] p = password.toCharArray(); // 字符串转字符数组

		int n = p.length; // 密码长度

		char[] c = sourceString.toCharArray();

		int m = c.length; // 字符串长度

		for (int k = 0; k < m; k++) {

		int mima = c[k] + p[k / n]; // 加密

		c[k] = (char) mima;

		}
		return new String(c);
		}

	public static String decrypt(String sourceString, String password) {

		char[] p = password.toCharArray(); // 字符串转字符数组

		int n = p.length; // 密码长度

		char[] c = sourceString.toCharArray();

		int m = c.length; // 字符串长度

		for (int k = 0; k < m; k++) {

		int mima = c[k] - p[k / n]; // 解密

		c[k] = (char) mima;

		}

		return new String(c);

		}
}
