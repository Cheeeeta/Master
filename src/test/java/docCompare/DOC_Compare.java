package docCompare;

public class DOC_Compare {
	
	
	
	public static void main(String[] args)throws Exception {
		String file1 = "D:\\New Data\\PDF\\Textbook1.pdf";

		String file2 = "D:\\New Data\\PDF\\Textbook2.pdf";

		String resultpdf = "D:\\New Data\\PDF\\Result\\result_1";

		String ignoreFile="C:\\Users\\chetan.patel\\Documents\\pdfcompare-master\\src\\test\\java\\de\\redsix\\pdfcompare\\ignore.conf";

	
		// .withIgnore(ignoreFile)
		
	//	new docComparator(file1,file2).compare().writeTo(resultpdf);

	//  new docComparator(file1, file2).withIgnore(ignoreFile).compare().writeTo(resultpdf);
	 
	 new docComparator(file1, file2, new CompareResultWithPageOverflow()).withIgnore(ignoreFile).compare().writeTo(resultpdf);
		

		System.out.println("Process Completed");

		 

		}

		 

}
