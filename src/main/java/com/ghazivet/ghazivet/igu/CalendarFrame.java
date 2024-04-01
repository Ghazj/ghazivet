package com.ghazivet.ghazivet.igu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CalendarFrame extends javax.swing.JFrame {

    private JLabel monthLabel;
    private JPanel calendarPanel;
    private Calendar currentCalendar;
    
     public CalendarFrame() {
        setTitle("Calendario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar en la pantalla

        // Inicializa el calendario con la fecha actual
        currentCalendar = Calendar.getInstance();

        // Crea el panel para mostrar el mes actual
        monthLabel = new JLabel();
        updateMonthLabel();

        // Crea el panel para el calendario
        calendarPanel = new JPanel(new GridLayout(7, 7));

        // Crea los botones para los días de la semana
        String[] daysOfWeek = {"Dom", "Lun", "Mar", "Mie", "Jue", "Vie", "Sab"};
        for (String day : daysOfWeek) {
            calendarPanel.add(new JLabel(day, SwingConstants.CENTER));
        }

        // Rellena el calendario con los días del mes actual
        updateCalendar();

        // Agrega los componentes al JFrame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(monthLabel, BorderLayout.NORTH);
        getContentPane().add(calendarPanel, BorderLayout.CENTER);
    }
     
    private void updateMonthLabel() {
        int month = currentCalendar.get(Calendar.MONTH) + 1;
        int year = currentCalendar.get(Calendar.YEAR);
        monthLabel.setText(String.format("%s %d", getMonthName(month), year));
    }
    
    private void updateCalendar() {
        calendarPanel.removeAll();

        // Añade espacios en blanco para los días antes del primer día del mes
        Calendar tempCalendar = (Calendar) currentCalendar.clone();
        tempCalendar.set(Calendar.DAY_OF_MONTH, 1);
        int firstDayOfWeek = tempCalendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < firstDayOfWeek; i++) {
            calendarPanel.add(new JLabel(""));
        }

        // Añade los botones para los días del mes
        int lastDayOfMonth = currentCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int day = 1; day <= lastDayOfMonth; day++) {
            JButton button = new JButton(String.valueOf(day));
            calendarPanel.add(button);

            // Agrega un ActionListener para manejar eventos cuando se hace clic en un día
            int finalDay = day;
            button.addActionListener(e -> JOptionPane.showMessageDialog(this, "Se hizo clic en el día " + finalDay));
        }

        revalidate();
        repaint();
    }

    private String getMonthName(int month) {
        String[] monthNames = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                               "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return monthNames[month - 1];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(CalendarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
