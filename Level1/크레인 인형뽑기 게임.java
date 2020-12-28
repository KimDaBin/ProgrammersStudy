import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        // Stack 형식으로 바구니 설정
        Stack<Integer> basket = new Stack<>();
        basket.push(0); // 아무것도 들어있지 않음
        
        // board 상태 배열 설정
        int[] boardCheck = new int[board.length];
        
        // board 상태 저장
        for(int colNum = 0; colNum<board.length; colNum++){
            boardCheck[colNum] = board.length;
            
            for(int rowNum = 0; rowNum<board.length; rowNum++){
                if(board[rowNum][colNum] != 0){
                    boardCheck[colNum] = rowNum;
                    break;
                }
            }
        }
        
        // moves 배열 순서에 맞춰 for문 loop
        for(int idx = 0; idx<moves.length; idx++){        
            // 해당 column에 인형이 남았는지 check
            if(boardCheck[moves[idx]-1] != board.length){
                // 같은 모양의 인형 두 개가 바구니에 연속해서 쌓인 경우 check
                if(basket.peek() == board[boardCheck[moves[idx]-1]][moves[idx]-1]){
                    boardCheck[moves[idx]-1]++;
                    basket.pop();
                    answer += 2;
                } else{
                    basket.push(board[boardCheck[moves[idx]-1]++][moves[idx]-1]);
                }
            }
        }
        
        return answer;
    }
}