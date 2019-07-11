package com.zpf.io;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) {
        objRead();
    }

    private static void objRead() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("D:\\myfile\\t.txt");
            ois = new ObjectInputStream(fis);
            User user = (User) ois.readObject();
            System.out.println("user = " + user);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(null!=fis){
                    fis.close();
                }
                if (null!=ois){
                    ois.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    /*
     * 序列化的目的
     * 当一个类实现了Serializable接口，实际是告诉jvm这个可以被序列化（类似于锁synchronized）,
     * 对于jvm的一种标识
     *
     *异常---NotSerializableException
     * 当当前序列化对象未实现Serializable接口时--会抛出NotSerializableException
     * 而java常用基础类，例如 String， Integer等都实现了Serializable接口
     * if (obj instanceof String) {
                writeString((String) obj, unshared);
            } else if (cl.isArray()) {
                writeArray(obj, desc, unshared);
            } else if (obj instanceof Enum) {
                writeEnum((Enum<?>) obj, desc, unshared);
            } else if (obj instanceof Serializable) {
                writeOrdinaryObject(obj, desc, unshared);
            } else {
                if (extendedDebugInfo) {
                    throw new NotSerializableException(
                        cl.getName() + "\n" + debugInfoStack.toString());
                } else {
                    throw new NotSerializableException(cl.getName());
                }
            }
     */
    private static void  objWrite(){
        FileOutputStream fos=null;
        ObjectOutputStream oops=null;
        try {
            fos= new FileOutputStream("D:\\myfile\\t.txt");
            oops = new ObjectOutputStream(fos);
            User user = new User("李白", "9527", "安陆");
            oops.writeObject(user);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (null!=fos){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null!=oops){
                try {
                    oops.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
