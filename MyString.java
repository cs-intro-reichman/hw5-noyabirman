// Source code is decompiled from a .class file using FernFlower decompiler.
public class MyString {
    public MyString() {
    }
 
    public static void main(String[] var0) {
       String var1 = "hello";
       System.out.println(countChar(var1, 'h'));
       System.out.println(countChar(var1, 'l'));
       System.out.println(countChar(var1, 'z'));
       System.out.println(spacedString(var1));
    }
 
    public static int countChar(String var0, char var1) {
       int var2 = 0;
 
       for(int var3 = 0; var3 < var0.length(); ++var3) {
          if (var0.charAt(var3) == var1) {
             ++var2;
          }
       }
 
       return var2;
    }
 
    public static boolean subsetOf(String var0, String var1) {
       if (var0.length() > var1.length()) {
          return false;
       } else {
          for(int var2 = 0; var2 < var0.length() - var1.length(); ++var2) {
             char var3 = var0.charAt(var2);
             int var4 = countChar(var0, var3);
             int var5 = countChar(var1, var3);
             if (var4 > var5) {
                return false;
             }
          }
 
          return true;
       }
    }
 
    public static String spacedString(String var0) {
       if (var0.length() == 0) {
          return "";
       } else {
          String var1 = "";
 
          for(int var2 = 0; var2 < var0.length() - 1; ++var2) {
             var1 = var1 + var0.charAt(var2) + " ";
          }
 
          var1 = var1 + var0.charAt(var0.length() - 1);
          return var1;
       }
    }
 
    public static String randomStringOfLetters(int var0) {
       String var1 = "";
 
       for(int var2 = 0; var2 < var0; ++var2) {
          char var3 = (char)(97 + (int)(Math.random() * 26.0));
          var1 = var1 + var3;
       }
 
       return var1;
    }
 
    public static String remove(String var0, String var1) {
       String var2 = "";
 
       for(int var3 = 0; var3 < var0.length(); ++var3) {
          char var4 = var0.charAt(var3);
          boolean var5 = false;
 
          for(int var6 = 0; var6 < var1.length(); ++var6) {
             if (var4 == var1.charAt(var6)) {
                var5 = true;
                break;
             }
          }
 
          if (!var5) {
             var2 = var2 + var4;
          }
       }
 
       return var2;
    }
 
    public static String insertRandomly(char var0, String var1) {
       int var2 = (int)(Math.random() * (double)(var1.length() + 1));
       String var3 = var1.substring(0, var2) + var0 + var1.substring(var2);
       return var3;
    }
 }
 