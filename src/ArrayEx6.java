public class ArrayEx6 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        /** 버블 정렬 **/
        System.out.print("origin arr: ");
        for(int i=0; i<numArr.length; i++) {
            numArr[i] = (int)(Math.random()*10); // 0~9 까지 정수 저장
            System.out.print("["+numArr[i]+"]");
        }

        int tmp;
        boolean chg;

        for(int i=0; i<numArr.length-1; i++) {
            chg = false; // 버블 변경 초기화

            for(int j=0; j<numArr.length-i-1; j++) {
                if(numArr[j] > numArr[j+1]){
                    tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;

                    chg = true;
                }
            }

            if(chg == false) break;
        }

        System.out.println();

        System.out.print("change arr: ");
        for(int i=0; i<numArr.length; i++) {
            System.out.print("["+numArr[i]+"]");
        }
    }
}