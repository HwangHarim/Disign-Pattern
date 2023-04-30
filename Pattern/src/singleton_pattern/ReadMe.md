# 📚 Singleton Pattern

## singleton Pattern 이란?
> 📌 오직 한의 인스턴스만 가지는 패턴   
> 

**EX**
- 데이터 베이스 연결 모듈에 많이 쓰임

**싱글톤이 아닌 클래스**
>```java
>public static void main(String[] args) {
>    Phone a = new Phone("apple",14);
>    Phone b = new Phone("apple",14);
>
>    System.out.println(a);
>    System.out.println(b);
>   // a != b
>    }
>    class Phone{
>        String name;
>        int version;
>        
>        public phone(String name,int version){
>            this.name = name;
>            this.version = version;
>        }
>    }
>```
> 입력 값이 같아도 서로 다른 객체가 생성된다.
> 

## 👉싱글톤으로 객체를 생성하는 법

---

**1. 단순한 메서드 호출**

```java
public class Singleton{
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return getInstance();
    }
}
``` 
thread1.java
```java
public class Ball{
    private static String ball = "농구공";
    
    private static void main(String[] agrs){
        Ball a=  new Ball();
        new Thread(()->{
            for(int i=0; i<10; i++){
                a.say("농구공")
            }
        }).start();
        
        new Thread(()->{
            for(int i=0; i<10;i++){
                a.say("야구공")
            }
        }).start();
        
        public void say(String type){
            ball = type;
            try {
                long sleep = (long) (Math.random() * 100);
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!ball.equals(type)) {
                System.out.println(type + " | " + ball);
            }
        }
    }
}
```