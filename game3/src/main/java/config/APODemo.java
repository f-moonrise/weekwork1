package config;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/9 19:36
 */
public class APODemo {

    public void befor(){
        System.out.println("开始切面权限校验");
    }

    public void af(int num){
        System.out.println("开启后置通知:" + num);
    }

    public void ar(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("开启环绕通知");
        Object proceed = joinPoint.proceed();
        System.out.println("开启环绕后通知");
    }

    public void th(Throwable thr){
        System.out.println("开启异常通知" + thr.getMessage());
    }

    public void zz(){
        System.out.println("无论怎样都开启最终通知");
    }

}
