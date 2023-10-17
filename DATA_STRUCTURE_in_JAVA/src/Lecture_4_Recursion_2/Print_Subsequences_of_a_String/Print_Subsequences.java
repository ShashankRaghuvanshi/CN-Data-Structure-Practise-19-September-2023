package Lecture_4_Recursion_2.Print_Subsequences_of_a_String;

public class Print_Subsequences 
{
    public static void print_Subsequences(String input, String outputSoFar)
    {
        if(input.length() == 0)
        {
            System.out.println(outputSoFar);
            return;
        }

        //we choose not to include the first character
        print_Subsequences(input.substring(1), outputSoFar);
        print_Subsequences(input.substring(1), outputSoFar + input.charAt(0));

    }

    public static void print_Subsequences(String input)
    {
        print_Subsequences(input, "");
    }

    public static void main(String[] args) 
    {
        print_Subsequences("xyz");
    }
}
