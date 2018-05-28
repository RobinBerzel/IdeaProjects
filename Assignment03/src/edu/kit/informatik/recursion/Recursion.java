package edu.kit.informatik.recursion;

import edu.kit.informatik.Terminal;

public class Recursion {

    public static void main(String args[]) {


        boolean running = true;

        while (running) {
            String[] input = Terminal.readLine().split(" ", 2);
            String[] params = null;
            if (input.length != 3) {


                params = input[1].split(";");
               int n = Integer.parseInt(input[0]);
               int a = Integer.parseInt(input[1]);
               int b = Integer.parseInt(input[2]);
                int[] output = new int[3];
               for (int i = 0; i>= n; i++) {
                   if (n >= 2) {

                       System.out.println(output[i]);
                   } else {

                       i = a * output[i-2] + b*output[i-2];
                       System.out.println(output[i]);

                   }
                }


            }

           /* switch (input[0]) {
                case "calc": {

                }
                case "quit": {
                    running = false;
                    break;
                }
                default:
                    Terminal.printError("unknown command.");
            }*/
        }
    }
}


