public class CalculatorExceptionFree {
    public static void main(String[] args){
        if(args.length!=3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        if(!isNumeric(args[0])){
            System.out.println("Wrong Input:" + args[0]);
            System.exit(0);
        }
        if (!isNumeric(args[0])){
            System.out.println("Wrong Input:" + args[2]);
            System.exit(0);
        }
        int operand1 = Integer.parseInt(args[0]);
        int operand2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (args[1].charAt(0)){
            case '+': result = operand1 + operand2; break;
            case '-': result = operand1 - operand2; break;
            case '*': result = operand1 * operand2; break;
            case '/': result = operand1 / operand2; break;
        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + '=' + result);
    }

    public static boolean isNumeric(String str){
        if (str == null || str.isEmpty()) return false;

        for (int i=0; i < str.length(); i++){
            if (i == 0 && str.charAt(i) == '-'){
                if (str.length() == 1) return false;
            }
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
