package edu.kit.informatik.euler;

import edu.kit.informatik.Terminal;

public class EulerNumber {

    public static void main (String args[]) {
try {
        Calculation calculation = new Calculation();

        boolean running = true;
        while (running) {
            String[] input = Terminal.readLine().split(" ", 2);
            String[] params = null;
            if (input.length > 1) {
                params = input[1].split(" ");
            }

            switch (input[0]) {
                case "approximation": {
                    double end = Integer.parseInt(params[0]);
                    if (end < 0) {
                        Terminal.printError("please insert a positive number.");
                        break;
                    } else {
                        Terminal.printLine(calculation.euler(end));
                        break;
                    }
                }
                case "quit": {
                    running = false;
                    break;
                }
                default: {
                    Terminal.printError("unknown command.");
                    break;
                }

            }
        }


    }



catch(NullPointerException e) {

        }

    }

}
