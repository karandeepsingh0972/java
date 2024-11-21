public class stringmethod {
    // string lenghth
    public static void main(String[] args) {
        String s1 = "42";
        // lenghth string method
        System.out.println(s1.length()); // prints: 2
        System.out.println("0 0".length()); // prints: 3
        // empty method
        System.out.println("".isEmpty()); // prints: true
        System.out.println(" ".isEmpty()); // prints: false
        String s2 = "abc42t%";
        // index method
        System.out.println(s2.indexOf(s1)); // prints: 3
        System.out.println(s2.indexOf("a")); // prints: 0
        System.out.println(s2.indexOf("xyz")); // prints: -1
        System.out.println("ababa".lastIndexOf("ba")); // prints: 3
        // matches method
        System.out.println("abc".matches("[a-z]+")); // prints: true
        System.out.println("ab1".matches("[a-z]+")); // prints: false
        String s3 = "abc";
        String s4 = "abc";
        String s5 = "acb";
        // equal method
        System.out.println(s3.equals(s4)); // prints: true
        System.out.println(s3.equals(s5)); // prints: false
        System.out.println("abc".equals(s3)); // prints: true
        System.out.println("abc".equals(s4)); // prints: false
        String s6 = "aBc";
        String s7 = "Abc";
        System.out.println(s6.equals(s7)); // prints: false
        System.out.println(s4.equalsIgnoreCase(s5)); // prints: true
        String s8 = "abc";
        String s9 = "abc";
        // content equal method
        System.out.println(s8.contentEquals(s9)); // prints: true
        System.out.println("abc".contentEquals(s9)); // prints: true
        String s10 = "abc42t%";
        String s11 = "42";
        String s12 = "xyz";
        // contain method
        System.out.println(s10.contains(s11)); // prints: true
        System.out.println(s10.contains(s12)); // prints: false
        String s13 = "abc42t%";
        String s14 = "42";
        // start method
        System.out.println(s13.startsWith(s14)); // prints: false
        System.out.println(s13.startsWith("ab")); // prints: true
        String s15 = "aBc";
        String s16 = "Abc";
        // compare method
        System.out.println(s15.compareTo(s16)); // prints: 32
        System.out.println(s15.compareToIgnoreCase(s16)); // prints: 0
        System.out.println(s15.codePointAt(0)); // prints: 97
        System.out.println(s16.codePointAt(0)); // prints: 65
        System.out.println("42".substring(0)); // prints: 42
        System.out.println("42".substring(1)); // prints: 2
        System.out.println("42".substring(2)); // prints:
        System.out.println("42".substring(3));
        System.out.println("42".substring(0)); // prints: 42
        System.out.println("42".substring(1)); // prints: 2
        System.out.println("42".substring(2)); // prints:
        System.out.println("42".substring(3));
        String s17 = "42";
        String s18 = "xyz";
        String newStr1 = s17.concat(s18);
        System.out.println(newStr1); // prints: 42xyz
        String newStr2 = s17 + s18;
        System.out.println(newStr2); // prints: 42xyz
        System.out.println("abcbc".replace("bc", "42"));
        // prints: a4242
        System.out.println("abcbc".replaceFirst("bc", "42"));
        // prints: a42bc
        System.out.println("ab11bcd".replaceAll("[a-z]+", "42"));
        // prints: 421142
        System.out.println("aBc".toLowerCase()); // prints: abc
        System.out.println("aBc".toUpperCase()); // prints: ABC
        String[] arr = "abcbc".split("b");
        System.out.println(arr[0]); // prints: a
        System.out.println(arr[1]); // prints: c
        System.out.println(arr[2]); // prints: c
        float f = 23.42f;
        String sf = String.valueOf(f);
        System.out.println(sf); // prints: 23.42
    }

}
