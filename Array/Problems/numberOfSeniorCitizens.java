package Array.Problems;

//https://leetcode.com/problems/number-of-senior-citizens/description/?envType=daily-question&envId=2024-08-01
public class numberOfSeniorCitizens {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
//        String[] details = {"1313579440F2036","2921522980M5644"};


        System.out.println(brute(details));
        System.out.println(better(details));
    }

    //    not optimal for multiple cases || TC => O(n) || SC => O(n)
    public static int brute(String[] details) {
        int ans = 0;
        for (var x : details) {
            int age = Integer.parseInt(x.substring(11, 13));
            if (age > 60) {
                ++ans;
            }
        }
        return ans;
    }

    public static int better(String[] details) {
        int count = 0;

        for (String el : details) {
            char s = el.charAt(11);
            char e = el.charAt(12);

            if (s > '6' || (s == '6' && e >= '0')) count++;
        }
        return count;
    }

}
