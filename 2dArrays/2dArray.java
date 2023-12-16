

class TwoDimensionalArray {
    public TwoDimensionalArray() {};

    public static void main(String[] args) {
        final int[] numberArray = new int[]{1, 2, 3, 4, 5};
        final int[][] numberArrayTwoDimensions = new int[10][10];

        for (int i = 0; i < numberArray.length; i++) {
            // i-th element of numberArray
            System.out.println(numberArray[i]);
        }

        for(int r = 0; r < numberArrayTwoDimensions.length; r++)
        {
            for(int c = 0; c<numberArrayTwoDimensions[r].length; c++)
            {
                final String integerString = Integer.toString(numberArrayTwoDimensions[r][c]);
                System.out.print(integerString + ' ');
            }
            System.out.println(" "); // no
        }

        // Write a method (function) 
        // Parameters:   iterations (int) - how many numbers to calculate
        // Output:   i-th number of fibonacci sequence

        // 1, 1, 2, 3,  5,  8, 13, 21 // so if this were in an array, I would shift 1 to the right, as an index, then add it, wait so, I can write a function on the fibbonaci sequence, even though I dont have a sequence to follow?, no like if I had none, no sequence, no list of numbers

        // fibonacci(3); // 2
        // fibonacci(5); // 5
        // fibonacci(7); // 13, i see

        final int fibonacciResult = fibonacci(3);
        System.out.println("Fibonacci Result:   " + Integer.toString(fibonacciResult));
    }

    public int fibonacci(int iterations)
    {
        if (iterations == 1 || iterations == 2) return 1;
        
            
         int numberOne = 1;
         int numberTwo = 1;   
        int result; 
        for(int i = 0; i<(iterations-2); i++)
        {
          result = numberOne+numberTwo;
          result+= numberOne // oh mb, I thought we add onto it to get the next iteration
        }
    }

// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0
// 0 0 0 0 0