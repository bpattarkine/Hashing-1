import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnaGramsTogether {

    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0) return new ArrayList<>();;

        HashMap<Long, List<String>> map = new HashMap<>();

        for(String s: strs){

            long p = calculatedP(s);

            if(!map.containsKey(p)){

                map.put(p, new ArrayList<>());

            }

            map.get(p).add(s);

        }

        return new ArrayList<>(map.values());

    }

    private long calculatedP(String s){

        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};

        long mult = 1;

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            mult = mult*(primes[c - 'a']);

        }

        return mult;

    }
       public List<List<String>> groupAnagrams2(String[] strs) {



       HashMap <String,List<String>> map = new HashMap<>();



       for(int i = 0; i < strs.length; i++){



           char[] c = strs[i].toCharArray();



           Arrays.sort(c);



           String sortedWord = String.valueOf(c);



           if(!map.containsKey(sortedWord)){



               map.put(sortedWord, new ArrayList<String>());



           }



           map.get(sortedWord).add(strs[i]);



       }



       return new ArrayList<List<String>>(map.values());



   }


}