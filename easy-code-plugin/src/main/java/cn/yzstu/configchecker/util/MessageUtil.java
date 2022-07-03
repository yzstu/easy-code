package cn.yzstu.configchecker.util;

import com.intellij.openapi.ui.Messages;

import javax.swing.*;

/**
 * @author Baldwin
 * @mail admin@yzstu.cn
 * @blog blog.yzstu.cn
 * @since 2022/7/3 22:28
 */
public class MessageUtil {
    public static void warn(String msg, String title) {
        Messages.showMessageDialog(msg, title, Messages.getWarningIcon());
    }

    public static void error(String msg, String title) {
        Messages.showMessageDialog(msg, title, Messages.getErrorIcon());
    }
}
