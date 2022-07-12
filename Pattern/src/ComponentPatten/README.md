## 컴퍼지트 패턴이란

---

![컴퍼지트 패턴 구조](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fc702ee0-0060-4fe7-9241-e4017b052c0f/Untitled.png)

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