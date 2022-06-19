import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Thu Jun 16 23:17:23 CST 2022
 */



/**
 * @author unknown
 */
public class IACConfigCheckerSettingForm extends JFrame {
    public IACConfigCheckerSettingForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        text_model_path = new JLabel();
        input_model_patl = new JTextField();
        text_config_path = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        textField4 = new JTextField();
        label3 = new JLabel();
        operate = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
            public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                    "fillx,insets dialog,hidemode 3,align center center",
                    // columns
                    "[fill]" +
                    "[241,fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]0" +
                    "[]0" +
                    "[]0" +
                    "[]" +
                    "[]0" +
                    "[]0" +
                    "[]0" +
                    "[]"));

                //---- text_model_path ----
                text_model_path.setText("\u914d\u7f6e\u6a21\u7248\u8def\u5f84");
                contentPanel.add(text_model_path, "cell 0 0");
                contentPanel.add(input_model_patl, "cell 1 0");

                //---- text_config_path ----
                text_config_path.setText("\u914d\u7f6e\u6587\u4ef6\u8def\u5f84");
                contentPanel.add(text_config_path, "cell 0 1");
                contentPanel.add(textField2, "cell 1 1");

                //---- label4 ----
                label4.setText("\u5404\u73af\u5883\u914d\u7f6e\u8def\u5f84");
                contentPanel.add(label4, "cell 0 2");
                contentPanel.add(textField3, "cell 1 2");

                //---- label5 ----
                label5.setText("\u52a0\u5bc6\u914d\u7f6e\u9879\u6b63\u5219\u5339\u914d");
                contentPanel.add(label5, "cell 0 3");
                contentPanel.add(textField4, "cell 1 3");

                //---- label3 ----
                label3.setText("\u591a\u4e2a\u8def\u5f84\u4f7f\u7528';'\u9694\u5f00");
                contentPanel.add(label3, "cell 0 5 2 1,alignx center,growx 0");

                //======== operate ========
                {
                    operate.setLayout(new MigLayout(
                        "insets dialog,alignx right",
                        // columns
                        "[fill]" +
                        "[center]",
                        // rows
                        null));

                    //---- okButton ----
                    okButton.setText("OK");
                    operate.add(okButton, "cell 0 0,alignx center,growx 0");

                    //---- cancelButton ----
                    cancelButton.setText("Cancel");
                    operate.add(cancelButton, "cell 1 0,alignx center,growx 0");
                }
                contentPanel.add(operate, "cell 0 8 2 1");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel text_model_path;
    private JTextField input_model_patl;
    private JLabel text_config_path;
    private JTextField textField2;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private JTextField textField4;
    private JLabel label3;
    private JPanel operate;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
