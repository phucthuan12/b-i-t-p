/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baiTap;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 *
 * @author phuct
 */
public class BaiTap3 {
    public static void main(String[] args) {
         try {
            Enumeration<NetworkInterface> netInterface = NetworkInterface.getNetworkInterfaces();
            while (netInterface.hasMoreElements()) {
                NetworkInterface networkInterface = netInterface.nextElement();
                Enumeration<InetAddress> inetAddress = networkInterface.getInetAddresses();
                while (inetAddress.hasMoreElements()) {
                    InetAddress address = inetAddress.nextElement();
                    System.out.println("Interface: "+ networkInterface.getName());
                    System.out.println("Address: " + address.getHostName());
                }
            }
        } catch (Exception e) {
        }
    }
}

