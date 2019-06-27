package com.siemens.jjzi;

/**
 * @author z00405ze
 */
public class DiamondOperator {
    public interface Example<T> {
        void aMethod();

        void bMethod();
    }

    public static void main(String[] args) {
        // 在9之前,下面的代码在编译的时候会报错:cannot use '<>' with anonymous inner classes
        Example example = new Example<>() {
            @Override
            public void aMethod() {
            }

            @Override
            public void bMethod() {
            }
        };
    }
}
