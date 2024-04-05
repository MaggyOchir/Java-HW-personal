package org.example.e93;

public class E93StringManipulations {
    public static void main(String[] args) {
        //Print out the position of the first occurrence of "c".
        //Print out the position of the first occurrence of " ".
        //Print out the position of the first occurrence of the variable target1.
        //Print out the position of the first occurrence of the variable target2.
        //4,11,6,-1
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";
int check=0;
int firstIndex=0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'c') {
                if(check==0){
                    i=firstIndex;
                }System.out.println(firstIndex);
                check++;
            } else if (str.charAt(i) == ' ') {
                System.out.println(i);{

            }
    }}}

/*for (int i=0; i<target1.length(); i++){
    if()
    System.out.println(target1.indexOf("d"));}
        for (int i=0; i<target2.length(); i++){
            System.out.println(target1.indexOf("d"));}


}
    }*/
/*int check = 0;
		int firstindex = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == 'c') {
				if (check == 0) {
					firstindex = i;
					System.out.println("first index: " + firstindex);
					check++;
				}
			}
		}

	}*/




