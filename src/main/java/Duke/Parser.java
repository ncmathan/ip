package Duke;

public class Parser {
    private boolean isExit;
    public Parser() {
        isExit=false;
    }
    public void parse(String str, TaskList list, Storage storage, Ui ui) {
            if (str.equals("bye")) {
                isExit = true;
            }
            else if (str.equals("list")) {
                list.list(ui);
            } else if (str.contains("unmark")) {
                list.mark(false, str, ui, storage);

            } else if (str.contains("mark")) {
                list.mark(false, str, ui, storage);
            } else if (str.startsWith("todo ")) {
                list.todo(str, ui, storage);
            } else if (str.startsWith("deadline ")) {
                list.deadline(str, ui, storage);
            } else if (str.startsWith("event ")) {
                list.event(str, ui, storage);
            } else if (str.startsWith("delete ")) {

                list.delete(str, ui, storage);

            } else {
                ui.handleError(new DukeException("\n____________________________________________________________\n" +
                        "☹ OOPS!!! I'm sorry, but I don't know what that means :-(\n" +
                        "____________________________________________________________"));
            }
    }
    public boolean isExit() {
        return isExit;
    }
}
