public class JavaArrayExample {
    public static void main(String args[]){
        String[] strings_array={"Java","PHP","Python","Android"};

        //accessing single item
        System.out.println("Item at Position : "+strings_array[2]);

        //printing all item of array using loop
        for (int i=0;i<strings_array.length;i++){
            System.out.println("For Loop Value at : "+i+" : "+strings_array[i]);
        }

        //printing all item using for each loop
        for(String data:strings_array){
            System.out.println("Value : "+data);
        }

        //integer array
        int[] number={1,2,3,4,5,6,7,8};
        for (int i=0;i<number.length;i++){
            System.out.println("Value : "+i+" is : "+number[i]);
        }

        //changing value of array
        strings_array[2]="C#";

        //printing Again all item using for each loop
        for(String data:strings_array){
            System.out.println("Value : "+data);
        }


        //2d Array
        String[][] twodArray={{"Java","PHP","Python"},{"Android","Laravel","Django"},{"Swing","Cake","Flask"}};
        //access single item
        System.out.println("Value at Position : 0 0 is : "+twodArray[0][0]);

        //printing all item of array
        for (int i=0;i<twodArray.length;i++){
            for (int k=0;k<twodArray[i].length;k++){
                System.out.print("Row : "+ i +" Column : "+k+" "+twodArray[i][k]);
            }
            System.out.print("\n");
        }

        int[][] matrix1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Sum of Matrix");
        for (int i=0;i<matrix1.length;i++){
            for (int j=0;j<matrix1[i].length;j++){
                int sum=matrix1[i][j]+matrix2[i][j];
                System.out.print(" "+sum+" , ");
            }
            System.out.println("\n");
        }
    }
}
