
package inventoryms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ayham
 */
public class FRM_Order extends javax.swing.JFrame {


    public FRM_Order() {
        initComponents();
        SelectProd();
        SelectCust();
        GetTodat();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ordid_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Qutiy = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_Addo = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        Btn_Addtoor = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Prod_list = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Cust_list = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        CustNamelb = new javax.swing.JLabel();
        Datelb = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bill_list = new javax.swing.JTable();
        Amountlb = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_print = new javax.swing.JButton();
        Amountlb1 = new javax.swing.JLabel();
        Amountlb2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory Management System");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Orders");

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("_");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("X");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(394, 394, 394)
                        .addComponent(jButton6)
                        .addGap(0, 0, 0)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(567, 567, 567))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("Manage Order");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Order ID");

        ordid_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Date");

        Qutiy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Quantity");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Customer Name");

        btn_Addo.setBackground(new java.awt.Color(204, 0, 0));
        btn_Addo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_Addo.setForeground(new java.awt.Color(255, 255, 255));
        btn_Addo.setText("Add Order");
        btn_Addo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AddoMouseClicked(evt);
            }
        });

        btn_Edit.setBackground(new java.awt.Color(204, 0, 0));
        btn_Edit.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_Edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Edit.setText("View Orders");
        btn_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EditMouseClicked(evt);
            }
        });

        Btn_Addtoor.setBackground(new java.awt.Color(204, 0, 0));
        Btn_Addtoor.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Btn_Addtoor.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Addtoor.setText("Add To Order");
        Btn_Addtoor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_AddtoorMouseClicked(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 0, 0));
        jButton9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Home");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        Prod_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Prod_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product id", "Name", "Quantity", "Category", "Descreption"
            }
        ));
        Prod_list.setGridColor(new java.awt.Color(255, 255, 255));
        Prod_list.setRowHeight(25);
        Prod_list.setSelectionBackground(new java.awt.Color(204, 0, 0));
        Prod_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Prod_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Prod_list);

        jLabel10.setBackground(new java.awt.Color(204, 0, 0));
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Product List");

        Cust_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cust_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer id", "Name", "Phone", "Adres"
            }
        ));
        Cust_list.setGridColor(new java.awt.Color(255, 255, 255));
        Cust_list.setRowHeight(25);
        Cust_list.setSelectionBackground(new java.awt.Color(204, 0, 0));
        Cust_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cust_listMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Cust_list);

        jLabel11.setBackground(new java.awt.Color(204, 0, 0));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Customer List");

        CustNamelb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CustNamelb.setForeground(new java.awt.Color(204, 0, 0));
        CustNamelb.setText("Customer Name");

        Datelb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Datelb.setForeground(new java.awt.Color(204, 0, 0));
        Datelb.setText("Date");

        bill_list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bill_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Product", "Quantity", "Uprice", "Total"
            }
        ));
        bill_list.setGridColor(new java.awt.Color(255, 255, 255));
        bill_list.setRowHeight(25);
        bill_list.setSelectionBackground(new java.awt.Color(204, 0, 0));
        bill_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bill_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bill_list);

        Amountlb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Amountlb.setForeground(new java.awt.Color(204, 0, 0));
        Amountlb.setText("Amount");

        txt_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Price");

        btn_print.setBackground(new java.awt.Color(204, 0, 0));
        btn_print.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_print.setForeground(new java.awt.Color(255, 255, 255));
        btn_print.setText("Print");
        btn_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_printMouseClicked(evt);
            }
        });

        Amountlb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Amountlb1.setForeground(new java.awt.Color(204, 0, 0));
        Amountlb1.setText("RS");

        Amountlb2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Amountlb2.setForeground(new java.awt.Color(204, 0, 0));
        Amountlb2.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(311, 311, 311))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(121, 121, 121)
                                    .addComponent(Datelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel8))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CustNamelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ordid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btn_Addo)
                                .addGap(28, 28, 28)
                                .addComponent(btn_Edit))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Qutiy, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Addtoor)
                        .addGap(27, 27, 27))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Amountlb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Amountlb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Amountlb2)
                        .addGap(152, 152, 152)
                        .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Btn_Addtoor)
                            .addComponent(Qutiy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Amountlb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_print)
                            .addComponent(Amountlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Amountlb2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ordid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustNamelb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Datelb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Addo)
                            .addComponent(btn_Edit))
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(21, 21, 21))))
        );

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectProd()
    {
       try
       {
          Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Inventorydb","Ayham","12345");
          St = Con.createStatement();
          Rs = St.executeQuery("select * from TB_Product");
          Prod_list.setModel(DbUtils.resultSetToTableModel(Rs));
       }
       catch(SQLException e)
       {
          e.printStackTrace();
       }
    }
    
    public void SelectCust()
    {
       try
       {
          Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Inventorydb","Ayham","12345");
          St = Con.createStatement();
          Rs = St.executeQuery("select * from TB_Customer");
          Cust_list.setModel(DbUtils.resultSetToTableModel(Rs));
       }
       catch(SQLException e)
       {
          e.printStackTrace();
       }
    }
    
    private void GetTodat(){
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd");
      LocalDateTime now = LocalDateTime.now();
      Datelb.setText(dtf.format(now));
    }
    
    private void Update()
    {
        int newqty = oidqty - Integer.valueOf(Qutiy.getText());
         try
           {
              Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Inventorydb","Ayham","12345");
              String UpdateQuery = "Update Ayham.TB_PRODUCT Set QUANTITY ="+newqty+""+" Where PRODID ="+productid;
              Statement Add = Con.createStatement();
              Add.executeUpdate(UpdateQuery);
              //JOptionPane.showMessageDialog(this,"Category Updated Successfully");
              SelectProd();
           }
           catch(Exception e)
           {
               e.printStackTrace();   
           }
    }
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        this.setState(FRM_Product.ICONIFIED);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton5MouseClicked

    private void btn_AddoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddoMouseClicked
        if (ordid_txt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter The ID For Order Please");
        }
        else
        {
            try
            {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Inventorydb","Ayham","12345");
                PreparedStatement add = Con.prepareStatement("insert into TB_Order values(?,?,?,?)");
                add.setInt(1, Integer.valueOf(ordid_txt.getText()));
                add.setString(2,CustNamelb.getText());
                add.setString(3,Datelb.getText());
                add.setInt(4,Integer.valueOf(Amountlb.getText()));    
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Order Successfully Added");
                Con.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_AddoMouseClicked

    private void btn_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditMouseClicked
        new FRM_ShowOrders().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_EditMouseClicked

    int i = 1,Uprice,tot = 0,total;
    String prodname;
    private void Btn_AddtoorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_AddtoorMouseClicked
        if(flag == 0 || Qutiy.getText().isEmpty() || txt_price.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Select Product and Enter Qty");
        }
        else
        {
           Uprice = Integer.valueOf(txt_price.getText());
           tot = Uprice * Integer.valueOf(Qutiy.getText()); 
           Vector v = new Vector();
           v.add(i);
           v.add(prodname);
           v.add(Qutiy.getText());
           v.add(Uprice);
           v.add(tot);
           DefaultTableModel dt = (DefaultTableModel)bill_list.getModel();
           dt.addRow(v);
           total = total + tot;
           Amountlb.setText(""+total+"");
           Update();
           i++;
        }       
    }//GEN-LAST:event_Btn_AddtoorMouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        new FRM_Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9MouseClicked

    int flag = 0,productid,oidqty;
    private void Prod_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Prod_listMouseClicked
        DefaultTableModel model = (DefaultTableModel)Prod_list.getModel();
        int Myindex = Prod_list.getSelectedRow();
        productid = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        prodname = model.getValueAt(Myindex, 1).toString();
        oidqty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        //descr_txt.setText(model.getValueAt(Myindex, 4).toString());
        flag = 1;
    }//GEN-LAST:event_Prod_listMouseClicked

    private void Cust_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cust_listMouseClicked
        DefaultTableModel model = (DefaultTableModel)Cust_list.getModel();
        int Myindex = Cust_list.getSelectedRow();
        //txt_Cid.setText(model.getValueAt(Myindex, 0).toString());
        CustNamelb.setText(model.getValueAt(Myindex, 1).toString());
       // txt_Cphone.setText(model.getValueAt(Myindex, 2).toString());
        //txt_Cadres.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_Cust_listMouseClicked

    private void bill_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_listMouseClicked
        
    }//GEN-LAST:event_bill_listMouseClicked

    private void btn_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_printMouseClicked
       try{
          bill_list.print(); 
       }
       catch(Exception exp)
       {
          exp.printStackTrace();
       } 
    }//GEN-LAST:event_btn_printMouseClicked

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
            java.util.logging.Logger.getLogger(FRM_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amountlb;
    private javax.swing.JLabel Amountlb1;
    private javax.swing.JLabel Amountlb2;
    private javax.swing.JButton Btn_Addtoor;
    private javax.swing.JLabel CustNamelb;
    private javax.swing.JTable Cust_list;
    private javax.swing.JLabel Datelb;
    private javax.swing.JTable Prod_list;
    private javax.swing.JTextField Qutiy;
    private javax.swing.JTable bill_list;
    private javax.swing.JButton btn_Addo;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField ordid_txt;
    private javax.swing.JTextField txt_price;
    // End of variables declaration//GEN-END:variables
}
