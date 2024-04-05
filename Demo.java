public class Demo{

    public static void main(String a[])
    {
        // int nums[] = new int[4];  //single dimension array
        // nums[0] = 3;
        // nums[1] = 5;
        // nums[2] = 9;
        // nums[3] = 12;

        // for(int i=0;i<4;i++)
        // {
        // System.out.println(nums[i]);
        // }

        int nums[][] = new int[3][4]; //two dimensional array

        // for (int i=0;i<3;i++)
        // {
        //     for (int j=0;j<4;j++)
        //     {
        //         nums[i][j] = (int)(Math.random() * 100);
        //     }
        // }

        for (int n[] : nums)   //advanced for loop for to dimensional array
        {
            for (int m : n)
            {
                System.out.print(nums m + " ");
            }

            System.out.println();
        }
    }
}