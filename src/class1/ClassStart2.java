package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] animalTypes = {"고양이", "강아지"};
        int[] animalAges = {5, 8};

        for(int i=0; i<animalTypes.length; i++) {
            System.out.println("종: " + animalTypes[i] + " 나이: " + animalAges[i]);
        }
    }
}

// 중복되는 코드를 제거하기 위해서 배열로 리팩토링 해준다.
// 하지만 배열을 사용해서 리팩토링을 하게 되면, 동물의 데이터가 여러 배열로 쪼개진다.
// 따라서 데이터를 조작하기가 불편하고 실수의 여지가 있다.