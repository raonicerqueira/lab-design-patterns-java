package gof;

import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Testes referentes ao Design Pattern Singleton:
//
//        SingletonLazy lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//        SingletonLazy lazy1 = SingletonLazy.getInstancia();
//        System.out.println(lazy1);
//
//        SingletonEager eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//        SingletonEager eager1 = SingletonEager.getInstancia();
//        System.out.println(eager1);
//
//        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder);
//        SingletonLazyHolder lazyHolder1 = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder1);




        // Testes referentes ao Design Pattern Strategy:

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
    }
}
