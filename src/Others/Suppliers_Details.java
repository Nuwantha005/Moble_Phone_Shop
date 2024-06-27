/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others;

import MyConn.MyConn;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samsung Pc
 */
public class Suppliers_Details extends javax.swing.JPanel {

    /**
     * Creates new form Categories
     */
    public Suppliers_Details() {
        initComponents();
        try {
            int id = 0;
            ResultSet getID = MyConn.search("select supplier_id from supplies_details order by supplier_id desc limit 1");
            while (getID.next()) {
                id = getID.getInt(1);
            }
            id++;
            supplier_ID.setText(id + "");
            items_Combobox.removeAllItems();
            ResultSet get_Item_Name = MyConn.search("select item_name from items");
            while (get_Item_Name.next()) {                
                items_Combobox.addItem(get_Item_Name.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        new_Category = new javax.swing.JPanel();
        supplier_ID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        supplier_Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplier_Address = new javax.swing.JTextArea();
        add_New_Supplier = new javax.swing.JButton();
        update_Supplier = new javax.swing.JButton();
        is_Active = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        supplier_Telephone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        supplier_email_address = new javax.swing.JTextField();
        Clear_All = new javax.swing.JButton();
        new_Category1 = new javax.swing.JPanel();
        search_Bar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        search_Suppliers = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        items_Combobox = new javax.swing.JComboBox<>();
        set_this_item_as_supplying_Item = new javax.swing.JButton();
        update_this_item_as_supplying_item = new javax.swing.JButton();
        search_Supplyind_Items = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        supplying_Items_Liast = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));

        new_Category.setBackground(new java.awt.Color(255, 255, 255));
        new_Category.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Supplier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        supplier_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supplier_ID.setEnabled(false);
        supplier_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplier_IDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Supplier ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(":");

        supplier_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(":");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Supplier Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(":");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        supplier_Address.setColumns(20);
        supplier_Address.setRows(5);
        jScrollPane1.setViewportView(supplier_Address);

        add_New_Supplier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_New_Supplier.setText("Add Supplier");
        add_New_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_New_SupplierActionPerformed(evt);
            }
        });

        update_Supplier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_Supplier.setText("Update Supplier");

        is_Active.setBackground(new java.awt.Color(255, 255, 255));
        is_Active.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        is_Active.setText("Active");
        is_Active.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                is_ActiveActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Telephone");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(":");

        supplier_Telephone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("E - Mail");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(":");

        supplier_email_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Clear_All.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Clear_All.setText("Clear All");
        Clear_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_AllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout new_CategoryLayout = new javax.swing.GroupLayout(new_Category);
        new_Category.setLayout(new_CategoryLayout);
        new_CategoryLayout.setHorizontalGroup(
            new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new_CategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new_CategoryLayout.createSequentialGroup()
                        .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(new_CategoryLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supplier_ID))
                            .addGroup(new_CategoryLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supplier_Name))
                            .addGroup(new_CategoryLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supplier_Telephone))
                            .addGroup(new_CategoryLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supplier_email_address))))
                    .addGroup(new_CategoryLayout.createSequentialGroup()
                        .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(is_Active, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(new_CategoryLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(new_CategoryLayout.createSequentialGroup()
                                .addComponent(Clear_All, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add_New_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        new_CategoryLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel4, jLabel5});

        new_CategoryLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add_New_Supplier, update_Supplier});

        new_CategoryLayout.setVerticalGroup(
            new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new_CategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplier_ID)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplier_Name)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplier_Telephone)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplier_email_address)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(new_CategoryLayout.createSequentialGroup()
                        .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, new_CategoryLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add_New_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(new_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(is_Active, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Clear_All, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        new_CategoryLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel11, jLabel12, jLabel3, jLabel4, jLabel5, jLabel9, supplier_Name, supplier_Telephone, supplier_email_address});

        new_CategoryLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add_New_Supplier, update_Supplier});

        new_Category1.setBackground(new java.awt.Color(255, 255, 255));
        new_Category1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Search Suppliers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        search_Bar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        search_Bar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_BarKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Supplier Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(":");

        search_Suppliers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        search_Suppliers.setText("Search Suppliers");
        search_Suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_SuppliersActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Name", "Telephone", "E - Mail", "Address", "Is Active"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout new_Category1Layout = new javax.swing.GroupLayout(new_Category1);
        new_Category1.setLayout(new_Category1Layout);
        new_Category1Layout.setHorizontalGroup(
            new_Category1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new_Category1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new_Category1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(new_Category1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_Bar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        new_Category1Layout.setVerticalGroup(
            new_Category1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(new_Category1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(new_Category1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(new_Category1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search_Bar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(search_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Supplying Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        items_Combobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        set_this_item_as_supplying_Item.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        set_this_item_as_supplying_Item.setText("Set Item");

        update_this_item_as_supplying_item.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_this_item_as_supplying_item.setText("Delete");

        search_Supplyind_Items.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        search_Supplyind_Items.setText("Search");

        supplying_Items_Liast.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(supplying_Items_Liast);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(items_Combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(set_this_item_as_supplying_Item, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_this_item_as_supplying_item, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_Supplyind_Items, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(items_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(set_this_item_as_supplying_Item, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(update_this_item_as_supplying_item, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(search_Supplyind_Items, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(new_Category1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(new_Category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(new_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(new_Category1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void is_ActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_is_ActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_is_ActiveActionPerformed

    private void Clear_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_AllActionPerformed
        // TODO add your handling code here:
        supplier_ID.setText(null);
        supplier_Name.setText(null);
        search_Bar.setText(null);
        supplier_Telephone.setText(null);
        supplier_Address.setText(null);
        supplier_email_address.setText(null);
        is_Active.setSelected(true);
        try {
            int id = 0;
            ResultSet getID = MyConn.search("select supplier_id from supplies_details order by supplier_id desc limit 1");
            while (getID.next()) {
                id = getID.getInt(1);
            }
            id++;
            supplier_ID.setText(id + "");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Clear_AllActionPerformed

    private void supplier_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplier_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplier_IDActionPerformed

    private void add_New_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_New_SupplierActionPerformed
        try {
            String isActive = "";
            if (is_Active.isSelected()) {
                isActive = "1";
            } else {
                isActive = "2";
            }
            MyConn.save("INSERT INTO `mobile_phone_shop`.`supplies_details` (`Supplier_ID`, `Supplier_Name`, `Supplier_Telephone_No`, `Supplier_E_Mail`, `Supplier_Address`, `Supplier_Is_Active`) "
                    + "VALUES ('" + supplier_ID.getText() + "', '" + supplier_Name.getText() + "', '" + supplier_Telephone.getText() + "', '" + supplier_email_address.getText() + "', '" + supplier_Address.getText() + "', '" + isActive + "');");
            JOptionPane.showMessageDialog(this, "Completed", "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_add_New_SupplierActionPerformed

    private void search_SuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_SuppliersActionPerformed
        try {
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            int rowCount = df.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                df.removeRow(0);
            }
            ResultSet rs = MyConn.search("select * from supplies_details");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                if (rs.getBoolean(6)) {
                    v.add("Active");
                } else {
                    v.add("Inactive");
                }
                df.addRow(v);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_search_SuppliersActionPerformed

    private void search_BarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_BarKeyReleased
        try {
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            int rowCount = df.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                df.removeRow(0);
            }
            ResultSet rs = MyConn.search("select * from supplies_details where supplier_name like '"+search_Bar.getText()+"%' ");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                if (rs.getBoolean(6)) {
                    v.add("Active");
                } else {
                    v.add("Inactive");
                }
                df.addRow(v);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_search_BarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear_All;
    private javax.swing.JButton add_New_Supplier;
    private javax.swing.JCheckBox is_Active;
    private javax.swing.JComboBox<String> items_Combobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel new_Category;
    private javax.swing.JPanel new_Category1;
    private javax.swing.JTextField search_Bar;
    private javax.swing.JButton search_Suppliers;
    private javax.swing.JButton search_Supplyind_Items;
    private javax.swing.JButton set_this_item_as_supplying_Item;
    private javax.swing.JTextArea supplier_Address;
    private javax.swing.JTextField supplier_ID;
    private javax.swing.JTextField supplier_Name;
    private javax.swing.JTextField supplier_Telephone;
    private javax.swing.JTextField supplier_email_address;
    private javax.swing.JList<String> supplying_Items_Liast;
    private javax.swing.JButton update_Supplier;
    private javax.swing.JButton update_this_item_as_supplying_item;
    // End of variables declaration//GEN-END:variables

}
