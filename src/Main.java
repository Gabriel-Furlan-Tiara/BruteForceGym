import java.util.Scanner;
public class Main {

    private static Scanner s = new Scanner(System.in);
    private static BruteForce manager = new BruteForce();
    private static int IdGenerator = 1;

    public static void main(String[] args) {
        String option = "0";
        while (!option.equals("4")) {

            option = menu();

            if (option.equals("1")) {
                optionOne();
            } else if (option.equals("2")) {
                optionTwo();
            } else if (option.equals("3")) {
                optionThree();
            } else if (option.equals("4")) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println(" Invalid Option... Please try again.\n");
            }
        }
        s.close();
    }

    public static String menu() {
        System.out.println("      Welcome to Brute Force      ");
        System.out.println("1 - Register new member");
        System.out.println("2 - Add exercise to Workout Routine");
        System.out.println("3 - Check member's Workout Routine");
        System.out.println("4 - EXIT\n");
        System.out.print("Choose an option: ");

        return s.nextLine();
    }

    public static void optionOne() {
        System.out.println("\nRegistering New Member");
        System.out.print("Name: ");
        String name = s.nextLine();

        System.out.print("Email: ");
        String email = s.nextLine();

        System.out.print("Weight (kg): ");
        double weight = s.nextDouble();

        System.out.print("Height (m): ");
        double height = s.nextDouble();
        s.nextLine();

        Member newMember = new Member(IdGenerator, name, email, weight, height);
        manager.registerMember(newMember);

        System.out.println(" Member registered successfully! ID: " + IdGenerator + "\n");
        IdGenerator++;
    }

    public static void optionTwo() {
        System.out.println("\nAdding Exercise");
        System.out.print("Enter Member ID: ");
        int searchId = s.nextInt();
        s.nextLine();

        Member foundMember = manager.finderById(searchId);

        if (foundMember != null) {
            System.out.println("Member: " + foundMember.getName());
            System.out.println("Type (1 - Strength | 2 - Cardio): ");
            int type = s.nextInt();
            s.nextLine();

            if (type == 1 || type == 2) {
                System.out.print("Exercise Name: ");
                String exerciseName = s.nextLine();

                System.out.print("Muscle Group: ");
                String muscleGroup = s.nextLine();

                if (type == 1) {
                    System.out.print("Series: ");
                    int series = s.nextInt();
                    System.out.print("Reps: ");
                    int reps = s.nextInt();
                    System.out.print("Weight (kg): ");
                    double weightKg = s.nextDouble();
                    s.nextLine();

                    Exercise strength = new StrengthExercise(exerciseName, muscleGroup, series, reps, weightKg);
                    foundMember.addExercise(strength);
                    System.out.println("Strength exercise added!\n");

                } else if (type == 2) {
                    System.out.print("Minutes: ");
                    int minutes = s.nextInt();
                    s.nextLine();
                    System.out.print("Intensity (Low/Medium/High): ");
                    String intensity = s.nextLine();

                    Exercise cardio = new CardioExercise(exerciseName, muscleGroup, minutes, intensity);
                    foundMember.addExercise(cardio);
                    System.out.println("Cardio exercise added!\n");
                }
            } else {
                System.out.println("Invalid exercise type! Please choose 1 or 2.\n");
            }

        } else {
            System.out.println("Member not found.\n");
        }
    }

    public static void optionThree() {
        System.out.println("\nMember's Workout Routine");
        System.out.print("Enter Member ID: ");
        int searchId = s.nextInt();
        s.nextLine();

        Member foundMember = manager.finderById(searchId);

        if (foundMember != null) {
            System.out.println("\n----------------------------------");
            System.out.println("ROUTINE FOR: " + foundMember.getName().toUpperCase());
            System.out.println("----------------------------------");
            if (foundMember.getExercises().isEmpty()) {
                System.out.println("No exercises registered yet.");
            } else {
                for (Exercise w : foundMember.getExercises()) {
                    System.out.println(">> " + w.exhibitDetails());
                }
            }
            System.out.println("----------------------------------\n");
        } else {
            System.out.println("Member not found.\n");
        }
    }
}