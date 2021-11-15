package edu.matkosoric.command.line;

public class Walking {

    public static void main(String[] args) {

        // the result of executing this code is infinite loop,
        // if started like this "java edu.matkosoric.command.line.Walking left right stop"

        for (int i = 0; i < args.length; i++) {

            System.out.println(i + "). " + args[i]);

            switch (args[i]) {
                case "left":
                    continue;
                case "right":
                    i--;
                    continue;
                default:
                    break;

            }

        }

    }
}
