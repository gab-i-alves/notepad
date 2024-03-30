public class Functions {
    GUI gui;

    public Functions(GUI gui) {
        this gui = gui;
    }

    public void newFile() {
        gui.textArea.setText("");
        gui.window.setTitle("New");
    }
}
