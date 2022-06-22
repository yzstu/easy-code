package cn.yzstu.configchecker.factory;

import cn.yzstu.configchecker.ui.IACConfigCheckerSettingForm;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Baldwin
 */
public class SettingFactory implements SearchableConfigurable {
    @Override
    public @NotNull @NonNls String getId() {
        return "audio.tools.iacChecker";
    }

    @Override
    public @NlsContexts.ConfigurableName String getDisplayName() {
        return "IAC Checker";
    }

    @Override
    public @Nullable JComponent createComponent() {
        return new IACConfigCheckerSettingForm().getDialogPane();
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public void apply() throws ConfigurationException {

    }
}
