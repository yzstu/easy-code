package cn.yzstu.configchecker.action;

import cn.yzstu.configchecker.factory.SettingFactory;
import cn.yzstu.configchecker.ui.IACConfigCheckerSettingForm;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.options.ShowSettingsUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiFile;

/**
 * @author Baldwin
 * @mail admin@yzstu.cn
 * @blog blog.yzstu.cn
 * @since 2022/6/16 22:39
 */
public class IACConfigSettingAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        //获取当前在操作的工程上下文
        Project project = e.getData(PlatformDataKeys.PROJECT);
        String title = "Hello World!";
        ShowSettingsUtil.getInstance().editConfigurable(project, new SettingFactory());
        //显示对话框
        Messages.showMessageDialog(project, "", title, Messages.getInformationIcon());
    }
}
