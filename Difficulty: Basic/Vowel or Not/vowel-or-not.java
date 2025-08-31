
// User function Template for Java
class Solution {
    String isVowel(char c) {
        // code here
        boolean vowels = false;
        if(c >='A' && c <= 'Z' || c >='a' && c <= 'z' ){
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowels = true ;
            }
            else{
                vowels = false ;
            }
        }
        if(vowels == true ){
            return "YES" ;
        }else{
            return "NO";
        }
    }
}
