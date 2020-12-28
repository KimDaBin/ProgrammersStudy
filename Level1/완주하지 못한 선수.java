import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion){
        String answer = "";
        // 오름차순으로 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0;i<completion.length;i++){
            // 선수 이름이 같은지 check
            if(!completion[i].equals(participant[i])){
                answer = participant[i];
                break;
            }
        }
        
        // 제일 마지막 선수가 완주하지 못했을 경우 check
        if(answer.equals(""))
            answer = participant[participant.length-1];
        
        return answer;
    }
}