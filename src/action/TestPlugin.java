package action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import widget.MyDialogWrapper;

public class TestPlugin extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Project project = e.getData(PlatformDataKeys.PROJECT);

//        String txt = Messages.showInputDialog(project,
//                "What is your name?",
//                "Input your name",
//                Messages.getQuestionIcon());

//        final Editor mEditor = e.getData(PlatformDataKeys.EDITOR);
//        if (null == mEditor) {
//            return;
//        }
//        SelectionModel model = mEditor.getSelectionModel();
//        String selectedText = model.getSelectedText();
//
//
//        Messages.showMessageDialog(project,
//                "Hello, " + selectedText + "!\n I am glad to see you.",
//                "Information",
//                Messages.getInformationIcon());

       // testDialogWrapper();
    }


    private void testDialogWrapper(){
        MyDialogWrapper myDialogWrapper = new MyDialogWrapper();
        myDialogWrapper.show();

    }



}
