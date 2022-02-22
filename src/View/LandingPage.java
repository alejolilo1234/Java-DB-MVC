package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class LandingPage extends JFrame{
    private JPanel panel;
    private JButton button1;
    private JTable table1;

    public LandingPage() {
        String[] columnNames = {"First Name", "Last Name"};
        Object[][] data = {{"Kathy", "Smith"},{"John", "Doe"}};
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("id");
        dtm.addColumn("name");
        dtm.addRow(columnNames);

        table1.setModel(dtm);

        table1.setFillsViewportHeight(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setTitle("Hola mundo");
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.setResizable(false);
    }
}
