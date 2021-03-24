/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author osmal
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer suma(int a, int b) {
        return (a+b);
    }

    @Override
    public Integer resta(int a, int b) {
        return (a-b);
    }

    @Override
    public Integer multiplicacion(int a, int b) {
        return (a*b);
    }

    @Override
    public Integer division(int a, int b) {
        return (a/b);
    }

    @Override
    public Integer modulo(int a, int b) {
        return (a%b);
    }

    @Override
    public Integer potencia(int a) {
        return (a*a);
    }

}
