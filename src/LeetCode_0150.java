import java.util.Stack;

/**
 * @author xiaoweii
 * @create 2026-03-08 11:36
 */
public class LeetCode_0150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> result = new Stack<>();
        // 先出栈是右操作数
        int rightNum;
        // 后出栈是左操作数
        int leftNum;
        // 保存计算结果
        int answer;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    rightNum = result.pop();
                    leftNum = result.pop();
                    answer = leftNum + rightNum;
                    break;
                case "-":
                    rightNum = result.pop();
                    leftNum = result.pop();
                    answer = leftNum - rightNum;
                    break;
                case "*":
                    rightNum = result.pop();
                    leftNum = result.pop();
                    answer = leftNum * rightNum;
                    break;
                case "/":
                    rightNum = result.pop();
                    leftNum = result.pop();
                    answer = leftNum / rightNum;
                    break;
                default:
                    answer = Integer.valueOf(token);
            }
            result.push(answer);
        }
        return result.pop();
    }
}
