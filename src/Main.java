import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> deals = new ArrayList<>();

        int answer = 1;

        while (answer != 0) {
            System.out.println("1:Add case \n2:Delete case \n3:Change case \n0:Exit");

            System.out.print("Put the action - ");
            answer = scanner.nextInt();

            switch (answer) {
                case 1:
                    System.out.print("Put the case you'd like to add - ");
                    String actionToDo = scanner.next();
                    deals.add(actionToDo);
                    System.out.println("Your to do list:\n ");

                    for (String i : deals) {
                        System.out.print((deals.indexOf(i) + 1)+ ":" + i + " ");
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("Put the serial number of the case you'd like to delete - ");
                    int index = scanner.nextInt() - 1;
                    deals.remove(index);
                    System.out.println("Your to do list:\n ");
                    for (String i : deals) {
                        System.out.print((deals.indexOf(i) + 1)+ ":" + i + " ");
                    }
                    System.out.println("\n");
                        break;
                        case 0:
                            System.out.println("Your to do list:\n ");
                            for (String i : deals) {
                                System.out.print((deals.indexOf(i) + 1) + ":" + i + " ");
                            }
                            System.out.println("\n");
                case 3:
                    System.out.print("Put the serial number of the case you'd like to change - ");
                    int indexToChange = scanner.nextInt() - 1;
                    System.out.print("Put the new case - ");
                    String changeCase = scanner.next();
                    deals.set(indexToChange,changeCase);
                    System.out.println("Your to do list:\n ");

                    for (String i : deals) {
                        System.out.print((deals.indexOf(i) + 1)+ ":" + i + " ");
                    }
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Wrong operation! Try again.");
                    break;
                    }
            }
        }
    }
