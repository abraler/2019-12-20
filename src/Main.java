
import com.sun.corba.se.impl.orbutil.ObjectUtility;

import javax.naming.ldap.SortKey;
import java.io.*;
import java.net.Socket;

public class Main {
    private static InputStream intput() throws IOException {
        InputStream inputStream=new FileInputStream("本地文件");

        //return        inputStream;
        //byte[]bytes="内存中的一段空间".getBytes("utf-8");
        //inputStream=new ByteArrayInputStream(bytes);
        //return inputStream;


//        inputStream=System.in;
//        return inputStream

        Socket sortKey=new Socket("www.baidu.com",80);
        OutputStream os=sortKey.getOutputStream();
        Writer write=new OutputStreamWriter(os,"utf-8");
        PrintWriter printWriter=new PrintWriter(write,false);
        printWriter.print("GET/HTTP/1.0\r\n\r\n");
        printWriter.flush();
        inputStream=sortKey.getInputStream();
        return inputStream;

    }

    private static String output(InputStream in) throws IOException {
        byte[]a=new byte[1024];
        int len=in.read(a);
        String message=new String(a,0,len,"utf-8");
        //return message;
/*
        Reader reader=new InputStreamReader(in,"utf-8");
        char[]buffer=new char[1024];
        int len1=reader.read();
        String message1=new String(buffer,0,len);
        //return message;

        StringBuffer sb=new StringBuffer();
        Reader reader1=new InputStreamReader(in,"utf-8");
        char[]bu=new char[10];
        int len2;
        while((len2=reader1.read(bu))!=-1){
            sb.append(bu,0,len);
        }
        String me=sb.toString();
        return me;


  */
    Reader reader=new InputStreamReader(in,"utf-8");
    BufferedReader bufferedReader=new BufferedReader(reader);
    String line;
    StringBuffer ss=new StringBuffer();
    while((line=bufferedReader.readLine())!=null){
        ss.append(line);
    }
    return ss.toString();

    }
    public static void main(String[] args) {

    }
}
