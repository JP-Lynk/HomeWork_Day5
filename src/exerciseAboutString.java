public class exerciseAboutString {
     // Bài 1
     public String CheckSubString(String mainString, String subString) {
        if (mainString.contains(subString)) {
            return String.format("Chuoi con '%s' co trong chuoi chinh '%s'.", subString, mainString);
        } else {
            return String.format("Chuoi con '%s' khong co trong chuoi chinh '%s.", subString, mainString);
        }
    }

    // Bài 2
    public int CountCharInString(String mainString, char searchChar) {
        int count = 0;
        for (int i = 0; i < mainString.length(); i++) {
            if (mainString.charAt(i) == searchChar) {
                count++;
            }
        }
        return count;
    }

    // Bài 3
    public String UpperCaseToString(String mainString) {
        return mainString.toUpperCase();
    }

    // Bài 4
    public String isPalindrome(String mainString) {
        int n = mainString.length();
        for (int i = 0; i < n / 2; i++) {
            if (mainString.charAt(i) != mainString.charAt(n - 1 - i)) {
                return String.format("Chuoi '%s' khong phai la chuoi doi xung.", mainString);
            }
        }
        return String.format("Chuoi '%s' la chuoi doi xung.", mainString);
    }
}

