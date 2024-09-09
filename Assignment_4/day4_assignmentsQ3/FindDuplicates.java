public class FindDuplicates{

    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "orange", "apple", "grape", "banana", "melon"};
        String[] array2 = {"kiwi", "banana", "watermelon", "melon", "apple","watermelon"};

        System.out.println("Duplicate values in array 1:");
        findDuplicates(array1);
        System.out.println("Duplicate values in array 2:");
        findDuplicates(array2);
    }

    public static void findDuplicates(String[] array) {
        boolean foundDuplicate = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[i]);
                    foundDuplicate = true;
                    break;
                }
            }
        }
        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }
    }
}
