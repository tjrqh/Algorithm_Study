# [Bronze II] 수 정렬하기 - 2750 

[문제 링크](https://www.acmicpc.net/problem/2750) 

### 성능 요약

메모리: 14964 KB, 시간: 136 ms

### 분류

정렬, 구현

### 제출 일자

2024년 9월 26일 12:19:43

### 문제 설명

<p>N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.</p>

### 출력 

 <p>첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.</p>

### 문제 풀이
- sort 사용 방법
  ``` Java
    int a = Integer.parseInt(br.readLine());
    int[] arr = new int[a];
    for (int i = 0; i < a; i++) {
      int b = Integer.parseInt(br.readLine());
      arr[i] = b;
    }
    Arrays.sort(arr);

    for (int j : arr) {
      System.out.println(j);
    }
  }
  ```
- 버블소트 사용 방법
  ```Java
    int a = Integer.parseInt(br.readLine());
    int cnt =1;

    for(int i = 1; i < a; i++) {
      int b = 0;
      for(int j=i; j<a; j++){
        if (b < a) {
          b+= j;
        }
        else if(b == a) {
          cnt+=1;
          break;
        }
        else{
          break;
        }
      }
    }
    System.out.println(cnt);
  }
```
