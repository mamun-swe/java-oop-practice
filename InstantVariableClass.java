public class InstantVariableClass {
    int a = 10;
    int b = 12;
    int c;

    public void addition() {
        this.c = this.a + this.b;
        System.out.println(this.c);
    }
}
