package com.technicaltest;

public class ReverseCase {

    public static void main(String[] args) {
        
        //-- try to pass this test
        final MyTest test = new MyTest();
        check("cba".equals(test.reverse(-1, "abc")), "1 pass");
        check("cc bb aa".equals(test.reverse(-1, "aa bb cc")), "2 pass");
        check("c b a".equals(test.reverse(0, "aa bb cc")), "3 pass");
        check("cc bb aa A ".equals(test.reverse(1, " A aaa bb cc")), "4 pass");
        check("ssap latigid ".equals(test.reverse(1, "a digital pass")), "5 pass");
        System.out.println("all complete");
        
    }
    
    static void check(boolean condition, String message) {
        if (!condition) {
            throw new IllegalStateException("wrong !");
        }
        System.out.println(message);
    }	
	
    //-- ONLY write your code inside this class
    private static final class MyTest {

        //-- never change this contract
        private String reverse(int duplicateLimit, String word) {
            
            int lengthWord = word.length();
            String resultWord = "";
            
            if(duplicateLimit == 0){
                
                String replaceWord = word.replace(" ", "");
                int lengthReplaceWord = replaceWord.length();
                int flagMessage = 0;
                
                //duplicate validation
                for (int i = 0; i < lengthReplaceWord; i++) {
                    for (int j = i+1; j < lengthReplaceWord; j++) {
                        Character a = replaceWord.charAt(i);
                        Character b = replaceWord.charAt(j);
                        
                        if(a.equals(b)){
                            flagMessage = 1;
                        }
                    }
                }
                
                if(flagMessage == 1){
                    System.out.println("Data is duplicate.");
                }else {
                    for (int i = lengthWord - 1; i >= 0; i--) {
                        resultWord = resultWord + word.charAt(i);
                    }
                }
                
            }else {
                
                for (int i = lengthWord - 1; i >= 0; i--) {
                    resultWord = resultWord + word.charAt(i);
                }
                
            }
            
            return resultWord;
            //write your logic here
        }
    }
    
}
