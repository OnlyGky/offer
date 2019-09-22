package offer.offer_5;

public class P227_Test_45_1 {
	/*
	public String PrintMinNumber(int [] numbers) {
		if(numbers==null || numbers.length<=0)
			return "";
		ArrayList<String> list = new ArrayList<String>();
		for(int number:numbers)
			list.add(String.valueOf(number));
		Collections.sort(list,new Comparator<String>(){
			@Override
			public int compare(String s1,String s2){
				String a=s1+s2;
				String b=s2+s1;
				return a.compareTo(b);
			}
		});
		StringBuilder sb= new StringBuilder();
		for(String str:list)
			sb.append(str);
		return sb.toString();
	}
	 */
    public static String PrintMinNumber(int[] numbers) {
		String string = "";
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				int a = Integer.valueOf(numbers[i] + "" + numbers[j]);
				int b = Integer.valueOf(numbers[j] + "" + numbers[i]);
				if(a > b) {
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		for(int i = 0; i < numbers.length; i++) {
			string += String.valueOf(numbers[i]);
		}
		return string;
	}

	public static void main(String[] args) {
		int[] numbers = {3, 32, 321};
		String str = PrintMinNumber(numbers);
		System.out.println(str);
	}

}
