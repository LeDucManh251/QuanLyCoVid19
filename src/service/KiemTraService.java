/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.KiemTra;

/**
 *
 * @author admin
 */
public interface KiemTraService {
    public List<KiemTra> getList();
        public int createOrUpdate(KiemTra kiemTra);
}
