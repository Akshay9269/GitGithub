public class HelloWorld {

	public static void main(String[] args) {
		
String input="a02b13";
        String output="";
        String num="";


        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if (Character.isDigit(ch)){
                num=num+ch;
            }else {
                if (!num.isEmpty()) {
                    for (int j = 0; j < Integer.parseInt(num); j++) {
                        output = output + 1;
                    }
                }
                output=output+ch;
                num="";
            }
        }

        if (num.length()!=0){
            for (int k=0;k<Integer.parseInt(num);k++){
                output=output+1;
            }
        }

        System.out.println(output);

	}	
}
