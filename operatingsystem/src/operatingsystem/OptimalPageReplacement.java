package operatingsystem;

	import java.util.*;

	public class OptimalPageReplacement {
		

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of frames: ");
	        int numberOfFrames = scanner.nextInt();

	        System.out.print("Enter the page reference string (e.g., 1 2 3 4): ");
	        scanner.nextLine(); // Consume the newline character
	        String[] pageReferences = scanner.nextLine().split("\\s+");

	        int[] frames = new int[numberOfFrames];
	        int pageFaults = 0;

	        for (int i = 0; i < pageReferences.length; i++) {
	            int page = Integer.parseInt(pageReferences[i]);

	            if (!contains(frames, page)) {
	                int index = findOptimalIndex(frames, pageReferences, i);
	                frames[index] = page;
	                pageFaults++;
	                printFrames(frames);
	            }
	        }

	        System.out.println("Total Page Faults: " + pageFaults);

	        scanner.close();
	    }

	    private static boolean contains(int[] array, int value) {
	        for (int num : array) {
	            if (num == value) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private static int findOptimalIndex(int[] frames, String[] pageReferences, int currentIndex) {
	        int index = -1;
	        int farthest = -1;

	        for (int i = 0; i < frames.length; i++) {
	            int j = currentIndex + 1;
	            while (j < pageReferences.length) {
	                if (Integer.parseInt(pageReferences[j]) == frames[i]) {
	                    if (j > farthest) {
	                        farthest = j;
	                        index = i;
	                    }
	                    break;
	                }
	                j++;
	            }

	            if (j == pageReferences.length) {
	                // If the page is not referenced anymore, choose it as the farthest
	                return i;
	            }
	        }

	        return index;
	    }

	    private static void printFrames(int[] frames) {
	        System.out.print("Frames: ");
	        for (int frame : frames) {
	            System.out.print(frame + " ");
	        }
	        System.out.println();
	    }
	}

