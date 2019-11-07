/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author 18114290041
 */
@Stateless
@LocalBean
 @Local(CarrinhoCompraLocal.class)
public class CarrinhoCompraStateless implements CarrinhoCompraLocal {
    
    private List<String> lista = new ArrayList<String>();

    @Override
    public void adicionarItem(String item) throws EJBException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> listarItens() throws EJBException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
