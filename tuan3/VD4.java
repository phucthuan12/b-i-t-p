
package com.mycompany.project1.tuan3;

public class VD4 {
    private final Object lc = new Object();
    public synchronized void phuongThuc1(){
        
    }
    public synchronized void phuongThuc2(){
        synchronized (lc) {
            
        }
    }
    public static void main(String[] args) {
        Thread th = new Thread(()->{
            
        });
        th.start();
        try {
        } catch (Exception e) {
        
        }
    }
}
