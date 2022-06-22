package cn.yzstu.configchecker.ui;

import cn.yzstu.configchecker.factory.SettingKey;
import cn.yzstu.configchecker.util.ConfigUtil;
import cn.yzstu.configchecker.util.NotificationUtil;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
/*
 * Created by JFormDesigner on Thu Jun 16 23:17:23 CST 2022
 */


/**
 * @author unknown
 */
public class IACConfigCheckerSettingForm extends JFrame {
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel text_model_path;
    private JTextField input_model_patl;
    private JLabel text_config_path;
    private JTextField input_config_path;
    private JLabel text_env_config;
    private JTextField input_env_config;
    private JLabel text_enc_path;
    private JTextField input_enc_path;
    private JLabel text_notify;
    private JPanel operate;
    private JButton okButton;
    private JButton cancelButton;

    public IACConfigCheckerSettingForm() {
        initComponents();
    }

    public JPanel getDialogPane() {
        return dialogPane;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        text_model_path = new JLabel();
        input_model_patl = new JTextField();
        text_config_path = new JLabel();
        input_config_path = new JTextField();
        text_env_config = new JLabel();
        input_env_config = new JTextField();
        text_enc_path = new JLabel();
        input_enc_path = new JTextField();
        text_notify = new JLabel();
        operate = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(
                    new CompoundBorder(
                            new TitledBorder(
                                    new EmptyBorder(0, 0, 0, 0),
                                    "JF\u006frmDes\u0069gner \u0045valua\u0074ion",
                                    TitledBorder.CENTER, TitledBorder.BOTTOM,
                                    new Font("D\u0069alog", Font.BOLD, 12), Color.red),
                            dialogPane.getBorder()));
            dialogPane.addPropertyChangeListener(e -> {
                if ("\u0062order".equals(e.getPropertyName())) {
                    //throw new RuntimeException();
                }
            });
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                        "fillx,insets dialog,hidemode 3,align center center",
                        "[fill]" +
                                "[241,fill]",
                        "[]" +
                                "[]" +
                                "[]" +
                                "[]0" +
                                "[]0" +
                                "[]0" +
                                "[]0"));

                //---- text_model_path ----
                text_model_path.setText("\u914d\u7f6e\u6a21\u7248\u8def\u5f84");
                contentPanel.add(text_model_path, "cell 0 0");
                contentPanel.add(input_model_patl, "cell 1 0");

                //---- text_config_path ----
                text_config_path.setText("\u914d\u7f6e\u6587\u4ef6\u8def\u5f84");
                contentPanel.add(text_config_path, "cell 0 1");
                contentPanel.add(input_config_path, "cell 1 1");

                //---- text_env_config ----
                text_env_config.setText("\u5404\u73af\u5883\u914d\u7f6e\u8def\u5f84");
                contentPanel.add(text_env_config, "cell 0 2");
                contentPanel.add(input_env_config, "cell 1 2");

                //---- text_enc_path ----
                text_enc_path.setText("\u52a0\u5bc6\u914d\u7f6e\u9879\u6b63\u5219\u5339\u914d");
                contentPanel.add(text_enc_path, "cell 0 3");
                contentPanel.add(input_enc_path, "cell 1 3");

                //---- text_notify ----
                text_notify.setText("\u591a\u4e2a\u8def\u5f84\u4f7f\u7528';'\u9694\u5f00");
                contentPanel.add(text_notify, "cell 0 5 2 1,alignx center,growx 0");

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
                    okButton.addActionListener(e -> {
                        String text = input_config_path.getText();
                        ConfigUtil.save(SettingKey.SETTING_CONFIG_KEY, text);
                        NotificationUtil.info(text);
                    });
                    //---- cancelButton ----
                    cancelButton.setText("Cancel");
                    operate.add(cancelButton, "cell 1 0,alignx center,growx 0");
                }
                contentPanel.add(operate, "cell 0 6 2 1");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
    }
}
