package Annotations;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Random;

class Events {
    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    private static final int MAX_USER_ID = 999;
    private static final int NUM_RECORDS = 1_000_000;

    public static void generateEventsFile(String filename, int numRecords) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            Random random = new Random();
            for (int i = 0; i < numRecords; i++) {
                LocalDateTime timestamp = LocalDateTime.now().minusSeconds(random.nextInt(3600 * 24 * 365));
                String eventType = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];
                int userId = random.nextInt(MAX_USER_ID + 1);

                String event = String.format("%s|%s|%d", timestamp, eventType, userId);
                writer.println(event);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readEventsFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int iteration = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println("Iteration " + iteration + ": " + line);
                if (iteration % 200000 == 0) {
                    System.out.println("------------------------------");
                }
                iteration++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filename = "events.txt";


        generateEventsFile(filename, NUM_RECORDS);
        System.out.println("Events file generated.");


        readEventsFile(filename);
    }
}