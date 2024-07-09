public class App {
    public static void main(String[] args) throws Exception {
        exerciseAboutString app = new exerciseAboutString();

        // Bài 1
        System.out.println("Bai 1");
        String mainString = "Hello, welcome to Java programming!";
        String subString1 = "Java";
        String subString2 = "Python";
        System.out.println("Kiem tra chuoi con 'Java': " + app.CheckSubString(mainString, subString1)); 
        System.out.println("Kiem tra chuoi con 'Python': " + app.CheckSubString(mainString, subString2)); 

        // Bài 2
        System.out.println("\nBai 2");
        char searchChar1 = 'o';
        char searchChar2 = 'z';
        System.out.println("So lan xuat hien cua ky tu 'o': " + app.CountCharInString(mainString, searchChar1)); 
        System.out.println("So lan xuat hien cua ky tu 'z': " + app.CountCharInString(mainString, searchChar2)); 

        // Bài 3
        System.out.println("\nBai 3");
        System.out.println("Chuoi duoc in hoa la: " + app.UpperCaseToString(mainString)); 

        // Bài 4
        System.out.println("\nBai 4");
        String palindromeString = "radar";
        String nonPalindromeString = "hello";
        System.out.println("Chuoi: " + app.isPalindrome(palindromeString)); 
        System.out.println("Chuoi: " + app.isPalindrome(nonPalindromeString));
    }
}
