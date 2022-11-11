/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import iplm.dongsanphampl;
import iplm.mausacmpl;
import iplm.nhasanxuatmpl;
import iplm.sanphamchitietmpl;
import iplm.sanphammpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dongsanpham;
import model.mausac;
import model.nhasanxuat;
import model.sanpham;
import model.sanphamchitiet;

/**
 *
 * @author Administrator
 */
public class ql_sanphamview extends javax.swing.JDialog {

//    SanPhamChiTietImpl dvspct = new SanPhamChiTietImpl();
    /**
     * Creates new form ql_sanphamview
     */
    private DefaultTableModel model = new DefaultTableModel();
    private List<sanphamchitiet> listspct = new ArrayList<>();
    private DefaultComboBoxModel cbbnsx = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbmms = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbmdsp = new DefaultComboBoxModel();
    private DefaultComboBoxModel cbbsp = new DefaultComboBoxModel();

    private List<sanpham> listsp = new ArrayList<>();
    private List<nhasanxuat> listnsx = new ArrayList<>();
    private List<mausac> listms = new ArrayList<>();
    private List<dongsanpham> listdongsp = new ArrayList<>();

    mausacmpl msmpl = new mausacmpl();
    dongsanphampl dspmpl = new dongsanphampl();
    nhasanxuatmpl nsxmpl = new nhasanxuatmpl();
    sanphammpl spmpl = new sanphammpl();
    sanphamchitietmpl spctmpll = new sanphamchitietmpl();

    public ql_sanphamview() {
        initComponents();
        String[] hearch = {"ID", "TEN SP", "NSX", "COLOR", "DONG SP", "MABH", "MO TA", "SL", "GIA NHAP", "GIA BAN"};
        model.setColumnIdentifiers(hearch);
        table.setModel(model);
        listsp = spmpl.getall();
        listms = msmpl.getall();
        listnsx = nsxmpl.getall();
        listdongsp = dspmpl.getall();
        listspct = spctmpll.getall();
        showdata(listspct);
        this.setLocationRelativeTo(null);

        cbbmasp.setModel(cbbsp);
        cbbsnxx.setModel(cbbnsx);
        cbbms.setModel(cbbmms);
        cbbdongsp.setModel(cbbmdsp);
        setcbb();
    }

    public void setcbb() {
        for (sanpham sp1 : listsp) {
            cbbsp.addElement(sp1.getIdsp());
        }

//
        for (dongsanpham dsp1 : listdongsp) {
            cbbmdsp.addElement(dsp1.getIdDsp());
        }

        for (mausac ms1 : listms) {
            cbbmms.addElement(ms1.getId());
        }

        for (nhasanxuat nsx1 : listnsx) {
            cbbnsx.addElement(nsx1.getIdnsx());
        }

        String idsp = (String) cbbmasp.getSelectedItem();
        sanpham sp = spmpl.getone(idsp);
        jbnmasp.setText(sp.getTensanpham());
////
        String idms = (String) cbbms.getSelectedItem();
        mausac ms = msmpl.getone(idms);
        jblms.setText(ms.getTenmausac());
//        
        String iddongsp = (String) cbbdongsp.getSelectedItem();
        dongsanpham dsp = dspmpl.getone(iddongsp);
        jbldongsp.setText(dsp.getTendongsanpham());
//        
        String nsxx = (String) cbbsnxx.getSelectedItem();
        nhasanxuat nsx = nsxmpl.getone(nsxx);
        jblnsx.setText(nsx.getTennhasanxuat());

    }

    // show data
    private void showdata(List<sanphamchitiet> listshow) {
        model.setRowCount(0);
        for (sanphamchitiet a : listshow) {
            model.addRow(a.toaddrow());
        }
    }

    public void hienthitable() {
        listspct = spctmpll.getall();
        showdata(listspct);
    }

    public void click(int index) {
        sanphamchitiet spct = listspct.get(index);
        txtgiaban.setText(spct.getGiaBan() + "");
        txtgianhap.setText(spct.getGiaNhap() + "");
        txtmota.setText(spct.getMoTa());
        txtsl.setText(spct.getSoLuongTon() + "");
        txtnambh.setText(spct.getNamBH() + "");

//        String sanpham = cbbsp.getSelectedItem().toString();
//        cbbmasp.setSelectedItem(spct.getIdSP());
//        
        String dongsanpham = cbbdongsp.getSelectedItem().toString();
        cbbdongsp.setSelectedItem(spct.getIdDongSP());

        String mausac = cbbms.getSelectedItem().toString();
        cbbms.setSelectedItem(spct.getIdMauSac());

        String nhasanxuat = cbbsnxx.getSelectedItem().toString();
        cbbsnxx.setSelectedItem(spct.getIdMauSac());

    }

    public void clear() {
        txtgiaban.setText("");
        txtgianhap.setText("");
        txtsl.setText("");
        txtnambh.setText("");
        txtmota.setText("");
    }

//        private void showData(List<SanPhamChiTiet> listshow) {
//        dtm.setRowCount(0);
//        for (SanPhamChiTiet a : listshow) {
//            dtm.addRow(a.torowData());
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbbmasp = new javax.swing.JComboBox<>();
        jbnmasp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbbsnxx = new javax.swing.JComboBox<>();
        jblnsx = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbms = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbbdongsp = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtmota = new javax.swing.JTextField();
        btnsanpham = new javax.swing.JButton();
        txtsl = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnnsx = new javax.swing.JButton();
        txtgianhap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnmausac = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtgiaban = new javax.swing.JTextField();
        btndongsp = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtnambh = new javax.swing.JTextField();
        jblms = new javax.swing.JLabel();
        jbldongsp = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Masp: ");

        cbbmasp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbmasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbmaspActionPerformed(evt);
            }
        });

        jbnmasp.setText("jLabel2");

        jLabel3.setText("Nsx: ");

        cbbsnxx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbsnxx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbsnxxActionPerformed(evt);
            }
        });

        jblnsx.setText("jLabel4");

        jLabel5.setText("Màu Sắc: ");

        cbbms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbmsActionPerformed(evt);
            }
        });

        jLabel6.setText("Dong sp: ");

        cbbdongsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbdongsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbdongspActionPerformed(evt);
            }
        });

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("NEW");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jLabel7.setText("Mô Tả: ");

        btnsanpham.setText("Sản Phẩm");
        btnsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsanphamMouseClicked(evt);
            }
        });
        btnsanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsanphamActionPerformed(evt);
            }
        });

        jLabel8.setText("SL: ");

        btnnsx.setText("NSX");
        btnnsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnsxActionPerformed(evt);
            }
        });

        jLabel9.setText("giá Nhập: ");

        btnmausac.setText("Màu Sắc ");
        btnmausac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmausacActionPerformed(evt);
            }
        });

        jLabel10.setText("giá Bán: ");

        btndongsp.setText("Dong Sp");
        btndongsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndongspActionPerformed(evt);
            }
        });

        jLabel11.setText("Nam BH: ");

        jblms.setText("jLabel12");

        jbldongsp.setText("jLabel13");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbbdongsp, 0, 262, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbbsnxx, 0, 262, Short.MAX_VALUE)
                                            .addComponent(cbbms, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbbmasp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jblnsx, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbnmasp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jblms)
                                    .addComponent(jbldongsp, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jButton2)
                                .addGap(201, 201, 201)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnambh, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnnsx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnmausac, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(btndongsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnsanpham))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbbmasp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbnmasp)
                            .addComponent(jLabel7)
                            .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnsanpham)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jblnsx)
                            .addComponent(cbbsnxx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jblms))
                            .addComponent(cbbms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbbdongsp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbldongsp)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnsx))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmausac))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btndongsp)))))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtnambh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int row = table.getSelectedRow();
        click(row);
    }//GEN-LAST:event_tableMouseClicked

    private void cbbmaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbmaspActionPerformed
        // TODO add your handling code here:
        String idsp = (String) cbbmasp.getSelectedItem();
        sanpham sp = spmpl.getone(idsp);
        jbnmasp.setText(sp.getTensanpham());
    }//GEN-LAST:event_cbbmaspActionPerformed

    private void btnsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsanphamMouseClicked

        // TODO add your handling code here:

    }//GEN-LAST:event_btnsanphamMouseClicked

    private void btnsanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsanphamActionPerformed
        // TODO add your handling code here:
        Sanphamview spview = new Sanphamview();
        spview.setVisible(true);

    }//GEN-LAST:event_btnsanphamActionPerformed

    private void cbbmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbmsActionPerformed
        // TODO add your handling code here:
        String idms = (String) cbbms.getSelectedItem();
        mausac ms = msmpl.getone(idms);
        jblms.setText(ms.getTenmausac());
//        
    }//GEN-LAST:event_cbbmsActionPerformed

    private void cbbsnxxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbsnxxActionPerformed
        // TODO add your handling code here:
        String nsxx = (String) cbbsnxx.getSelectedItem();
        nhasanxuat nsx = nsxmpl.getone(nsxx);
        jblnsx.setText(nsx.getTennhasanxuat());
    }//GEN-LAST:event_cbbsnxxActionPerformed

    private void cbbdongspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbdongspActionPerformed
        // TODO add your handling code here:
        String iddongsp = (String) cbbdongsp.getSelectedItem();
        dongsanpham dsp = dspmpl.getone(iddongsp);
        jbldongsp.setText(dsp.getTendongsanpham());
    }//GEN-LAST:event_cbbdongspActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      
//        if (txtgianhap.getText().length() < 1) {
//            JOptionPane.showMessageDialog(this, "Gia Ban Phai Lon Hon 0");
//        }

        String id = cbbmasp.getSelectedItem().toString();
        String nsx = cbbsnxx.getSelectedItem().toString();
        String dong = cbbdongsp.getSelectedItem().toString();
        String mau = cbbms.getSelectedItem().toString();
        
 if(txtgianhap.getText().length() < 1 ) {
         JOptionPane.showMessageDialog(this, "GIA NHAP NULL");
      }
  
        int bh = Integer.parseInt(txtnambh.getText());
        String mota = txtmota.getText();
        int soluong = Integer.parseInt(txtsl.getText());
        float gianhap = Float.parseFloat(txtgianhap.getText());
        float giaban = Float.parseFloat(txtgiaban.getText());
        sanphamchitiet spct = new sanphamchitiet(id, nsx, mau, dong, bh, mota, soluong, gianhap, giaban);
        JOptionPane.showMessageDialog(this, spctmpll.add(spct));
        //  listspct=spctmpll.getall();
        hienthitable();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Hay Chon 1 Dong");
        }
        String idsp = cbbmasp.getSelectedItem().toString();
        String nsx = cbbsnxx.getSelectedItem().toString();
        String dong = cbbdongsp.getSelectedItem().toString();
        String mau = cbbms.getSelectedItem().toString();

        int bh = Integer.parseInt(txtnambh.getText());
        String mota = txtmota.getText();
        int soluong = Integer.parseInt(txtsl.getText());
        float gianhap = Float.parseFloat(txtgianhap.getText());
        float giaban = Float.parseFloat(txtgiaban.getText());
        String id = (String) table.getValueAt(row, 0);
        sanphamchitiet spct = new sanphamchitiet(idsp, nsx, mau, dong, bh, mota, soluong, gianhap, giaban);
        JOptionPane.showMessageDialog(this, spctmpll.update(spct, id));
        hienthitable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        clear();
        JOptionPane.showMessageDialog(this, "New Thanh Cong");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui Long Chon 1 Dong Tren Table");
        }
        String id = (String) table.getValueAt(row, 0);
        JOptionPane.showMessageDialog(this, spctmpll.delete(id));
        hienthitable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnnsxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnsxActionPerformed
        // TODO add your handling code here:
        nhasanxuatview nsx = new nhasanxuatview();
        nsx.setVisible(true);
    }//GEN-LAST:event_btnnsxActionPerformed

    private void btnmausacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmausacActionPerformed
        // TODO add your handling code here:
        mausacview msview = new mausacview();
        msview.setVisible(true);
    }//GEN-LAST:event_btnmausacActionPerformed

    private void btndongspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndongspActionPerformed
        // TODO add your handling code here:
        dongsanphamview dspview = new dongsanphamview();
        dspview.setVisible(true);
    }//GEN-LAST:event_btndongspActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ql_sanphamview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ql_sanphamview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ql_sanphamview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ql_sanphamview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                ql_sanphamview dialog = new ql_sanphamview(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
                new ql_sanphamview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndongsp;
    private javax.swing.JButton btnmausac;
    private javax.swing.JButton btnnsx;
    private javax.swing.JButton btnsanpham;
    private javax.swing.JComboBox<String> cbbdongsp;
    private javax.swing.JComboBox<String> cbbmasp;
    private javax.swing.JComboBox<String> cbbms;
    private javax.swing.JComboBox<String> cbbsnxx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jbldongsp;
    private javax.swing.JLabel jblms;
    private javax.swing.JLabel jblnsx;
    private javax.swing.JLabel jbnmasp;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtgiaban;
    private javax.swing.JTextField txtgianhap;
    private javax.swing.JTextField txtmota;
    private javax.swing.JTextField txtnambh;
    private javax.swing.JTextField txtsl;
    // End of variables declaration//GEN-END:variables
}
