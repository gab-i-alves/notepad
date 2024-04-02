public class FunctionsEdit {
    GUI gui;

    public FunctionsEdit(GUI gui) {
        this.gui = gui;
    }

    public void undo() {
        gui.um.undo();
    }

    public void redo() {
        gui.um.redo();
    }
}
