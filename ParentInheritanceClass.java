public class ParentInheritanceClass {
    public int a = 12;
    public int b = 3;
    public int c;

    public void addition() {
        this.c = this.a + this.b;
        System.out.println("Inheritade parent addition: " + this.c);
    }
}
