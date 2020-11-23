
public class data{
	public static void main(String [] args){
		byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);
        System.out.println("Sequence - " + answer.toString());//Hello!
        System.out.println("Its size - " + answer.length());//6   OK
        System.out.println("Symbol under № 1 - " + answer.charAt(1));//e
        System.out.println("Subsequence - " + answer.subSequence(1, 5));//ello
//проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Jello!
    
	}
}
