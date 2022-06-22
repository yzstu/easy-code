package cn.yzstu.configchecker.util;

import com.intellij.notification.*;

/**
 * @author Baldwin
 * @mail admin@yzstu.cn
 * @blog blog.yzstu.cn
 * @since 2022/6/22 22:31
 */
public class NotificationUtil {

    // 获取通知组管理器
    private static NotificationGroupManager manager = NotificationGroupManager.getInstance();

    // 获取注册的通知组
    private static NotificationGroup balloon = manager.getNotificationGroup("audio.notify");

    public static void info(String msg) {
        Notification notification = balloon.createNotification(msg, NotificationType.INFORMATION);
        Notifications.Bus.notify(notification);
    }

    public static void warning(String msg) {
        Notification notification = balloon.createNotification(msg, NotificationType.WARNING);
        Notifications.Bus.notify(notification);
    }

    public static void error(String msg) {
        Notification notification = balloon.createNotification(msg, NotificationType.ERROR);
        Notifications.Bus.notify(notification);
    }
}
