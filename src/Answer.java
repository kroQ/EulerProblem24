public class Answer {
	public static void main(String[] args) {

		Answer ans = new Answer();
		int counter = 0;
		for(long i = 123456789; i <= 9876543210L; i++){

			String inTable = Long.toString(i);
			char[] table = inTable.toCharArray();


			if(ans.czySiePowtarza(table) == false){
				counter++;
			}
			if(counter == 1_000_000){
				System.out.println(i); //Answer is 2783915460 it take 4 min. more or less
				break;
			}
		}
	}

	boolean czySiePowtarza(char[] table) {
		if(table.length == 9){ //because of zero is before any digit already
			for (char c : table) {
				if(c == '0') return true;
			}
		}
		boolean isDuplicate = false;

		for (int i = 0; i < table.length; i++) {

			for (int j = 0; j < table.length; j++) {

				if (i == j)
					continue;
				else {
					if (table[i] == table[j])
						isDuplicate = true;
				}
			}
			if (isDuplicate)
				break;
		}
		return isDuplicate == true ? true : false;
	}
}
