public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        int operand1 = 0;
        int operand2 = 0;
        int result = 0;

        try{
            operand1 = Integer.parseInt(args[0]);
        } catch(NumberFormatException e){
            System.out.println("Wrong Input: " + args[0]);
            System.exit(0);
        }

        try{
            operand2 = Integer.parseInt(args[2]);
        } catch(NumberFormatException e){
            System.out.println("Wrong Input: " + args[2]);
            System.exit(0);
        }

        switch (args[1].charAt(0)) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '.':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2!=0) result = operand1/operand2;
                else System.out.println("Error: Division by zero");
                break;
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
