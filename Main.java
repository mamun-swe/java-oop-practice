/**
 * Mian
 */
public class Main {

    public static void main(String[] args) {
        PersonClass personInformation = new PersonClass();
        CalculationClass calculator = new CalculationClass();
        InstantVariableClass insVariable = new InstantVariableClass();
        LocalVariableClass localVariable = new LocalVariableClass();
        ChildInheritanceClass inheritadeChild = new ChildInheritanceClass();

        /** Person class methods */
        personInformation.personInformation("Abdullah Al Mamun", 26, 6);
        personInformation.personFamilyInfo();

        /** Calculation class methods */
        calculator.addition(10, 22);
        calculator.multiply(5, 3);

        /** Instant variable */
        insVariable.addition();
        System.out.println("value of a is: " + insVariable.a);
        System.out.println("value of b is: " + insVariable.b);

        /** Local variable */
        localVariable.addition();

        /** Static keyword */
        StaticKeywordClass.staticAddition();
        System.out.println("Static variable value: " + StaticKeywordClass.a);

        /** Inheritance */
        inheritadeChild.addition();
        System.out.println("Inheritade child a: " + inheritadeChild.a);
        System.out.println("Inheritade child b: " + inheritadeChild.a);
        System.out.println("Inheritade child c: " + inheritadeChild.c);
    }
}