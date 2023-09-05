public class ChildInheritanceClass extends ParentInheritanceClass {
    public void addition() {
        this.c = this.a - this.b;
        System.out.println("Result from inheritade child: " + this.c);
    }
}
