## 컴퍼지트 패턴이란

---
![Untitled](https://user-images.githubusercontent.com/76032947/178474412-798cc49a-aed7-4cc5-953b-5064fe3437b6.png)


- Component
    - 구체적인 부분(추상적이어야 한다.)
    - 즉 Leaf 클래스와 전체 에 해당하는 Composite 클래스에 공통 인터페이스를 정의
- Leaf
    - 구체적인 부분 클래스
    - Composite 객체의 부품으로 설정
- Composite
    - 전체 클래스
    - 복수 개의 Component를 갖도록 정의
    - 그러므로 복수 개의 Leaf, 심지어 복수 개의 Composite 객체를 부분으로 가질 수 있음.

## 장점

---

OCP를 지킬수 있다.(추가에 열려있는 patten)

---

## 예제
