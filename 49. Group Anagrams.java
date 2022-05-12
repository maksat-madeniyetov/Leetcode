class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String key = makeArray(s);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        List<List<String>> res = new ArrayList<>();
        res.addAll(map.values());
        return res;
    }
    private String makeArray(String s) {
        char[] arr = new char[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        return new String(arr);
    }
    // O (n * m)
}
