
import DBConnection.Ketnoicsdl;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pham Phuc Long
 */
public class Form3 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Form3
     */
    public Form3() {
        initComponents();
        Date ngay = (Date.valueOf(java.time.LocalDate.now()));
        txtNgay.setText(""+ngay);
    }
    private Connection conn;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
        public KhachHangClass getDetail(String ma){
            Ketnoicsdl data = new Ketnoicsdl();
            Connection conn = data.getConnection();
            KhachHangClass kh = null;
            try {
                String sql = "Select * from dbo.KhachHang where MaKH = ? ";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, ma);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    String makh = rs.getString("makh");
                    String tenkh = rs.getString("tenkh");
                    long sdt = rs.getLong("sdt");
                    kh = new KhachHangClass(makh, tenkh, sdt);
                }
            } catch (Exception e) {
            e.printStackTrace();
            }
        return kh;
        }
        
        public HangHoaClass getDetail2(String ma){
            Ketnoicsdl data = new Ketnoicsdl();
            Connection conn = data.getConnection();
            HangHoaClass hh = null;
            try {
                String sql = "Select * from HangHoa where MaHH = ? ";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, ma);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    String mahh = rs.getString("mahh");
                    String tenhh = rs.getString("tenhh");
                    String quicach = rs.getString("quicach");
                    String dvtinh = rs.getString("dvtinh");
                    double gia = rs.getDouble("gia");
                    hh = new HangHoaClass(mahh, tenhh, quicach, dvtinh, gia);
                }
            } 
            catch (Exception e) {
                e.printStackTrace();
        }
        return hh;
        }
        public boolean insert(HoaDonClass hd) {
            boolean ktr = false;
            Ketnoicsdl data = new Ketnoicsdl();
            conn = data.getConnection();
            String sql = "INSERT INTO HoaDon(HDSo, Ngay, MaKH, Gia) values(?,?,?,?)";
            try {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, hd.getHdso());
                stmt.setDate(2, (Date) hd.getNgay());
                stmt.setString(3, hd.getMakh());
                stmt.setDouble(4, hd.getTrigia());
                stmt.executeUpdate();
                ktr = true;
            } 
            catch (Exception e) {
                ktr = false;
                e.printStackTrace();
            }
            return ktr;
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HDSo = new javax.swing.JTextField();
        txtNgay = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        ComboHH = new javax.swing.JComboBox<>();
        ComboMaKH = new javax.swing.JComboBox<>();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        txtTong = new javax.swing.JTextField();
        txtDg = new javax.swing.JTextField();
        txtSl = new javax.swing.JTextField();
        txtDV = new javax.swing.JTextField();
        txtQC = new javax.swing.JTextField();
        txtTenH = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Hoá đơn");

        jLabel2.setText("Hoá đơn số");

        jLabel3.setText("Ngày");

        jLabel4.setText("Mã KH");

        jLabel5.setText("Tên KH");

        jLabel6.setText("SDT");

        txtNgay.setEnabled(false);

        txtTen.setEnabled(false);

        txtSdt.setEnabled(false);

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xoá");

        jButton4.setText("Thành tiền");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Thoát");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        ComboHH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003" }));
        ComboHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboHHActionPerformed(evt);
            }
        });

        ComboMaKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KH1", "KH2", "KH3" }));
        ComboMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMaKHActionPerformed(evt);
            }
        });

        a.setText("Tên hàng");

        b.setText("Quy cách");

        c.setText("Đơn vị tính");

        d.setText("Số lượng");

        e.setText("Giá");

        f.setText("Thành tiền");

        txtTong.setEnabled(false);

        txtDg.setEnabled(false);

        txtDV.setEnabled(false);

        txtQC.setEnabled(false);

        txtTenH.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(140, 140, 140)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d)
                                    .addComponent(e)
                                    .addComponent(c)
                                    .addComponent(b)
                                    .addComponent(f)
                                    .addComponent(a))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTong, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                        .addComponent(txtQC)
                                        .addComponent(txtDV)
                                        .addComponent(txtDg)
                                        .addComponent(txtSl))
                                    .addComponent(txtTenH, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ComboHH, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(42, 42, 42)
                                .addComponent(ComboMaKH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNgay))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(HDSo))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(38, 38, 38)
                                .addComponent(txtTen))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtSdt))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ComboHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a)
                    .addComponent(txtTenH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ComboMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b)
                    .addComponent(txtQC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c)
                    .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(HDSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d)
                    .addComponent(txtSl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(e)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f)
                    .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void ComboHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboHHActionPerformed
        HangHoaClass hh;
        String ok = ComboHH.getSelectedItem().toString();
        hh = getDetail2(ok);
        txtDg.setText(""+hh.getgia());
        txtDV.setText(hh.getDvtinh());
        txtQC.setText(hh.getQuicach());
        txtTenH.setText(hh.getTenhh());
        txtSl.setText("");
        txtTong.setText("");        
    }//GEN-LAST:event_ComboHHActionPerformed

    private void ComboMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMaKHActionPerformed
        KhachHangClass k;
        String makString;
        String ok = ComboMaKH.getSelectedItem().toString();
        k = getDetail(ok);
        System.out.println(ok);
        txtSdt.setText(""+k.getsdt());
        txtTen.setText(k.getTenkh());
        makString = k.getMakh();
    }//GEN-LAST:event_ComboMaKHActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtTen.setText("");
        txtTenH.setText("");
        txtSdt.setText("");
        txtDg.setText("");
        txtTong.setText("");
        txtQC.setText("");
        txtSl.setText("");
        txtDV.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String txxt = txtSl.getText().toString();
        double a = Double.parseDouble(txxt);
        double b  = Double.parseDouble(txtDg.getText());
        System.out.println(b);
        double c =a*b;
        txtTong.setText(c+"");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String hdspString= HDSo.getText();
        String a = txtTong.getText();
        String makh = ComboMaKH.getSelectedItem().toString();
        Date ngay = (Date.valueOf(java.time.LocalDate.now()));
        double trigia = Double.parseDouble(a);
        if(insert(new HoaDonClass(hdspString, ngay, makh, trigia))){
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Thêm thất bại");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboHH;
    private javax.swing.JComboBox<String> ComboMaKH;
    private javax.swing.JTextField HDSo;
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JLabel e;
    private javax.swing.JLabel f;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextField txtDg;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtQC;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSl;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTenH;
    private javax.swing.JTextField txtTong;
    // End of variables declaration//GEN-END:variables
}
