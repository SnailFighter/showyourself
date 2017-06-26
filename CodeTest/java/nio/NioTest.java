/**
*nio 读取文件
*
*/

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.io.IOException;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.Charset;


public class NioTest {
	
	public  void method1(){
        RandomAccessFile aFile = null;
        try{
            aFile = new RandomAccessFile("./test","rw");
            FileChannel fileChannel = aFile.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(1024);
            CharBuffer charBuffer  = CharBuffer.allocate(1024);
            
 			Charset chartset = Charset.forName("UTF-8");
 			CharsetDecoder decoder = chartset.newDecoder();
 			
 			
            int bytesRead = fileChannel.read(buf);
            System.out.println("byteBuffer 长度为  "+bytesRead);
 
            while(bytesRead != -1)
            {
                buf.flip();
                decoder.decode(buf,charBuffer,false);
                System.out.println("charbuffer 长度   "+charBuffer.length());
                System.out.println("charBuffer 内容   "+charBuffer.toString());
                System.out.println("charBuffer.hasRemaining()"+charBuffer.hasRemaining());
                while(charBuffer.hasRemaining())
                {
                	
                    System.out.print((char)charBuffer.get());
                }
 				charBuffer.compact();
                buf.compact();
                bytesRead = fileChannel.read(buf);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(aFile != null){
                    aFile.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args){
    	new NioTest().method1();
    }
	
	
}
