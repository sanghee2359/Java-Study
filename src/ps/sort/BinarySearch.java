package ps.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
// 임의의 N개의 숫자가 입력으로 주어집니다.
// N개의 수를 오름차순으로 정렬한 다음
// N개의 수 중 한 개의 수인 M이 주어지면

//이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.
public class BinarySearch {
    private int Search(int num, int value, int[] arr) {
        int answer = 0;
        // 정렬 먼저
        Arrays.sort(arr);

        for (int x : arr) {
            System.out.print(x+" ");
        }

        int lt = 0, rt = num-1;
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid] == value) {
                answer = mid+1; // mid는 배열 인덱스 번호이므로 +1
                break;
            }
            if(arr[mid] > value) rt = mid-1;
            else lt = mid+1;

        }
        return answer;
    }
    public static void main(String[] args) {
        BinarySearch O = new BinarySearch();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(); // 개수
        int value = in.nextInt(); // 찾으려는 값
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(O.Search(num, value, arr));

    }

}
