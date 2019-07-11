package com.zpf.io;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

import java.io.*;

public class BinarySerializable {
    public static void main(String[] args) {
     byte[] bytes = objToByte(new User("鲁班", "123456", "鲁国"));
      if(null != bytes){
          Object object = byteToObject(bytes);
          System.out.println("object = " + object);
      }

    }

    private static Object byteToObject(byte[] bytes) {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        Object object=new Object();
        try {
            bis = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bis);
            object= ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(null!=bis) bis.close();

                if(null!=ois) ois.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return object;
    }

    private static byte[] objToByte(Object object) {
        ByteArrayOutputStream bos =null;
        ObjectOutputStream oos =null;
        byte[] byteArray = null;
        try {
            bos= new ByteArrayOutputStream();
            oos= new ObjectOutputStream(bos);

            if(!(object instanceof Serializable)){
                System.out.println("对象未被序列化");
                return null;
            }
            oos.writeObject(object);
            byteArray= bos.toByteArray();
            oos.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {

                if(null!=bos){
                    bos.close();
                }
                if(null!=oos){
                    oos.close();
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return byteArray;

    }
}
