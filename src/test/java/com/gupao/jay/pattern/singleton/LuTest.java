package com.gupao.jay.pattern.singleton;

/**
 * @Author JAY
 * @Date 2019/6/2 9:50
 * @Description 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 **/
public class LuTest {

    public static void main(String[] args) {
        LuTest test = new LuTest();
        int x = -2147483412;
        System.out.println(test.reverse(x));
    }

    public int reverse(int x) {
        String str = String.valueOf(x);
        int pow = (int) Math.pow(2, 31);
        int leftLimit = pow * (-1);
        int rightLimit = pow - 1;
        System.out.println(leftLimit);
        System.out.println(rightLimit);
        char[] chars = str.toCharArray();
        int limit = 0;
        char[] newChars = null;
        if ('-' == chars[0]){
            newChars = new char[chars.length - 1];
            for (int i = 1; i < chars.length; i++){
                newChars[chars.length - 1 - i] = chars[i];
            }
            limit = leftLimit * (-1);
            return validateTargetNumber(newChars,limit) * (-1);
        }else {
            newChars = new char[chars.length];
            for (int i = 0; i < chars.length; i++){
                newChars[chars.length - 1 - i] = chars[i];
            }
            limit = rightLimit;
            return validateTargetNumber(newChars,limit);
        }
    }

    private int validateTargetNumber(char[] newChars, int limit) {
        String targetStr = String.valueOf(newChars);
        char[] rs = filterZero(targetStr);
        boolean isOut = checkOutInt(limit, rs);
        if (isOut){
            return 0;
        }
        String valueOf = String.valueOf(rs);
        return Integer.valueOf(valueOf);
    }

    private char[] filterZero(String targetStr) {
        if (targetStr.length() == 1 && "0".equals(targetStr)){
            char[] chars = new char[1];
            chars[0] = '0';
            return chars;
        }
        //过滤前面位置为0的数字
        char[] number = targetStr.toCharArray();
        //前面位置是0的长度
        int zeroLength = 0;
        for (int i = 0; i < number.length; i++){
            if ('0' != number[i]){
                break;
            }
            zeroLength++;
        }
        char[] rs = new char[number.length - zeroLength];
        for (int i = zeroLength; i < number.length; i++){
            rs[i - zeroLength] = number[i];
        }
        return rs;
    }

    private boolean checkOutInt(int limit, char[] rs) {

        //将过滤掉0之后的数字进行越界判断
        String limitStr = String.valueOf(limit);
        if (rs.length > limitStr.length()){
            //越界
            return true;
        }
        if (rs.length < limitStr.length()){
            //未越界
            return false;
        }
        //如果数字长度相等，则判断是否越界
        char[] limitChars = limitStr.toCharArray();
        for (int j = 0; j < limitChars.length; j++){
            //结果数字每个位置上的数字必须小于等于limit的每个位置上的数字
            if(rs[j] > limitChars[j]){
                //越界
                return true;
            }else if(rs[j] < limitChars[j]){
                //不越界
                return false;
            }
        }
        return false;
    }

}
