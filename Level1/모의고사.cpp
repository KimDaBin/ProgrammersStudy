#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    
    int score[3] = {0, };
    
    // 푸는 방식 배열 저장
    int first[5] = {1,2,3,4,5};
    int second[8] = {2,1,2,3,2,4,2,5};
    int third[10] = {3,3,1,1,2,2,4,4,5,5};
    
    // 정답 확인
    for(int i=0; i<answers.size(); i++){
        if(answers[i] == first[i%5])
            score[0]++;
        if(answers[i] == second[i%8])
            score[1]++;
        if(answers[i] == third[i%10])
            score[2]++;
    }
    
    // 가장 많은 문제를 맞힌 사람 확인
    int max_score = max(max(score[0],score[1]), score[2]);
    for(int i=0; i<3; i++){
        if(max_score == score[i])
            answer.push_back(i+1);
    }
    
    return answer;
}