/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import view.DangNhapJDialog;
import view.MainJFrame;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        //new MainJFrame().setVisible(true);
        DangNhapJDialog dialog = new DangNhapJDialog(null, true);
        dialog.setTitle("Đăng Nhập Hệ Thống");
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
    
}
