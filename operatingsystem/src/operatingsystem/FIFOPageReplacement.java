package operatingsystem;

import java.util.*;

public class FIFOPageReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of pages: ");
            int numPages = scanner.nextInt();

            System.out.print("Enter the number of frames: ");
            int numFrames = scanner.nextInt();

            LinkedList<Integer> pageQueue = new LinkedList<>();
            Set<Integer> frameSet = new HashSet<>();

            int pageFaults = 0;

            System.out.println("Enter the sequence of page references:");

            for (int i = 0; i < numPages; i++) {
                int page = scanner.nextInt();

                if (page < 0 || page >= numPages) {
                    System.out.println("Invalid page reference: " + page);
                    continue;
                }

                if (!frameSet.contains(page)) {
                    if (frameSet.size() < numFrames) {
                        frameSet.add(page);
                        pageQueue.add(page);
                    } else {
                        int removedPage = pageQueue.removeFirst();
                        frameSet.remove(removedPage);

                        frameSet.add(page);
                        pageQueue.add(page);

                        pageFaults++;
                    }

                    printFrames(pageQueue);
                }
            }

            System.out.println("\nNumber of page faults using FIFO: " + pageFaults);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }

    private static void printFrames(LinkedList<Integer> pageQueue) {
        System.out.print("Frames: ");
        for (int frame : pageQueue) {
            System.out.print(frame + " ");
        }
        System.out.println();
    }
}
