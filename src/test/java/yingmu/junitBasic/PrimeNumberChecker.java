package yingmu.junitBasic;

/**
 * @author zhouxiang
 * @date 2019/10/24-16:40
 */
public class PrimeNumberChecker {
    public Boolean validate(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
