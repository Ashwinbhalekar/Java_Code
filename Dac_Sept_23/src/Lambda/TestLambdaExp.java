package Lambda;
@FunctionalInterface
interface LengthFinder{
    int strLength(String str);
}
public class TestLambdaExp {
    public static void main(String[] args) {
        LengthFinder lf = (str) -> str.length();
        System.out.println("Length is "+ lf.strLength("Ashwin"));
    }
}
