package widget;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.popup.*;
import com.intellij.openapi.util.Condition;
import com.intellij.ui.awt.RelativePoint;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.util.List;

/**
 * Popups
 * http://www.jetbrains.org/intellij/sdk/docs/user_interface_components/popups.html
 */
public class MyPopups extends JBPopupFactory {

    //
    @NotNull
    @Override
    public <T> IPopupChooserBuilder<T> createPopupChooserBuilder(@NotNull List<? extends T> list) {
        return null;
    }

    @NotNull
    @Override
    public ListPopup createConfirmation(String s, Runnable runnable, int i) {
        return null;
    }

    @NotNull
    @Override
    public ListPopup createConfirmation(String s, String s1, String s2, Runnable runnable, int i) {
        return null;
    }

    @NotNull
    @Override
    public ListPopup createConfirmation(String s, String s1, String s2, Runnable runnable, Runnable runnable1, int i) {
        return null;
    }

    @NotNull
    @Override
    public ListPopupStep createActionsStep(@NotNull ActionGroup actionGroup, @NotNull DataContext dataContext, @Nullable String s, boolean b, boolean b1, String s1, Component component, boolean b2, int i, boolean b3) {
        return null;
    }

    @NotNull
    @Override
    public RelativePoint guessBestPopupLocation(@NotNull JComponent jComponent) {
        return null;
    }

    @NotNull
    @Override
    public ListPopup createActionGroupPopup(@Nls(capitalization = Nls.Capitalization.Title) String s, @NotNull ActionGroup actionGroup, @NotNull DataContext dataContext, boolean b, boolean b1, boolean b2, @Nullable Runnable runnable, int i, @Nullable Condition<? super AnAction> condition) {
        return null;
    }

    @NotNull
    @Override
    public ListPopup createActionGroupPopup(@Nls(capitalization = Nls.Capitalization.Title) String s, @NotNull ActionGroup actionGroup, @NotNull DataContext dataContext, ActionSelectionAid actionSelectionAid, boolean b, @Nullable Runnable runnable, int i, @Nullable Condition<? super AnAction> condition, @Nullable String s1) {
        return null;
    }

    @NotNull
    @Override
    public ListPopup createListPopup(@NotNull ListPopupStep listPopupStep) {
        return null;
    }

    @NotNull
    @Override
    public ListPopup createListPopup(@NotNull ListPopupStep listPopupStep, int i) {
        return null;
    }

    @NotNull
    @Override
    public TreePopup createTree(JBPopup jbPopup, @NotNull TreePopupStep treePopupStep, Object o) {
        return null;
    }

    @NotNull
    @Override
    public TreePopup createTree(@NotNull TreePopupStep treePopupStep) {
        return null;
    }

    //
    @NotNull
    @Override
    public ComponentPopupBuilder createComponentPopupBuilder(@NotNull JComponent jComponent, @Nullable JComponent jComponent1) {
        return null;
    }

    @NotNull
    @Override
    public RelativePoint guessBestPopupLocation(@NotNull DataContext dataContext) {
        return null;
    }

    @NotNull
    @Override
    public RelativePoint guessBestPopupLocation(@NotNull Editor editor) {
        return null;
    }

    @Override
    public boolean isBestPopupLocationVisible(@NotNull Editor editor) {
        return false;
    }

    @Override
    public Point getCenterOf(JComponent jComponent, JComponent jComponent1) {
        return null;
    }

    @NotNull
    @Override
    public List<JBPopup> getChildPopups(@NotNull Component component) {
        return null;
    }

    @Override
    public boolean isPopupActive() {
        return false;
    }

    @NotNull
    @Override
    public BalloonBuilder createBalloonBuilder(@NotNull JComponent jComponent) {
        return null;
    }

    @NotNull
    @Override
    public BalloonBuilder createDialogBalloonBuilder(@NotNull JComponent jComponent, String s) {
        return null;
    }

    @NotNull
    @Override
    public BalloonBuilder createHtmlTextBalloonBuilder(@NotNull String s, @Nullable Icon icon, Color color, Color color1, @Nullable HyperlinkListener hyperlinkListener) {
        return null;
    }

    @NotNull
    @Override
    public BalloonBuilder createHtmlTextBalloonBuilder(@NotNull String s, MessageType messageType, @Nullable HyperlinkListener hyperlinkListener) {
        return null;
    }

    @NotNull
    @Override
    public JBPopup createMessage(String s) {
        return null;
    }

    @Nullable
    @Override
    public Balloon getParentBalloonFor(@Nullable Component component) {
        return null;
    }

    @Override
    protected PopupChooserBuilder.PopupComponentAdapter createPopupComponentAdapter(PopupChooserBuilder popupChooserBuilder, JList jList) {
        return null;
    }

    @Override
    protected PopupChooserBuilder.PopupComponentAdapter createPopupComponentAdapter(PopupChooserBuilder popupChooserBuilder, JTree jTree) {
        return null;
    }

    @Override
    protected PopupChooserBuilder.PopupComponentAdapter createPopupComponentAdapter(PopupChooserBuilder popupChooserBuilder, JTable jTable) {
        return null;
    }
}
