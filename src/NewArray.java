import com.company.mutable;

public class NewArray {
    public static int findInMiddle(String[] arr, String find){
        return arr[arr.length/2].indexOf(find);
    }
    public static int getRandomNumber(){
        int result = 10;
        result += (Math.random() * 10);
        return result;
    }
    // Traversing Arrays using for loops and while loops
    // Iteration statements can be used to access all the elements in an array.
    // This is called traversing the array; going through each element
    // Traversing an array with an indexed for loop or while loop requires elements to be accessed using their indices
    // Since the indices for an array start at 0 and end at # of elements -1
    // "off by one" errors are easy to make when traversing an array, resulting in an ArrayOutOfBoundsException being thrown

    public static void main(String[] args){
        // An array is just a list of elements or collection of data; primitive/reference(can be numbers, Strings, double, or booleans)
        // Starts with index 0 to the end of the length of the list
        // the last index of the element is the always list.length - 1 because index starts at 0
        //The size of an array is established at the time of creation and cannot be changed
        // Initializer lists can be used to create and initialize arrays
        // Square brackets ([]) are used to access and modify an element in a 1D array using an index
        // When an array is created using the keyword "new", all of its elements are initialized with a specific value based on the type of elements;
        // int is 0; double is 0.0; boolean is false, and with object reference being null
        int [] newArray = new int[5];/// how to make an array
//        double [] Array2 = new double[5];

//        String [] Names = {"Kelly", "Ember", "Phoenix"};
//        System.out.println(grades[3]);
//        Array2[1] = 2.34;
        newArray[3] = 44;
        newArray[3]++;
        System.out.println(newArray[3]);
//        newArray[4] = newArray[3] + 20;
//        System.out.println(newArray[4]);
//        mutable [] ListTwo;/// can also reference an object of a class in an array using the previous code
//        ListTwo = new mutable[5]; // this is initializing ListTwo with four elements; are going to be null because of new operator
//        ListTwo [1] = new mutable(33); //saves a mutable object into the array with value 33 at index 1
//        ListTwo[2] = new mutable(ListTwo[1].getValue() - 3);
//        ListTwo[3] = new mutable(ListTwo.length + ListTwo[2].getValue());
//        System.out.println(ListTwo[1].getValue());// accesses the value of the mutable object in the ListTwo array using an accessor method in the mutable class
//        System.out.println(ListTwo[2].getValue());
//        System.out.println(ListTwo[3].getValue());
//        System.out.println(grades[4]);
//        System.out.println(Names[1]);
//        System.out.println(getRandomNumber());

    }
}
