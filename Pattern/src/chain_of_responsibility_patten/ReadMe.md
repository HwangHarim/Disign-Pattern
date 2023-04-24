# 📚 Chain of Responsibility

---
## 연쇄 책임 패턴(Chain of Responsibility)

***정의***
> 1. 명령 객체와 일련의 처리 객체를 포함하는 디자인 패턴이다. 각각의 처리 객체를 처리할 수 있는 연산의 집합이고, 체인 안의 처리 
> 객체가 핸들할 수 없는 명령은 다음 처리 객체로 넘겨진다.
> 2. 작동 방식은 새로운 처리 객체부터 체인의 끝까지 다시 반복된다.


---
## 🔨간단 구조

> ![간단구조](../img/chain_of_responsibility_patten_img/간단%20구조.jpg)
>
> - 작업자 간에 연결 고리를 구축하여 작업을 나누어 처리할 수 있다.
> - 체인 방식이기 때문에 작업에 참여하는 모든 객체가 서로 알 필요가 없다.
> - 오직 자신과 연결된 다음 작업자만 알면 되기 때문에 객체 간에 결합도를 낮추는 효과가 있다.
> - 런타임에서 연결 고리를 변경하거나 추가할 수 있어, 상황에 따라 실시간으로 기능을 추가하거나 삭제할 수 있다.
> - 보통 필터링을 구현할 때 이 설계 기법을 많이 사용한다. 

---

## 🔨구체적인 설계 구조

> ![구체적인 구조](../img/chain_of_responsibility_patten_img/구체적인%20구조.jpg)
> - 필터가 다음 필터를 호출하는 형태로 실행이 된다.

---

## ⛓️참고자료

---
- https://parkminseob.github.io/design%20pattern/chain-of-responsibility/
- https://k0102575.github.io/articles/2020-02/chain-of-responsibility-pattern