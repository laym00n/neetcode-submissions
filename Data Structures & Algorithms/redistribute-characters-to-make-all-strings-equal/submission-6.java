class Solution {
    public boolean makeEqual(String[] words) {
        
        int len = words.length;

        int[] arr = new int[26];

        for (int i = 0; i < len; i++) {
            char[] charArr = words[i].toCharArray();
            for (char c : charArr) {
                arr[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                if (arr[i] % len == 0) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}