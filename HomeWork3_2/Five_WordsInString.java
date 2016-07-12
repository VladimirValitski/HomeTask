package homeWork3_2;

public class Five_WordsInString {
/* Algorithm determines whether all characters in the string are encountered once*/
	public static void main(String[] args) {
		String text = "алгоsfhs";//create string
		
		for (int i=0; i<text.length()-1; i++){
			for (int j=i+1; j<text.length(); j++){
				if (text.charAt(i) == text.charAt(j)){// compare symbols
					System.out.println("—имволы в строке повтор€ютс€");
					System.exit(0); // exit from  execution program
				}
				}
			
			}
		System.out.println("—имволы в строке встречаютс€ один раз");
		}
	

	}


