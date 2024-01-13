package recursion;

public class Recursion {
    public static int iterations = 5;

    public static void main(String[] args) {
        final Recursion recursionInstance = new Recursion();

        final int result = recursionInstance.countToRecursive(Recursion.iterations); // Should return 5

        if (result == Recursion.iterations) {
            System.out.println("Passed test successfully");
        } else {
            System.err.println("Test failed, returned value is not equal to iterations");
        }
        
    }
    
    public int countTo(int iterations) {
        int counter = 0;
        
        while(counter < iterations)
        {
            counter++;
        }

        return counter;
    }

    public int countToRecursive(int iterations) {
        return countToRecursiveHelper(iterations, 0);

    }

    public int countToRecursiveHelper(int iterations, int currentCount) {
        currentCount++;

        if(iterations == currentCount) return currentCount;

        
        // oh so we return it with the iterations, ah so we return both parameters back up to the first function I have a question, if this is passed back up, do you mean the countToRecursive or the countToRecursiveHelper al
        // recursion basically builds back up to its starting point? alr
        return countToRecursiveHelper(iterations, currentCount);
    }

    // iterations = 3
    // return countToRecursiveHelper(3, 0) -> return countToRecursiveHelper(3, 1) -> return 3 
    // yeah I will, yeah Ill try for now no, next time are we going over github? I'll just look it over and make small observations on each line, nah that'll be it ty
    // Function will call itself
    // Condition to stop calling itself
// wait im sorry did you ask a question, wouldnt a helper function make it more complicated?its fine current count
    
}
