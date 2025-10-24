# Comparação de Algoritmos de Ordenação

Trabalho prático – Estruturas de Dados  
Estudo e comparação entre **Comb Sort**, **Gnome Sort**, **Bucket Sort**,  
e os algoritmos clássicos: **Bubble Sort (com flag)**, **Selection Sort** e **Cocktail Sort**.

---

## Algoritmos implementados
- Comb Sort  
- Gnome Sort  
- Bucket Sort  
- Bubble Sort (com flag de parada)  
- Selection Sort  
- Cocktail Sort  

---

## Vetores utilizados

```java
int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
````
## Resultados obtidos

| Algoritmo              | Trocas (V1) | Interações (V1) | Trocas (V2) | Interações (V2) | Trocas (V3) | Interações (V3) |
| ---------------------- | ----------- | --------------- | ----------- | --------------- | ----------- | --------------- |
| **Comb Sort**          | 22          | 129             | 0           | 110             | 18          | 129             |
| **Gnome Sort**         | 78          | 176             | 0           | 20              | 190         | 400             |
| **Bucket Sort**        | 32          | 85              | 0           | 69              | 23          | 43              |
| **Bubble Sort (Flag)** | 78          | 180             | 0           | 19              | 190         | 190             |
| **Selection Sort**     | 18          | 190             | 0           | 190             | 10          | 190             |
| **Cocktail Sort**      | 78          | 162             | 0           | 37              | 190         | 190             |

# Ranking por desempenho

## Menos trocas:
| Vetor       | 1º                  | 2º             | 3º               |
| ----------- | ------------------- | -------------- | ---------------- |
| **Vetor 1** | Selection Sort (18) | Comb Sort (22) | Bucket Sort (32) |
| **Vetor 2** | Todos (0)           | -              | -                |
| **Vetor 3** | Selection Sort (10) | Comb Sort (18) | Bucket Sort (23) |

## Menos interações
| Vetor       | 1º               | 2º              | 3º                                           |
| ----------- | ---------------- | --------------- | -------------------------------------------- |
| **Vetor 1** | Bucket Sort (85) | Comb Sort (129) | Cocktail Sort (162)                          |
| **Vetor 2** | Bubble Sort (19) | Gnome Sort (20) | Cocktail Sort (37)                           |
| **Vetor 3** | Bucket Sort (43) | Comb Sort (129) | (empate) Selection / Bubble / Cocktail (190) |

# Conclusão

- O Bucket Sort apresentou o melhor desempenho geral, com menos interações na maioria dos casos.
- O Selection Sort teve poucas trocas, especialmente em vetores já quase ordenados.
- O Gnome Sort foi o menos eficiente em vetores decrescentes.
- O Comb Sort mostrou boa eficiência intermediária, sendo mais rápido que os métodos clássicos de comparação direta.
