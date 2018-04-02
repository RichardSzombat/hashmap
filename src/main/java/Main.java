
public class Main {

    public static void main(String[] args) {
        HashedMap hashedMap =  new HashedMap<>();
        for (int i = 0; i <17; i++) {
            hashedMap.add(i,i);
        }
        System.out.println(hashedMap.getValue(2));
        hashedMap.remove(2);
        System.out.println(3);

    }
}