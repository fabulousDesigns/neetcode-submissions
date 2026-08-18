class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String sorted = new String(s1);
        char[] s2 = t.toCharArray();
        Arrays.sort(s2);
        String sortedS2 = new String(s2);

        return sorted.equals(sortedS2);
    }
}
