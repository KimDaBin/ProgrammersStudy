import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answerList = new ArrayList<>();
        
        // 두 개 뽑아서 더하기
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                int num = numbers[i] + numbers[j]; 
                // 겹치지 않는지 검사
                if(answerList.indexOf(num)<0)
                    answerList.add(num);
            }
        }
        
        // ArrayList -> int [] 변환
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        // 배열 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}