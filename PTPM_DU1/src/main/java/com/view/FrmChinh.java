package com.view;

import java.awt.Color;
import javax.swing.JPanel;

public class FrmChinh extends javax.swing.JFrame {
    
    JPanel jPanel;
    
    public FrmChinh() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Home = new javax.swing.JPanel();
        in_1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_SP = new javax.swing.JPanel();
        in_2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_BanHang = new javax.swing.JPanel();
        in_3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_HoaDon = new javax.swing.JPanel();
        in_4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_KhuyenMai = new javax.swing.JPanel();
        in_5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_DoiSP = new javax.swing.JPanel();
        in_6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_KhachHang = new javax.swing.JPanel();
        in_7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_NhanVien = new javax.swing.JPanel();
        in_8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_Thongke = new javax.swing.JPanel();
        in_9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setBackground(new java.awt.Color(23, 35, 51));
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dev Iphone");
        dashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));
        dashboard.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 93, 240, -1));

        btn_Home.setBackground(new java.awt.Color(41, 57, 80));
        btn_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_HomeMousePressed(evt);
            }
        });

        in_1.setOpaque(false);

        javax.swing.GroupLayout in_1Layout = new javax.swing.GroupLayout(in_1);
        in_1.setLayout(in_1Layout);
        in_1Layout.setHorizontalGroup(
            in_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        in_1Layout.setVerticalGroup(
            in_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");

        javax.swing.GroupLayout btn_HomeLayout = new javax.swing.GroupLayout(btn_Home);
        btn_Home.setLayout(btn_HomeLayout);
        btn_HomeLayout.setHorizontalGroup(
            btn_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_HomeLayout.createSequentialGroup()
                .addComponent(in_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 111, Short.MAX_VALUE))
        );
        btn_HomeLayout.setVerticalGroup(
            btn_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_HomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(in_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dashboard.add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 50));

        btn_SP.setBackground(new java.awt.Color(41, 57, 80));
        btn_SP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_SPMousePressed(evt);
            }
        });

        in_2.setOpaque(false);

        javax.swing.GroupLayout in_2Layout = new javax.swing.GroupLayout(in_2);
        in_2.setLayout(in_2Layout);
        in_2Layout.setHorizontalGroup(
            in_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        in_2Layout.setVerticalGroup(
            in_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("San pham");

        javax.swing.GroupLayout btn_SPLayout = new javax.swing.GroupLayout(btn_SP);
        btn_SP.setLayout(btn_SPLayout);
        btn_SPLayout.setHorizontalGroup(
            btn_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_SPLayout.createSequentialGroup()
                .addComponent(in_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 131, Short.MAX_VALUE))
        );
        btn_SPLayout.setVerticalGroup(
            btn_SPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_SPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(in_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_SPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
        );

        dashboard.add(btn_SP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 50));

        btn_BanHang.setBackground(new java.awt.Color(41, 57, 80));
        btn_BanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BanHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_BanHangMousePressed(evt);
            }
        });

        in_3.setOpaque(false);

        javax.swing.GroupLayout in_3Layout = new javax.swing.GroupLayout(in_3);
        in_3.setLayout(in_3Layout);
        in_3Layout.setHorizontalGroup(
            in_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        in_3Layout.setVerticalGroup(
            in_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ban hang");

        javax.swing.GroupLayout btn_BanHangLayout = new javax.swing.GroupLayout(btn_BanHang);
        btn_BanHang.setLayout(btn_BanHangLayout);
        btn_BanHangLayout.setHorizontalGroup(
            btn_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BanHangLayout.createSequentialGroup()
                .addComponent(in_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(0, 134, Short.MAX_VALUE))
        );
        btn_BanHangLayout.setVerticalGroup(
            btn_BanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_BanHangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(in_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_BanHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(20, 20, 20))
        );

        dashboard.add(btn_BanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 240, 50));

        btn_HoaDon.setBackground(new java.awt.Color(41, 57, 80));
        btn_HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_HoaDonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_HoaDonMousePressed(evt);
            }
        });

        in_4.setOpaque(false);

        javax.swing.GroupLayout in_4Layout = new javax.swing.GroupLayout(in_4);
        in_4.setLayout(in_4Layout);
        in_4Layout.setHorizontalGroup(
            in_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        in_4Layout.setVerticalGroup(
            in_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hoa don");

        javax.swing.GroupLayout btn_HoaDonLayout = new javax.swing.GroupLayout(btn_HoaDon);
        btn_HoaDon.setLayout(btn_HoaDonLayout);
        btn_HoaDonLayout.setHorizontalGroup(
            btn_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_HoaDonLayout.createSequentialGroup()
                .addComponent(in_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(0, 143, Short.MAX_VALUE))
        );
        btn_HoaDonLayout.setVerticalGroup(
            btn_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_HoaDonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(in_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_HoaDonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
        );

        dashboard.add(btn_HoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 240, 50));

        btn_KhuyenMai.setBackground(new java.awt.Color(41, 57, 80));
        btn_KhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_KhuyenMaiMousePressed(evt);
            }
        });

        in_5.setOpaque(false);

        javax.swing.GroupLayout in_5Layout = new javax.swing.GroupLayout(in_5);
        in_5.setLayout(in_5Layout);
        in_5Layout.setHorizontalGroup(
            in_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        in_5Layout.setVerticalGroup(
            in_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Khuyen mai");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_KhuyenMaiLayout = new javax.swing.GroupLayout(btn_KhuyenMai);
        btn_KhuyenMai.setLayout(btn_KhuyenMaiLayout);
        btn_KhuyenMaiLayout.setHorizontalGroup(
            btn_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_KhuyenMaiLayout.createSequentialGroup()
                .addComponent(in_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(0, 115, Short.MAX_VALUE))
        );
        btn_KhuyenMaiLayout.setVerticalGroup(
            btn_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_KhuyenMaiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(in_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_KhuyenMaiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(20, 20, 20))
        );

        dashboard.add(btn_KhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 240, 50));

        btn_DoiSP.setBackground(new java.awt.Color(41, 57, 80));
        btn_DoiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_DoiSPMousePressed(evt);
            }
        });

        in_6.setOpaque(false);

        javax.swing.GroupLayout in_6Layout = new javax.swing.GroupLayout(in_6);
        in_6.setLayout(in_6Layout);
        in_6Layout.setHorizontalGroup(
            in_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        in_6Layout.setVerticalGroup(
            in_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Doi san pham");

        javax.swing.GroupLayout btn_DoiSPLayout = new javax.swing.GroupLayout(btn_DoiSP);
        btn_DoiSP.setLayout(btn_DoiSPLayout);
        btn_DoiSPLayout.setHorizontalGroup(
            btn_DoiSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_DoiSPLayout.createSequentialGroup()
                .addComponent(in_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(0, 102, Short.MAX_VALUE))
        );
        btn_DoiSPLayout.setVerticalGroup(
            btn_DoiSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_DoiSPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(in_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(btn_DoiSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboard.add(btn_DoiSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 240, 50));

        btn_KhachHang.setBackground(new java.awt.Color(41, 57, 80));
        btn_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_KhachHangMousePressed(evt);
            }
        });

        in_7.setOpaque(false);

        javax.swing.GroupLayout in_7Layout = new javax.swing.GroupLayout(in_7);
        in_7.setLayout(in_7Layout);
        in_7Layout.setHorizontalGroup(
            in_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        in_7Layout.setVerticalGroup(
            in_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Khach Hang");

        javax.swing.GroupLayout btn_KhachHangLayout = new javax.swing.GroupLayout(btn_KhachHang);
        btn_KhachHang.setLayout(btn_KhachHangLayout);
        btn_KhachHangLayout.setHorizontalGroup(
            btn_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_KhachHangLayout.createSequentialGroup()
                .addComponent(in_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(0, 110, Short.MAX_VALUE))
        );
        btn_KhachHangLayout.setVerticalGroup(
            btn_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_KhachHangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(in_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(btn_KhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboard.add(btn_KhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 240, 50));

        btn_NhanVien.setBackground(new java.awt.Color(41, 57, 80));
        btn_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NhanVienMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_NhanVienMousePressed(evt);
            }
        });

        in_8.setOpaque(false);

        javax.swing.GroupLayout in_8Layout = new javax.swing.GroupLayout(in_8);
        in_8.setLayout(in_8Layout);
        in_8Layout.setHorizontalGroup(
            in_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        in_8Layout.setVerticalGroup(
            in_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nhan Vien");

        javax.swing.GroupLayout btn_NhanVienLayout = new javax.swing.GroupLayout(btn_NhanVien);
        btn_NhanVien.setLayout(btn_NhanVienLayout);
        btn_NhanVienLayout.setHorizontalGroup(
            btn_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_NhanVienLayout.createSequentialGroup()
                .addComponent(in_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(0, 127, Short.MAX_VALUE))
        );
        btn_NhanVienLayout.setVerticalGroup(
            btn_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_NhanVienLayout.createSequentialGroup()
                .addGroup(btn_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_NhanVienLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(in_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboard.add(btn_NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 240, 50));

        btn_Thongke.setBackground(new java.awt.Color(41, 57, 80));
        btn_Thongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ThongkeMousePressed(evt);
            }
        });

        in_9.setOpaque(false);

        javax.swing.GroupLayout in_9Layout = new javax.swing.GroupLayout(in_9);
        in_9.setLayout(in_9Layout);
        in_9Layout.setHorizontalGroup(
            in_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        in_9Layout.setVerticalGroup(
            in_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Thong ke");

        javax.swing.GroupLayout btn_ThongkeLayout = new javax.swing.GroupLayout(btn_Thongke);
        btn_Thongke.setLayout(btn_ThongkeLayout);
        btn_ThongkeLayout.setHorizontalGroup(
            btn_ThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ThongkeLayout.createSequentialGroup()
                .addComponent(in_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        btn_ThongkeLayout.setVerticalGroup(
            btn_ThongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_ThongkeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(in_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(btn_ThongkeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboard.add(btn_Thongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 240, 50));

        getContentPane().add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 240, 810));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.BorderLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 4, 880, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SPMousePressed
        setColor(btn_SP);
        in_2.setOpaque(true);
        resetColor(new JPanel[]{btn_BanHang, btn_HoaDon, btn_Home, btn_KhuyenMai, btn_DoiSP},
                new JPanel[]{in_1, in_3, in_4, in_5, in_6, in_7, in_8, in_9});
    }//GEN-LAST:event_btn_SPMousePressed

    private void btn_HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMousePressed
        setColor(btn_Home);
        in_1.setOpaque(true);
        resetColor(new JPanel[]{btn_BanHang, btn_HoaDon, btn_SP, btn_KhuyenMai, btn_DoiSP},
                new JPanel[]{in_2, in_3, in_4, in_5, in_6, in_7, in_8, in_9});
    }//GEN-LAST:event_btn_HomeMousePressed

    private void btn_BanHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BanHangMousePressed
        setColor(btn_BanHang);
        in_3.setOpaque(true);
        resetColor(new JPanel[]{btn_Home, btn_HoaDon, btn_SP, btn_KhuyenMai, btn_DoiSP},
                new JPanel[]{in_2, in_1, in_4, in_5, in_6, in_7, in_8, in_9});
    }//GEN-LAST:event_btn_BanHangMousePressed

    private void btn_HoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HoaDonMousePressed
        setColor(btn_HoaDon);
        in_4.setOpaque(true);
        resetColor(new JPanel[]{btn_BanHang, btn_Home, btn_SP, btn_KhuyenMai, btn_DoiSP},
                new JPanel[]{in_2, in_3, in_1, in_5, in_6, in_7, in_8, in_9});
    }//GEN-LAST:event_btn_HoaDonMousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MousePressed

    private void btn_DoiSPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DoiSPMousePressed
        setColor(btn_DoiSP);
        in_6.setOpaque(true);
        resetColor(new JPanel[]{btn_BanHang, btn_HoaDon, btn_SP, btn_KhuyenMai,
            btn_Home, btn_NhanVien, btn_KhachHang, btn_Thongke},
                new JPanel[]{in_2, in_3, in_4, in_5, in_1, in_7, in_8, in_9});
    }//GEN-LAST:event_btn_DoiSPMousePressed

    private void btn_KhuyenMaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_KhuyenMaiMousePressed
        setColor(btn_KhuyenMai);
        in_5.setOpaque(true);
        resetColor(new JPanel[]{btn_BanHang, btn_HoaDon, btn_SP, btn_Home, btn_DoiSP},
                new JPanel[]{in_2, in_3, in_4, in_1, in_6});
    }//GEN-LAST:event_btn_KhuyenMaiMousePressed

    private void btn_HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HoaDonMouseClicked
        jPanel = new JPHoaDon();
        showJpanel(jPanel);
    }//GEN-LAST:event_btn_HoaDonMouseClicked

    private void btn_KhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_KhachHangMousePressed
        setColor(btn_KhachHang);
        in_7.setOpaque(true);
        resetColor(new JPanel[]{btn_BanHang, btn_HoaDon, btn_SP, btn_KhuyenMai,
            btn_Home, btn_NhanVien, btn_DoiSP, btn_Thongke},
                new JPanel[]{in_2, in_3, in_4, in_5, in_1, in_6, in_8, in_9});
    }//GEN-LAST:event_btn_KhachHangMousePressed

    private void btn_NhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NhanVienMousePressed
        setColor(btn_NhanVien);
        in_8.setOpaque(true);
        resetColor(new JPanel[]{btn_BanHang, btn_HoaDon, btn_SP, btn_KhuyenMai,
            btn_Home, btn_DoiSP, btn_KhachHang, btn_Thongke},
                new JPanel[]{in_2, in_3, in_4, in_5, in_1, in_7, in_6, in_9});
    }//GEN-LAST:event_btn_NhanVienMousePressed

    private void btn_ThongkeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThongkeMousePressed
        setColor(btn_Thongke);
        in_9.setOpaque(true);
        resetColor(new JPanel[]{btn_BanHang, btn_HoaDon, btn_SP, btn_KhuyenMai,
            btn_Home, btn_NhanVien, btn_KhachHang, btn_DoiSP},
                new JPanel[]{in_2, in_3, in_4, in_5, in_1, in_7, in_8, in_6});
    }//GEN-LAST:event_btn_ThongkeMousePressed

    private void btn_BanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BanHangMouseClicked
        jPanel = new HoaDonJpanel();
        showJpanel(jPanel);
    }//GEN-LAST:event_btn_BanHangMouseClicked

    private void btn_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NhanVienMouseClicked
        jPanel = new JPNhanVien();
        showJpanel(jPanel);
    }//GEN-LAST:event_btn_NhanVienMouseClicked
    
    private void setColor(JPanel jPanel) {
        jPanel.setBackground(new Color(41, 57, 80));
    }
    
    private void resetColor(JPanel[] jPanel, JPanel[] opacity) {
        for (int i = 0; i < jPanel.length; i++) {
            jPanel[i].setBackground(new Color(23, 35, 51));
        }
        for (int i = 0; i < opacity.length; i++) {
            opacity[i].setOpaque(false);
        }
    }
    
    private void showJpanel(JPanel jPanel1) {
        container.removeAll();
        container.add(jPanel1);
        container.validate();
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_BanHang;
    private javax.swing.JPanel btn_DoiSP;
    private javax.swing.JPanel btn_HoaDon;
    private javax.swing.JPanel btn_Home;
    private javax.swing.JPanel btn_KhachHang;
    private javax.swing.JPanel btn_KhuyenMai;
    private javax.swing.JPanel btn_NhanVien;
    private javax.swing.JPanel btn_SP;
    private javax.swing.JPanel btn_Thongke;
    private javax.swing.JPanel container;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel in_1;
    private javax.swing.JPanel in_2;
    private javax.swing.JPanel in_3;
    private javax.swing.JPanel in_4;
    private javax.swing.JPanel in_5;
    private javax.swing.JPanel in_6;
    private javax.swing.JPanel in_7;
    private javax.swing.JPanel in_8;
    private javax.swing.JPanel in_9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
