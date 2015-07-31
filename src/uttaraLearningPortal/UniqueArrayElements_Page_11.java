package uttaraLearningPortal;

/**
 * 
 * @author sadhana.siddaraju
 *
 */
public class UniqueArrayElements_Page_11 {
	
	public int[] formUniqueArray(int[] a,int[] b){
		int length=(a.length+b.length);
		int counter=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					counter++;
			}
		}
		int[] newArray=new int[length-counter];
		newArray=a;
		for(int k=a.length;k<(length-counter);k++)
		{
			
		}
		
		
		return null;
		
	}
	
	
	public static void main(String[] args) {
		int[] a={1,4,2,5};
		int[] b={4,6,7,2};
		UniqueArrayElements_Page_11 uniqueArrayElements=new UniqueArrayElements_Page_11();
		uniqueArrayElements.formUniqueArray(a, b);
		
	}

}
