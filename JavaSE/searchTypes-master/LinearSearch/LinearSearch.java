
package linearsearch;

/**
 *
 * @author Orkhan
 */
public class LinearSearch {

    public static int linearSearch(int[] array, int key){
        int size = array.length;
        for(int i = 0; i <= size; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arrayOther = {1,2,89,55,47,87};
        int searchKey = 2;
        System.out.println("Key "+searchKey+" found at index: "+linearSearch(arrayOther, searchKey));
        int[] arr2= {123,445,595,2134,41,421,304,190};
        searchKey = 421;
        System.out.println("Key "+searchKey+" found at index: "+linearSearch(arr2, searchKey));
    }
} 


