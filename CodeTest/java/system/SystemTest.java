import java.lang.System;
import java.util.Properties;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Exception;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;


import java.util.Iterator;

public class SystemTest{
    public static void main(String[] args) throws Exception{
        // obtain system's infomation
        Properties properties = System.getProperties();
        String nextline=null;

        File propertiesFile = new File("property.properties");
        OutputStream os = new FileOutputStream(propertiesFile);
        properties.store(os,"property.properties");
        if("windows".equals(properties.getProperty("sun.desktop"))){
            nextline = "\r\n";
        }else{
             nextline = "\r\t";
        }

        //obtain system's line separator
        String lineSeparator = System.lineSeparator();
        if(""==lineSeparator||null==lineSeparator){
            System.out.println("-------------->have nothing");
        }else{
            System.out.println("-------------->"+lineSeparator);
        }
        //obtain current system environment variable
        Map<String,String> env = System.getenv();  
        Set<String> keys = env.keySet();
        Iterator<String> it = keys.iterator();

        File envFile = new File("evv.txt");
        PrintStream ps = new PrintStream(envFile);

        while(it.hasNext()){
            String key = it.next();
            System.out.println("####"+key+":"+env.get(key)+"####");

            ps.append(key).append(":").append(env.get(key)).append(nextline);
        } 
        ps.flush();
        ps.close();
    }
}