# Singleton Design Pattern

**The purpose of Singleton Design Pattern is prevent creating multiple instance from the class.**

## Example


```java
package org.test;

public  class Languages {

    private static Languages Instance;

    private Languages() {};

    public static synchronized Languages getInstance() {
        if(Instance == null){
            Instance = new Languages();
            return Instance;
        }

        return Instance;

    }

}

```
**In this code block, we defined a class named "Languages" with a static Instance property.**
**We made constructure private becuase we want to prevent creating multiple instances of this class.**
**synchronized keyword handles "what if 2 request come at the same time?" problem.(thread safety)**

```java


package org.test;



public class Main {
    public static void main(String[] args) {

        System.out.println(Languages.getInstance());
        System.out.println(Languages.getInstance());
        System.out.println(Languages.getInstance());
        System.out.println(Languages.getInstance());

    }
}

```
**When we check the memory adresses of the instances, we will get the following results**
**org.test.Languages@8efb846**
**org.test.Languages@8efb846**
**org.test.Languages@8efb846**
**org.test.Languages@8efb846**

**All adresses are identical, it proves that only one object exists in memory.**
