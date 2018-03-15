import java.security.MessageDigest;
import java.math.BigInteger;

import java.io.FileInputStream;
import java.io.File;

import java.lang.Exception;


public class FileCompare{

	public static void main(String[] args){
		String digest1 = getFileMd5("./README");
		String digest2 = getFileMd5("./README1");
		System.out.println("文件签名 "+digest1+"  "+digest2);
		
	}
	
	public static String getFileMd5(String filePath){
		String md5Str = null;
		
		File file  = new File(filePath);
		
		
		MessageDigest digest = null;
		FileInputStream in = null;
		
		byte buffer[] = new byte[1024];
		int len;
		
		try{
			digest = MessageDigest.getInstance("MD5");
			in  = new FileInputStream(file);
			while((len=in.read(buffer))>0){
				digest.update(buffer,0,len);
			}
			BigInteger bigInt = new BigInteger(1,digest.digest());
			md5Str = bigInt.toString(16);
			return md5Str;
		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				in.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
		return md5Str;
		
	}

}
