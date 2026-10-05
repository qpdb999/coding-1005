/*
# Java 생성자(Constructor) 활용 복습

오늘은 Java에서 객체를 생성할 때 사용하는
생성자의 활용 방법을 공부했다

생성자를 이용하면 객체를 만들면서
필요한 값을 전달하고 각 객체의 필드를
초기화할 수 있다는 것을 확인했다.

매개변수가 있는 생성자와
여러 객체를 생성하는 방법을 알아보았다.


생성자 활용

생성자는 객체가 생성될 때 호출되며,
객체의 필드를 초기화하는 데 활용할 수 있다.

생성자는 클래스 이름과 같아야 하며,
반환 자료형을 작성하지 않는다.

예시:

class Student {
    String name;
    int age;

    Student() {
        name = "이름 없음";
        age = 0;
    }
}

Student student = new Student();

위 코드에서는 Student 객체를 생성할 때
생성자가 실행되어 name과 age가 초기화된다.

매개변수가 있는 생성자

생성자에 매개변수를 사용하면
객체마다 다른 값을 전달할 수 있다.

예시:

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
}

Student student = new Student("철수", 17);

이렇게 객체를 생성할 때 이름과 나이를
직접 전달하여 필드를 초기화할 수 있다.

생성자에서 this. 활용

필드 이름과 매개변수 이름이 같다면
this.를 사용해 현재 객체의 필드를 구분할 수 있다.

예시:

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

여기서 this.name은 현재 객체의 필드이고,
오른쪽 name은 매개변수이다.

this.를 활용하면 같은 이름을 사용하더라도
필드와 매개변수를 명확하게 구분할 수 있다.

여러 객체 생성하기

하나의 클래스로 여러 객체를 만들면
각 객체가 서로 다른 데이터를 가질 수 있다.

예시:

Student student1 = new Student("철수", 17);
Student student2 = new Student("영희", 16);

student1과 student2는 같은 Student 클래스로
만들어졌지만 각각 다른 이름과 나이를 가진다.

이처럼 생성자는 여러 객체를 만들 때
각 객체에 필요한 값을 전달하는 데 활용된다.

생성자 활용 실습

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("철수", 17);
        Student student2 = new Student("영희", 16);

        student1.showInfo();
        student2.showInfo();
    }
}

실행 결과:

이름: 철수
나이: 17
이름: 영희
나이: 16

생성자로 각 객체의 정보를 초기화하고,
void 메서드로 저장된 정보를 출력했다.

이를 통해 생성자, this., 객체, 메서드를
하나의 프로그램에서 함께 활용할 수 있었다.

기본 생성자와 매개변수 생성자

기본 생성자:
매개변수가 없는 생성자이다.

Student() {
    name = "이름 없음";
}

매개변수 생성자:
값을 전달받아 객체를 초기화하는 생성자이다.

Student(String name) {
    this.name = name;
}

클래스에 생성자를 직접 작성하지 않으면
컴파일러가 기본 생성자를 제공한다.

하지만 생성자를 하나라도 직접 작성하면
컴파일러가 기본 생성자를 자동으로 제공하지 않는다.

복습하면서 알게 된 점

생성자는 객체를 만들 때 필요한 값을
초기화하는 데 사용된다는 것을 알게 되었다.

매개변수 생성자를 활용하면 객체마다
서로 다른 값을 설정할 수 있으며,
this.를 사용하면 필드와 매개변수를
명확하게 구분할 수 있다는 것을 확인했다.

하나의 클래스로 여러 객체를 만들고
각 객체의 데이터를 따로 관리할 수 있다는 점을
실제 코드를 통해 복습했다.

AI 활용 복습 문제

1. 생성자의 주요 역할은?

1. 반복문 실행
2. 객체의 초기화
3. 문자열 분리
4. 배열 정렬

정답: 2


2. 생성자의 이름은 무엇과 같아야 하는가?

1. 메서드 이름
2. 변수 이름
3. 클래스 이름
4. 객체 이름

정답: 3


3. 생성자에 대한 설명으로 올바른 것은?

1. 반환 자료형을 반드시 작성한다.
2. 클래스 이름과 같은 이름을 사용한다.
3. 반드시 static을 사용한다.
4. void를 반드시 작성한다.

정답: 2


4. 다음 코드에서 this.name의 의미는?

Student(String name) {
    this.name = name;
}

1. 매개변수 name
2. 현재 객체의 name 필드
3. 새로운 클래스
4. 새로운 생성자

정답: 2


5. 매개변수가 있는 생성자의 장점은?

1. 객체마다 다른 값을 전달할 수 있다.
2. 모든 객체의 값이 같아진다.
3. 객체를 만들 수 없게 된다.
4. 메서드를 삭제할 수 있다.

정답: 1


6. 다음 코드의 출력 결과는?

Student student = new Student("철수", 17);
student.showInfo();

showInfo()가 이름과 나이를 출력한다고 할 때,

1. 이름: 영희 / 나이: 16
2. 이름: 철수 / 나이: 17
3. 이름: null / 나이: 0
4. 오류가 반드시 발생한다.

정답: 2


7. 클래스에 생성자를 직접 작성하지 않았을 때 컴파일러가 제공하는 것은?

1. 기본 생성자
2. static 메서드
3. 반복문
4. 배열

정답: 1


8. 생성자를 하나라도 직접 작성한 경우에 대한 설명으로 올바른 것은?

1. 기본 생성자가 항상 자동으로 추가된다.
2. 생성자를 더 이상 사용할 수 없다.
3. 기본 생성자가 자동으로 제공되지 않을 수 있다.
4. 객체를 생성할 수 없다.

정답: 3
*/