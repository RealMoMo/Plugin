package widget;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;


/**
 * DialogWrapper
 * http://www.jetbrains.org/intellij/sdk/docs/user_interface_components/dialog_wrapper.html
 */
public class MyDialogWrapper extends DialogWrapper {

    public MyDialogWrapper() {
       super(true);
       init();
       setTitle("RealMo DialogWrapper");
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Test");
        label.setPreferredSize(new Dimension(200,100));
        dialogPanel.add(label,BorderLayout.CENTER);

        return dialogPanel;
    }
}
