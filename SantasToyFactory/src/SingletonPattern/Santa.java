package SingletonPattern;

import CommandPattern.Command;

public class Santa {

    private static Santa instance;
    private Command command;

    private Santa() {

    }

    public static Santa getInstance() {
        if (instance == null) {
            instance = new Santa();
        }
        return instance;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void WantedToy() {
        if (this.command == null) {
            System.out.println("No wanted toy");
            return;
        }
        this.command.ApplyCommand();
    }
}


