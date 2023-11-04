
package PackageDemo;

public class TestPackageDemo {
    public static void main(String[] args) {
        PackageDemo.Pack1.FirstDemo fd = new PackageDemo.Pack1.FirstDemo();
        PackageDemo.Pack2.FirstDemo fd1 = new PackageDemo.Pack2.FirstDemo();
        PackageDemo.Pack1.ThirdDemo fd3 = new PackageDemo.Pack1.ThirdDemo();
        PackageDemo.Pack2.SecondDemo fd2= new PackageDemo.Pack2.SecondDemo();
        
        fd.show();
        fd1.show();
        fd2.show1();
        fd3.accsessProtected();
    }
}
