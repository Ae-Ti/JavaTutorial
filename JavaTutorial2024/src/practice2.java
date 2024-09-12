import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class practice2 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("A");
        myList.add("B");
        System.out.println(myList.get(0));
        ArrayList<String> myList2 = new ArrayList<>(Arrays.asList("c","d"));
        System.out.println(String.join(",", myList2));

        HashMap myMap = new HashMap(); //map의 제네릭은 string만 가능, 순서 존재하지 않음
        myMap.put("A","B");
        System.out.println(myMap.get("A"));

        HashSet mySet = new HashSet(Arrays.asList("1","2"));
    }
    static int count = 1; //static 키워드를 붙이면 전역 변수가 된다. 주로 메모리 효율보다는 값 공유를 위해 사용한다.
}

class animal{
    String name;
}

class bird extends animal{
    void setName(String naming){
        this.name = naming;
    }
    bird(String naming){
        this.setName(naming);
    }
}

//인터페이스는 구현체가 없다.
interface plant{
    String s();
}

class tree implements plant {
    public String s(){
        return "sweet";
    }
}

class gardener{
    void water(plant p){
        System.out.println("is"+p.s());
    }
}

// 하나의 class가 상속받을 수 있는 class는 하나 뿐이지만 implements 할 수 있는 인터페이스는 여러 개이다.
// implement를 통해 객체가 여러 자료형 타입을 가질 수 있게 되는데 이를 다형성이라고 한다.
// 인터페이스도 다른 인터페이스를 (여러 개) 상속받을 수 있다.