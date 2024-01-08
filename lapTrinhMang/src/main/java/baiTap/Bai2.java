
package baiTap;

import java.net.InetAddress;

/**
 *
 * @author phuct
 */
public class Bai2 {
       public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("www.google.com");
            System.out.println("Dia chi ip google.com: " + inet.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
