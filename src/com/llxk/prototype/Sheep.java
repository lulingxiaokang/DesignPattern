package com.llxk.prototype;

import java.io.*;
import java.util.Objects;

/**
 * ClassName: Sheep
 * Package: com.llxk.prototype
 *
 * @author 庐陵小康
 * @version 1.0
 * @Desc
 * @Date 2023/10/1 17:48
 */
public class Sheep {


    /**
     * 序列化深拷贝
     * @param object
     * @return
     */
    public Object deepCopy(Object object) throws RuntimeException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = null;
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = null;
        try {
            oo = new ObjectOutputStream(bo);
            oo.writeObject(object);
            oi = new ObjectInputStream(bi);
            return oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                Objects.requireNonNull(oi).close();
                bi.close();
                Objects.requireNonNull(oo).close();
                bo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Thread.currentThread()


    }
}
