package utils;

import precedente.Precedente;

public class SortUtil {

    public static <T> void sort(Precedente<T>[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // for utilizado para ordenar o vetor.
            for (int j = 0; j < arr.length - 1 - i; j++) {
            /* Se o valor da posição atual do vetor for maior que o proximo valor,
             então troca os valores de lugar no vetor. */
                if (arr[j].precedeA((T) arr[j+1]) > 0) {
                    Precedente<T> aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

}
