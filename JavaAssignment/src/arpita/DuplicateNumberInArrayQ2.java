package arpita;

public class DuplicateNumberInArray {
	
	// This function perform the operation how to find duplicate number.
	void findDuplicateNumber(int[] element)
	{
		
		for(int index1=0; index1<element.length; index1++)
		{
			for(int index2=index1+1; index2<element.length; index2++)
			{
				if(element[index1] == element[index2])
				{
					//display duplicate number in array
					System.out.println("Duplicate number in the given araay is: " + element[index1]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		// Creating the object of the InputOutputOperation class
		InputOutputOperation iop = new InputOutputOperation();
		
		// Take the input from user in array form
		int[] num = iop.takeInputFromUser();
		
		// creating the object of the class
		DuplicateNumberInArray duplicateNumber = new DuplicateNumberInArray();
		
		// To call the findDuplicateNumber method and provide input to that method.
		duplicateNumber.findDuplicateNumber(num);
		
	}

}
