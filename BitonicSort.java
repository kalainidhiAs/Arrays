package Array;

import java.util.Arrays;

public class BitonicSort {
    static void bitonicGenerator(long arr[], int n) {
        int oddlen = n / 2;
        System.out.println(oddlen);
        long oddarr[] = new long[oddlen];
        int indexOddarr = 0;

        int evenlen = n - oddlen;
        System.out.println(evenlen);
        long evenarr[] = new long[evenlen];
        int indexEvenarr = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                oddarr[indexOddarr] = arr[i];
                indexOddarr++;
            } else {
                evenarr[indexEvenarr] = arr[i];
                indexEvenarr++;
            }
        }

        Arrays.sort(oddarr);
        Arrays.sort(evenarr);
        System.out.println(Arrays.toString(oddarr));
        System.out.println(Arrays.toString(evenarr));

        long sortedarr[] = new long[n];
        for (int i = 0; i < indexEvenarr; i++) {
            sortedarr[i] = evenarr[i];
        }

        if (oddlen % 2 != 0 && n % 2 != 0) {
            int k = 0;
            for (int j = n - 1; j > indexOddarr; j--) {
                sortedarr[j] = oddarr[k];
                k++;
            }
        } else if (oddlen % 2 == 0 && n % 2 != 0) {
            int k = 0;
            for (int j = n - 1; j > indexOddarr; j--) {
                sortedarr[j] = oddarr[k];
                k++;
            }
        } else {
            int k = 0;
            for (int j = n - 1; j >= indexOddarr; j--) {
                sortedarr[j] = oddarr[k];
                k++;
            }

        }

        for (int i = 0; i < n; i++) {
            arr[i] = sortedarr[i];
        }

        System.out.println(Arrays.toString(oddarr));
        System.out.println(Arrays.toString(evenarr));
        System.out.println(Arrays.toString(sortedarr));
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        long arr[] = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int length = arr.length;
        bitonicGenerator(arr, length);

    }
}

/*
 * ArrayList<Long> a=new ArrayList();
 * for(int i=0;i<n;i++)
 * {
 * if(i%2==0)
 * a.add(arr[i]);
 * }
 * Collections.sort(a);
 * ArrayList<Long> aa=new ArrayList();
 * for(int i=0;i<n;i++)
 * {
 * if(i%2!=0)
 * aa.add(arr[i]);
 * }
 * 
 * Collections.sort(aa,Collections.reverseOrder());
 * a.addAll(aa);
 * ArrayList<Long> aaa=new ArrayList(a);
 * for(int i=0;i<aaa.size();i++)
 * {
 * arr[i]=aaa.get(i);
 * }
 */