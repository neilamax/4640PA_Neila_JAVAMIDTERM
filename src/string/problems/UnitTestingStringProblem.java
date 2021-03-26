package string.problems;

public class UnitTestingStringProblem {

    public static void main(String[] args) {
        // Unit testing for all classes within this package should be implemented here
        System.out.println( Anagram.isAnagram("cat","act"));

        DetermineLargestWord.main("Human brain is a biological learning machine");
        Palindrome.isPalindrome("dad");
        Permutation.main("ABC");
        DuplicateWord.main("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
    }

}
