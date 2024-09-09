package test2;


class TEST<T> {
 private T value;

 public TEST(T value) {
     this.value = value;
 }

 public T getValue() {
     return value;
 }

 public void setValue(T value) {
     this.value = value;
 }
}

public class GenericTest {
 public static void main(String[] args) {
     // TEST<String> 타입으로 객체 생성
     TEST<String> tt = new TEST<>("Hello, World!");
     System.out.println(tt.getValue());  // "Hello, World!" 출력
 }
}
