# Singleton Design Pattern

**Singleton design pattern's purpose is create the object only a time and do not allow to make copy of it.**

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
**In this code block, we defined a class which's name "Languages" and static Instance property.**
**We blocked constructure because we don't want to create a lot of copy of that class.**
**synchronized keyword fixes the problem "what if 2 request came at the same time?" problem.**

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
**When we check the location in the ram of the instance, we will get result like that**
**org.test.Languages@8efb846**
**org.test.Languages@8efb846**
**org.test.Languages@8efb846**
**org.test.Languages@8efb846**
