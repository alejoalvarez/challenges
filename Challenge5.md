Challenge 5: Valid Braces

# Description:
Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.

What is considered Valid?
A string of braces is considered valid if all braces are matched with the correct brace.

Examples
```sh
"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False
```

## Tests cases

```java
import co.com.alejolabs.MainApplication;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import static org.junit.jupiter.api.Assertions.*;

class MainApplicationTest {
    private MainApplication checker = new MainApplication();

    @Test
    void testValid() {
        assertTrue(checker.isValid1("()"));
        assertTrue(checker.isValid1("[]"));
        assertTrue(checker.isValid1("{}"));
        assertTrue(checker.isValid1("(){}[]"));
        assertTrue(checker.isValid1("([{}])"));
        assertTrue(checker.isValid1("({})[({})]"));
        assertTrue(checker.isValid1("(({{[[]]}}))"));
        assertTrue(checker.isValid1("{}({})[]"));
        assertTrue(checker.isValid2("()"));
        assertTrue(checker.isValid2("[]"));
        assertTrue(checker.isValid2("{}"));
        assertTrue(checker.isValid2("(){}[]"));
        assertTrue(checker.isValid2("([{}])"));
        assertTrue(checker.isValid2("({})[({})]"));
        assertTrue(checker.isValid2("(({{[[]]}}))"));
        assertTrue(checker.isValid2("{}({})[]"));
        assertTrue(checker.isValid3("()"));
        assertTrue(checker.isValid3("[]"));
        assertTrue(checker.isValid3("{}"));
        assertTrue(checker.isValid3("(){}[]"));
        assertTrue(checker.isValid3("([{}])"));
        assertTrue(checker.isValid3("({})[({})]"));
        assertTrue(checker.isValid3("(({{[[]]}}))"));
        assertTrue(checker.isValid3("{}({})[]"));
        assertTrue(checker.isValid4("()"));
        assertTrue(checker.isValid4("[]"));
        assertTrue(checker.isValid4("{}"));
        assertTrue(checker.isValid4("(){}[]"));
        assertTrue(checker.isValid4("([{}])"));
        assertTrue(checker.isValid4("({})[({})]"));
        assertTrue(checker.isValid4("(({{[[]]}}))"));
        assertTrue(checker.isValid4("{}({})[]"));
    }

    @Test
    void testInvalid2() throws Exception {
        assertEquals(false, checker.isValid1("[(])"));
        assertEquals(false, checker.isValid1("(}"));
        assertEquals(false, checker.isValid1("(})"));
        assertEquals(false, checker.isValid1(")(}{]["));
        assertEquals(false, checker.isValid1("())({}}{()][]["));
        assertEquals(false, checker.isValid1("(((({{"));
        assertEquals(false, checker.isValid1("}}]]))}])"));
        assertEquals(false, checker.isValid2("[(])"));
        assertEquals(false, checker.isValid2("(}"));
        assertEquals(false, checker.isValid2("(})"));
        assertEquals(false, checker.isValid2(")(}{]["));
        assertEquals(false, checker.isValid2("())({}}{()][]["));
        assertEquals(false, checker.isValid2("(((({{"));
        assertEquals(false, checker.isValid2("}}]]))}])"));
        assertEquals(false, checker.isValid3("[(])"));
        assertEquals(false, checker.isValid3("(}"));
        assertEquals(false, checker.isValid3("(})"));
        assertEquals(false, checker.isValid3(")(}{]["));
        assertEquals(false, checker.isValid3("())({}}{()][]["));
        assertEquals(false, checker.isValid3("(((({{"));
        assertEquals(false, checker.isValid3("}}]]))}])"));
        assertEquals(false, checker.isValid4("[(])"));
        assertEquals(false, checker.isValid4("(}"));
        assertEquals(false, checker.isValid4("(})"));
        assertEquals(false, checker.isValid4(")(}{]["));
        assertEquals(false, checker.isValid4("())({}}{()][]["));
        assertEquals(false, checker.isValid4("(((({{"));
        assertEquals(false, checker.isValid4("}}]]))}])"));
    }

}
```

## Solution 1
```java
public boolean isValid4(String brackets) {
        while(brackets.indexOf("{}")!=-1||brackets.indexOf("[]")!=-1||brackets.indexOf("()")!=-1) {
            brackets = brackets.replace("{}","");
            brackets = brackets.replace("[]","");
            brackets = brackets.replace("()","");
        }
        return brackets.isEmpty();
    }
```

## Solution 2

```java
public boolean isValid3(String s) {
        int x = s.length();
        s = s.replaceAll("\\(\\)|\\[\\]|\\{\\}","");
        return s.length() == x ? false : s.length() == 0 || isValid3(s);
    }
```

## Solution 3
```java
public boolean isValid2(String braces) {
        String b = braces;
        System.out.println(braces);
        for(int i=0;i<braces.length()/2;i++)
        {
            b = b.replaceAll("\\(\\)", "");
            b = b.replaceAll("\\[\\]", "");
            b = b.replaceAll("\\{\\}", "");
            if(b.length() == 0)
                return true;
        }
        return false;
    }
```

## olution 4
```java
public boolean isValid1(String braces) {
        Stack<Character> s = new Stack<>();
        for (char c : braces.toCharArray())
            if (s.size() > 0 && isClosing(s.peek(), c)) s.pop();
            else s.push(c);
        return s.size() == 0;
    }

    public boolean isClosing(char x, char c) {
        return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
    }
```
