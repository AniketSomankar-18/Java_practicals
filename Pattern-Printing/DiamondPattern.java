class DiamondPattern{


void patternLogic1(int size){
int n = size;
        int mid = n / 2;

        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < n; j++) {
                if (j == mid - i || j == mid + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j == mid - i || j == mid + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

void patternLogic2(int size){

 int n = size;
        int mid = n / 2;

        for (int i = 0; i <= mid; i++) {
            for (int s = 0; s < mid - i; s++)
                System.out.print(" ");

            System.out.print("*");

            if (i > 0) {
                for (int s = 0; s < 2 * i - 1; s++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int s = 0; s < mid - i; s++)
                System.out.print(" ");

            System.out.print("*");

            if (i > 0) {
                for (int s = 0; s < 2 * i - 1; s++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

}

void patternLogic3(int size){

 int n = size;
        int left = n / 2;
        int right = n / 2;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (j == left || j == right)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

            if (i < n / 2) {
                left--;
                right++;
            } else {
                left++;
                right--;
            }
        }

}


 public static void main(String[] args) {
        DiamondPattern dp=new DiamondPattern();
        int s=9;
        dp.patternLogic1(s);
        System.out.print("\n-----------------\n");
        dp.patternLogic2(s);
        System.out.print("\n-----------------\n");
        dp.patternLogic3(s);
}

}

