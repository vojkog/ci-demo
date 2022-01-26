package cov;

public class CoverageDemo {


    public int doubleIfLessThan5(int param) {

        int input=param;

        if(param > 5 ) {
            System.out.println("Less than than 5.");
        }

        if(param==5) {
            System.out.println("Equal to 5.");
        }


        if(param < 5) {
            System.out.println("Less than 5. Doubling.");
            input=2*input;
        }

        return input;
    }


    public int doubleIfLessOrEqualThan5(int param) {

        int input=param;

        if(param > 5 ) {
            System.out.println("Less than than 5.");
        }


        if(param < 5 || param==5 ) {
            System.out.println("Less than 5. Doubling.");
            input=2*input;
        }

        return input;
    }


    public void looping(int param) {

        for (int i=0;i<param;i++) {
            System.out.println(i);
        }

    }

    public void switching(int param) {

        switch (param) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("default");
        }

    }
}
