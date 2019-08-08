/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

/**
 *
 * @author 18114290041
 * @param <T>
 */
public interface BO<T> {
    
   public void validar(T entidade) throws NegocioException;
   public void lista() throws NegocioException;
   public void incluir(T entidade) throws NegocioException;
   public void alterar(T entidade) throws NegocioException;
   public void excluir(T entidade) throws NegocioException;
   public void consultar(T entidade) throws NegocioException;
   

   
   
    
}
