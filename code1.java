import java.util.*;

class m2{
    float s1,s2,s3,s4,s5,s6;

    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks of Subject 1: ");
        s1 = input.nextFloat();
        System.out.print("Enter Marks of Subject 2: ");
        s2 = input.nextFloat();
        System.out.print("Enter Marks of Subject 3: ");
        s3 = input.nextFloat();
        System.out.print("Enter Marks of Subject 4: ");
        s4 = input.nextFloat();
        System.out.print("Enter Marks of Subject 5: ");
        s5 = input.nextFloat();
        System.out.print("Enter Marks of Subject 6: ");
        s6 = input.nextFloat();
    }

    float sum(){
        float sum = s1+s2+s3+s4+s5+s6;
        System.out.println("Sum is Calculated: "+ sum);
        return sum;
    }

    float avg(){
        float sum = s1+s2+s3+s4+s5+s6;
        float avg = sum/6;
        System.out.println("Average is Calculated: "+ avg);
        return avg;
    }

    
    void submk(){
        System.out.println("-------Subject Marks------");
        System.out.print("Subject 1: "+s1 + "\n");
        System.out.print("Subject 2: "+s2 + "\n");
        System.out.print("Subject 3: "+s3 + "\n");
        System.out.print("Subject 4: "+s4 + "\n");
        System.out.print("Subject 5: "+s5 + "\n");
        System.out.print("Subject 6: "+s6 + "\n");
    }
    
    void display(){
        submk();
        sum();
        avg();
    }
}



public class code1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        m2 S1 = new m2();
        S1.input();
        S1.display();
        S1.submk();


    }
}