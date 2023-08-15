/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
import java.text.*;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import db.koneksi;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import java.awt.Color;
//import javax.swing.event.DocumentEvent;
//import javax.swing.event.DocumentListener;
/**
 *
 * @author Jason T K
 */
public class penilaian extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    public String tgl, ijab, idiv, nj, nd, itun, ilow, idk, nm, pd, setp, org;
    static String ilo;
    static int ex;
    public int x=0;
public int y=0;
SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * Creates new form penilaian
     */
    public penilaian() {
        initComponents();
        kosong();
        aktif();
        datatable();
   c1.setEnabled(false);
   c3.setEnabled(false);
   c4.setEnabled(false);
   c5.setEnabled(false);
   c6.setEnabled(false);
   c2.setEnabled(false);
   nama.setEnabled(false);
   this.setLocationRelativeTo(null);
   Color c = new Color(178,141,63);
        getRootPane().setBorder(BorderFactory.createLineBorder(c,2));
   //TextFieldEvent();
    }
    
    protected void aktif(){
    idkaryawan.requestFocus();
    }
    
    protected void kosong1(){
    idkaryawan.setText("");
    nama.setText("");
    c1.setText("");
    c3.setText("");
    c4.setText("");
    c5.setText("");
    c6.setText("");
    c2.setText("");
    //gmbr2.setText("");
    pddkn.setSelectedIndex(0);
    kkom.setSelectedIndex(0);
    mtvs.setSelectedIndex(0);
    porg.setSelectedIndex(0);
    exp.setSelectedIndex(0);
    gmbr.setSelectedIndex(0);
    idnilai.setText("");
    cari.setText("");
    datatable();
    }
    
    protected void kosong(){
    idkaryawan.setText("");
    nama.setText("");
    c1.setText("");
    c3.setText("");
    c4.setText("");
    c5.setText("");
    c6.setText("");
    c2.setText("");
    idlow.setText("");
    //gmbr2.setText("");
    pddkn.setSelectedIndex(0);
    kkom.setSelectedIndex(0);
    mtvs.setSelectedIndex(0);
    porg.setSelectedIndex(0);
    exp.setSelectedIndex(0);
    gmbr.setSelectedIndex(0);
    idnilai.setText("");
    cari.setText("");
    datatable();
    }
    
    public void pilihlowongan(){
 popuplowongan pl = new popuplowongan();
 pl.p = this;
 idlow.setText(ilow);
}
    
    public void pilihck(){
 popupcalonkaryawan pck = new popupcalonkaryawan();
 pck.p = this;
 idkaryawan.setText(idk);
 nama.setText(nm);
 pddkn.setSelectedItem(pd);
 porg.setSelectedItem(org);
 if (ex==0){
     setp="0 Tahun";
 }else if (ex==1){
     setp="1 Tahun";
 } else if (ex==2){
     setp="2 Tahun";
 } else if (ex>=3){
     setp=">=3 Tahun";
 }
 exp.setSelectedItem(setp);
}
    
 protected void datatable(){
 Object[] Baris ={"ID Penilaian","NIK","Pendidikan","P. Organisasi","P. Kerja","Kemampuan Komunikasi", "Motivasi Kerja","Tes Menggambar"};
 tabmode = new DefaultTableModel(null, Baris);
 String find=cari.getText();
 try {
 String sql = "SELECT * FROM penilaian where id_nilai like '%"+find+"%' or nik like '%"+find+"%' or n_pddkn like '%"+find+"%' or n_porg like '%"+find+"%' or n_exp like '%"+find+"%' or n_kkom like '%"+find+"%' or n_mtvs like '%"+find+"%' or n_gmbr like '%"+find+"%' order by id_nilai asc";
 java.sql.Statement stat = conn.createStatement();
 ResultSet hasil = stat.executeQuery(sql);
 while (hasil.next()){
 tabmode.addRow(new Object[]{
 hasil.getString(1),
 hasil.getString(2),
 hasil.getString(3),
 hasil.getString(4),
 hasil.getString(5),
 hasil.getString(6),
 hasil.getString(7),
 hasil.getString(8)
 });
 }
 tablenilai.setModel(tabmode);
 } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "Error table nilai: "+e);
 }
}
 
 public void carick(){
     try {
 String sql = "SELECT nm_ck, id_low FROM calonkywn where nik='"+idkaryawan.getText()+"'";
 java.sql.Statement stat = conn.createStatement();
 ResultSet hasil = stat.executeQuery(sql);
 while (hasil.next()){
     nama.setText(hasil.getString("nm_ck"));
     idlow.setText(hasil.getString("id_low"));
 }
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error cari calon karyawan: "+e);
        }
 }

 /*
 public void TextFieldEvent() {
		gmbr.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				warn();
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				warn();
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				warn();
			}
			
			public void warn(){
                                    int f = Integer.parseInt(gmbr.getText());
        if (f<=20) {
        c6.setText("1");
        } else if (f>=21 && f<=40){
        c6.setText("2");    
        } else if (f>=41 && f<=60){
        c6.setText("3");    
        } else if (f>=61 && f<=80){
        c6.setText("4");    
        } else if (f>=81 && f<=100){
        c6.setText("5");    
        }
			}
		});
 } */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nama = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idkaryawan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        idnilai = new javax.swing.JTextField();
        idlow = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        mtvs = new javax.swing.JComboBox<>();
        kkom = new javax.swing.JComboBox<>();
        c1 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pddkn = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        c2 = new javax.swing.JTextField();
        exp = new javax.swing.JComboBox<>();
        porg = new javax.swing.JComboBox<>();
        gmbr = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablenilai = new javax.swing.JTable();
        cari = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(195, 241, 231));
        jPanel1.setMaximumSize(new java.awt.Dimension(894, 740));
        jPanel1.setMinimumSize(new java.awt.Dimension(894, 740));
        jPanel1.setPreferredSize(new java.awt.Dimension(894, 740));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(178, 141, 63));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ben.png"))); // NOI18N
        jLabel1.setText("PENILAIAN CALON KARYAWAN");

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(97, 168, 186));

        jPanel2.setBackground(new java.awt.Color(195, 241, 231));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(178, 141, 63), 2, true));

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(178, 141, 63));
        jLabel12.setText("NIK");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(178, 141, 63));
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(178, 141, 63));
        jLabel3.setText("ID Lowongan");

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(178, 141, 63));
        jLabel9.setText("ID Penilaian");

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/popup.png"))); // NOI18N
        jButton11.setText("Pop-up");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/popup.png"))); // NOI18N
        jButton10.setText("Pop-up");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addComponent(idnilai, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(idlow))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idkaryawan)
                            .addComponent(nama))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addComponent(jButton10))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idlow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(idkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jLabel12.getAccessibleContext().setAccessibleName("");
        jLabel12.getAccessibleContext().setAccessibleDescription("");

        jPanel3.setBackground(new java.awt.Color(195, 241, 231));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(178, 141, 63), 2, true));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(178, 141, 63));
        jLabel7.setText("Pendidikan");

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(178, 141, 63));
        jLabel10.setText("Motivasi Kerja");

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(178, 141, 63));
        jLabel11.setText("Tes Menggambar");

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(178, 141, 63));
        jLabel14.setText("Pengalaman Kerja");

        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(178, 141, 63));
        jLabel15.setText("Kemampuan Komunikasi");

        mtvs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sangat Baik", "Baik", "Cukup", "Buruk", "Sangat Buruk" }));
        mtvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtvsActionPerformed(evt);
            }
        });

        kkom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sangat Baik", "Baik", "Cukup", "Buruk", "Sangat Buruk" }));
        kkom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kkomActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/submit.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil.png"))); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        pddkn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak Ada", "SD", "SMP", "SMA", "SMK", "D3", "S1", "S2" }));
        pddkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pddknActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(178, 141, 63));
        jLabel17.setText("Pengalaman Organisasi");

        exp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 Tahun", "1 Tahun", "2 Tahun", ">=3 Tahun" }));
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        porg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak Ada", "Ada" }));
        porg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porgActionPerformed(evt);
            }
        });

        gmbr.setMaximumRowCount(10);
        gmbr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        gmbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmbrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mtvs, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pddkn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kkom, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(porg, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gmbr, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(c1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(c2)
                                    .addComponent(c4)
                                    .addComponent(c6))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pddkn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(kkom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mtvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gmbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton4)
                        .addComponent(jButton3)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(97, 168, 186));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(178, 141, 63), 2, true), "Cari Penilaian", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tablenilai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablenilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tablenilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablenilaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablenilai);

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/find.png"))); // NOI18N
        jButton8.setText("Find");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButton12.setText("_");
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(124, 124, 124)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "INSERT INTO penilaian values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, idnilai.getText());    
        stat.setString(2, idkaryawan.getText());
        stat.setString(3, pddkn.getSelectedItem().toString());
        stat.setString(4, porg.getSelectedItem().toString());
        stat.setString(5, exp.getSelectedItem().toString());
        stat.setString(6, kkom.getSelectedItem().toString());
        stat.setString(7, mtvs.getSelectedItem().toString());            
            stat.setString(8, gmbr.getSelectedItem().toString());
            stat.setString(9, c1.getText());
            stat.setString(10, c2.getText());
            stat.setString(11, c3.getText());
            stat.setString(12, c4.getText());
            stat.setString(13, c5.getText());
            stat.setString(14, c6.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data penilaian berhasil disave!");
            kosong1();
            idnilai.requestFocus();
        } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error save penilaian: "+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
int ok = JOptionPane.showConfirmDialog(null,"Ingin hapus data penilaian terpilih?","Konfirmasi",JOptionPane.YES_NO_OPTION);
 if (ok==0){
 String sql = "delete from penilaian where id_nilai ='"+idnilai.getText()+"'";
 try{
 PreparedStatement stat = conn.prepareStatement(sql);
 stat.executeUpdate();
 JOptionPane.showMessageDialog(null, "Data penilaian berhasil didelete!");
 kosong();
 idnilai.requestFocus();
 }
 catch (SQLException e){
 JOptionPane.showMessageDialog(null, "Error delete penilaian: "+e);
 }
 }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
 String sql = "update penilaian set nik=?,n_pddkn=?,n_porg=?,n_exp=?,n_kkom=?,n_mtvs=?,n_gmbr=?,c_pddkn=?,c_porg=?,c_exp=?,c_kkom=?,c_mtvs=?,c_gmbr=? where id_nilai='"+idnilai.getText()+"'";
 PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, idkaryawan.getText());
        stat.setString(2, pddkn.getSelectedItem().toString());
        stat.setString(3, porg.getSelectedItem().toString());
        stat.setString(4, exp.getSelectedItem().toString());
        stat.setString(5, kkom.getSelectedItem().toString());
        stat.setString(6, mtvs.getSelectedItem().toString());            
            stat.setString(7, gmbr.getSelectedItem().toString());
            stat.setString(8, c1.getText());
            stat.setString(9, c2.getText());
            stat.setString(10, c3.getText());
            stat.setString(11, c4.getText());
            stat.setString(12, c5.getText());
            stat.setString(13, c6.getText());
 stat.executeUpdate();
 JOptionPane.showMessageDialog(null, "Data penilaian berhasil diedit!");
 kosong();
idnilai.requestFocus();
 }
 catch (SQLException e){
 JOptionPane.showMessageDialog(null, "Error edit penilaian: "+e);
 } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablenilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablenilaiMouseClicked
        // TODO add your handling code here:
        int bar = tablenilai.getSelectedRow();
 String a = tabmode.getValueAt(bar, 0).toString();
 String b = tabmode.getValueAt(bar, 1).toString();
 String c = tabmode.getValueAt(bar, 2).toString();
 String d = tabmode.getValueAt(bar, 3).toString();
 String e = tabmode.getValueAt(bar, 4).toString();
 String f = tabmode.getValueAt(bar, 5).toString();
 String g = tabmode.getValueAt(bar, 6).toString();
 String h = tabmode.getValueAt(bar, 7).toString();
 
    idkaryawan.setText(b);
    pddkn.setSelectedItem(c);
    porg.setSelectedItem(d);
    exp.setSelectedItem(e);
    kkom.setSelectedItem(f);
    mtvs.setSelectedItem(g);
    gmbr.setSelectedItem(h);
    idnilai.setText(a);
    carick();
    }//GEN-LAST:event_tablenilaiMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        datatable();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new dashboard().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void pddknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pddknActionPerformed
        // TODO add your handling code here:
         if (pddkn.getSelectedItem().equals("Tidak Ada")) {
        c1.setText("1");
        } else if (pddkn.getSelectedItem().equals("SD")) {
        c1.setText("2");
        } else if (pddkn.getSelectedItem().equals("SMP")){
        c1.setText("3");    
        } else if (pddkn.getSelectedItem().equals("SMA") || pddkn.getSelectedItem().equals("SMK")){
        c1.setText("4");    
        } else if (pddkn.getSelectedItem().equals("D3")|| pddkn.getSelectedItem().equals("S1")|| pddkn.getSelectedItem().equals("S2") ){
        c1.setText("5");
        }
    }//GEN-LAST:event_pddknActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        ilo=idlow.getText();
        System.out.println(ilo);
        popupcalonkaryawan pck = new popupcalonkaryawan();
        pck.p = this;
        pck.ilow=ilo;
        pck.setVisible(true);
        pck.setResizable(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        popuplowongan pl = new popuplowongan();
        pl.p = this;
        pl.id="nilai";
        pl.setVisible(true);
        pl.setResizable(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        datatable();
    }//GEN-LAST:event_cariActionPerformed

    private void mtvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtvsActionPerformed
        // TODO add your handling code here:
        if (mtvs.getSelectedItem().equals("Sangat Baik")) {
        c5.setText("5");
        } else if (mtvs.getSelectedItem().equals("Baik")){
        c5.setText("4");    
        } else if (mtvs.getSelectedItem().equals("Cukup")){
        c5.setText("3");    
        } else if (mtvs.getSelectedItem().equals("Buruk")){
        c5.setText("2");    
        } else if (mtvs.getSelectedItem().equals("Sangat Buruk")){
        c5.setText("1");    
        } 
    }//GEN-LAST:event_mtvsActionPerformed

    private void kkomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kkomActionPerformed
        // TODO add your handling code here:
        if (kkom.getSelectedItem().equals("Sangat Baik")) {
        c4.setText("5");
        } else if (kkom.getSelectedItem().equals("Baik")){
        c4.setText("4");    
        } else if (kkom.getSelectedItem().equals("Cukup")){
        c4.setText("3");    
        } else if (kkom.getSelectedItem().equals("Buruk")){
        c4.setText("2");    
        } else if (kkom.getSelectedItem().equals("Sangat Buruk")){
        c4.setText("1");    
        } 
    }//GEN-LAST:event_kkomActionPerformed

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        // TODO add your handling code here:
        if (exp.getSelectedItem().equals("0 Tahun")) {
        c3.setText("1");
        } else if (exp.getSelectedItem().equals("1 Tahun")){
        c3.setText("2");    
        } else if (exp.getSelectedItem().equals("2 Tahun")){
        c3.setText("3");    
        } else if (exp.getSelectedItem().equals(">=3 Tahun")){
        c3.setText("4");    
        }
    }//GEN-LAST:event_expActionPerformed

    private void porgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porgActionPerformed
        // TODO add your handling code here:
                if (porg.getSelectedItem().equals("Ada")) {
        c2.setText("2");
        } else if (porg.getSelectedItem().equals("Tidak Ada")){
        c2.setText("1");
        }
    }//GEN-LAST:event_porgActionPerformed

    private void gmbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmbrActionPerformed
        // TODO add your handling code here:
        int v = Integer.parseInt((String)gmbr.getSelectedItem());
        if (v<=20) {
        c6.setText("1");
        } else if (v>=21 && v<=40){
        c6.setText("2");    
        } else if (v>=41 && v<=60){
        c6.setText("3");    
        } else if (v>=61 && v<=80){
        c6.setText("4");    
        } else if (v>=81 && v<=100){
        c6.setText("5");    
        }
        /*
                int f = Integer.parseInt(gmbr2.getText());
        if (f<=20) {
        c6.setText("1");
        } else if (f>=21 && f<=40){
        c6.setText("2");    
        } else if (f>=41 && f<=60){
        c6.setText("3");    
        } else if (f>=61 && f<=80){
        c6.setText("4");    
        } else if (f>=81 && f<=100){
        c6.setText("5");    
        } */
    }//GEN-LAST:event_gmbrActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        setState(this.ICONIFIED);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        setLocation(evt.getXOnScreen() -x, evt.getYOnScreen() -y);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penilaian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> exp;
    private javax.swing.JComboBox<String> gmbr;
    private javax.swing.JTextField idkaryawan;
    private javax.swing.JTextField idlow;
    private javax.swing.JTextField idnilai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kkom;
    private javax.swing.JComboBox<String> mtvs;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> pddkn;
    private javax.swing.JComboBox<String> porg;
    private javax.swing.JTable tablenilai;
    // End of variables declaration//GEN-END:variables
}
