package com.ma;

import java.io.PrintStream;

public class HelloWorld
{
    // Static initializer; this is called when the class is loaded,
    // and before the main method is executed.
    static
    {
        // Get a reference to the current output stream
        final PrintStream out = System.out;
        // Create a new anonymous subclass of PrintStream.
        // This class inherits all methods from the regular PrintStream class,
        // including all print and println methods
        PrintStream newOut = new PrintStream(out)
        {
            // Override println(String) which will be used in the main method
            public void println(String s)
            {
                // Using the default print method, print "Hai " first, then s
                // When called from main, s will be "Sam!"
                print("Hai ");
                print(s);
                // Call super.println, which is the implementation from PrintStream
                super.println(" Bye.");
            }
        };
        // Set System.out to the new PrintStream
        System.setOut(newOut);
    }


    /**
     * @param args
     */
    public static void main(String[ ] args)
    {
        System.out.println("Sam!");
    }
}
