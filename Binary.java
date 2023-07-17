import java.util.Scanner;
class Binary
{  
    public static void binarySearch(int a[], int first, int last, int key)
    {  
        int mid = (first + last)/2;  
        while( first <= last )
        {  
            if( a[mid] < key )
            {  
                first = mid + 1;     
            }
            else if ( a[mid] == key )
            {  
                System.out.println("Element is found at index: " + mid);  
                break;  
            }
            else
            {  
                last = mid - 1;  
            }  
            mid = (first + last)/2;  
        }  
    if ( first > last )
    {  
        System.out.println("Element is not found!");  
    }  
    }  
    public static void main(String args[])
    {  
        Scanner s=new Scanner(System.in);
        int key=s.nextInt(); 
        int[] a={15,25,35,45,55};
        int last=a.length-1;  
        binarySearch(a,0,last,key);     
    }  
}  
 